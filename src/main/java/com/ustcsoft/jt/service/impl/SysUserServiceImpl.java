package com.ustcsoft.jt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mapper.SysOrgMapper;
import com.ustcsoft.jt.mapper.SysRoleMapper;
import com.ustcsoft.jt.mapper.SysUserMapper;
import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.jt.service.SysUserService;
import com.ustcsoft.jt.util.CommonUtils;
import com.ustcsoft.jt.util.MD5Util;
import com.ustcsoft.system.model.OrganizationVO;
import com.ustcsoft.system.model.SignDataVO;
import com.ustcsoft.system.model.SysUserRoleVO;
import com.ustcsoft.system.model.SysUserVO;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Resource
	private SysUserMapper sysUserMapper;

	@Resource
	private SysRoleMapper sysRoleMapper;

	@Resource
	private SysOrgMapper sysOrgMapper;

	/**
	 * 查询用户列表
	 */
	public Page<SysUserVO> findUserList(SysUserVO sysUser, UserVO userInfo,
			int page, int rows) {

		Page<SysUserVO> pageVO = Page.buildPageRequest(page, rows);
		List<SysUserVO> list = new ArrayList<SysUserVO>();
		// 1.判断查询方式 "" 01 02,如果为空则跳过该查询方式，如果为01则查询本单位的所有用户，如果为02 则查询该单位的下级单位
		// 查询本单位的的
		if (StringUtils.isEmpty(sysUser.getBusinessId())
				&& StringUtils.isEmpty(sysUser.getAreaId())
				&& StringUtils.isEmpty(sysUser.getIndustryId())) {
			OrganizationVO orgVo = sysOrgMapper.selectByOrgId(userInfo.getOrgId());
			sysUser.setBusinessId(orgVo.getBusinessId());
			sysUser.setAreaId(orgVo.getAreaId());
			sysUser.setIndustryId(orgVo.getIndustryId());
		}
		// 2.判断执法机构：为空则跳过查询所有，业务查询businessId 地区则查询areaId 行业则查询industryId
		sysUser.setSearchBusinessId(CommonUtils.getSearchId(sysUser.getBusinessId()));
		sysUser.setSearchAreaId(CommonUtils.getSearchId(sysUser.getAreaId()));
		sysUser.setSearchIndustryId(CommonUtils.getSearchId(sysUser.getIndustryId()));
		long rsum = sysRoleMapper.isAdmin(userInfo.getUserId().toString());
		if (rsum >= 1L) {
			list = sysUserMapper.selectOrgUserPage(sysUser, pageVO);
		} else {
			list = sysUserMapper.selectOrgUserNotAdminPage(sysUser, pageVO);
		}
		pageVO.setItems(list);
		return pageVO;
	}

	/**
	 * 增加用户
	 */
	public int addUser(SysUserVO sysUser) {
		String userName=sysUser.getUserName();
		int c1=sysUserMapper.validateUserName(userName);
		if(c1==0){
			String maxUserId = sysUserMapper.findMaxUserId();
			String userId = String.valueOf(Long.parseLong(maxUserId) + 1);
			sysUser.setUserId(userId);
			sysUser.setLoginType("1");
			sysUser.setUserPwd(MD5Util.MD5("888888"));
			sysUserMapper.insertSysUser(sysUser);
			// 给新增用户添加默认角色 固定角色Id ：1000000000000002
			String uid = sysUser.getUserId();
			String fid = "1000000000000002";
			SysUserRoleVO userRole = new SysUserRoleVO();
			userRole.setUserId(uid);
			userRole.setRoleId(fid);
			sysRoleMapper.insertSysUserRole(userRole);
			return 0;
		}else{
			return 1;
		}
		
	}

	/**
	 * 更新用户
	 */
	public int updateUser(SysUserVO sysUser) {
		int c=sysUserMapper.validateUserNameOfUpdate(sysUser.getUserName(),sysUser.getUserId());
		if(c==0){
			sysUserMapper.updateUser(sysUser);
			return 0;
		}else{
			return 1;
		}
		

	}

	/**
	 * 删除用户
	 */
	public void deleteUser(SysUserVO sysUser) {
		String[] userIds=sysUser.getUserId().split(",");
		for(int i=0;i<userIds.length;i++){
			sysUser.setUserId(userIds[i]);
			sysUserMapper.deleteSysUserRoleByUserId(sysUser);
			sysUserMapper.deleteSysUserMenuByUserId(sysUser);
			sysUserMapper.deleteSysUser(sysUser);
		}
		
	}

	/**
	 * 重置密码
	 */
	public void resetUser(SysUserVO sysUser) {
		String passWord = MD5Util.MD5("888888");
		sysUser.setUserPwd(passWord);
		String[] userIds=sysUser.getUserId().split(",");
		for(int i=0;i<userIds.length;i++){
			sysUser.setUserId(userIds[i]);
			sysUserMapper.resetPassword(sysUser);
		}
	}

	@Override
	public SysUserVO findUserByOrgId(String orgId) {
		return sysUserMapper.findUserByOrgId(orgId);
	}

}
