package com.ustcsoft.jt.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.service.SysOrgService;
import com.ustcsoft.jt.service.SysRoleService;
import com.ustcsoft.jt.service.SysUserService;
import com.ustcsoft.system.model.IsJuTiOfZhiQuanVO;
import com.ustcsoft.system.model.OrganizationVO;
import com.ustcsoft.system.model.SysRoleVO;
import com.ustcsoft.system.model.SysUserVO;

import net.sf.json.JSONArray;

@RestController
public class SystemFormController extends AbstractRestController{
	@Resource
	private SysOrgService sysOrgService;
	@Resource
	private SysRoleService sysRoleService;
	
	@Resource
	private SysUserService sysUserService;

	/**
	 * 添加组织
	 * 
	 * @param org
	 * @param orgName
	 * @return
	 */
	@RequestMapping("deptorg/insertOrg.do")
	@ResponseBody
	public int insertOrg(OrganizationVO org, HttpServletResponse response) {
		response.setContentType("text/plain;charset=UTF-8");
		JSONArray jsonArray = JSONArray.fromObject(org.getIsJuTiOfZhiQuanJson());
		List<IsJuTiOfZhiQuanVO> list = (List<IsJuTiOfZhiQuanVO>) jsonArray
				.toCollection(jsonArray, IsJuTiOfZhiQuanVO.class);
		
		UserVO userInfo = getCurrentUser();
		return sysOrgService.addOrgInfo(org,list,userInfo);
	}

	
	@RequestMapping("deptorg/updateOrg.do")
	@ResponseBody
	public int updateOrg(OrganizationVO org) {
		JSONArray jsonArray = JSONArray.fromObject(org.getIsJuTiOfZhiQuanJson());
		List<IsJuTiOfZhiQuanVO> list = (List<IsJuTiOfZhiQuanVO>) jsonArray
				.toCollection(jsonArray, IsJuTiOfZhiQuanVO.class);
		
		UserVO userInfo = getCurrentUser();
		return sysOrgService.updateOrg(org,list,userInfo);
	}
	
	
	
	/**
	 * 新增角色/更新角色
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("sysRole/edit.do")
	@ResponseBody
	public int addRole(SysRoleVO sysRole) throws Exception {
		UserVO userInfo = getCurrentUser();
		return sysRoleService.editRole(sysRole, userInfo);
	}
	
	
	/**
	 * 增加用户
	 */
	@RequestMapping("sysUser/addUser.do")
	@ResponseBody
	public int addUser(SysUserVO sysUser) {
		return sysUserService.addUser(sysUser);

	}
	
	/**
	 * 更新用户
	 */
	@RequestMapping("sysUser/updateUser.do")
	@ResponseBody
	public int updateUser(SysUserVO sysUser) {
		return sysUserService.updateUser(sysUser);

	}
	
}
