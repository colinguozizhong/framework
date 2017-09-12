package com.ustcsoft.jt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mapper.SysOrgMapper;
import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.jt.service.SysOrgService;
import com.ustcsoft.jt.util.CommonUtils;
import com.ustcsoft.system.model.IsJuTiOfZhiQuanVO;
import com.ustcsoft.system.model.OrganizationVO;
import com.ustcsoft.system.model.XZQHVO;

@Service
public class SysOrgServiceImpl implements SysOrgService {

	@Resource
	private SysOrgMapper sysOrgMapper;

	/**
	 * 检索组织树
	 */
	public List<OrganizationVO> searchOrgTree(String node, UserVO userinfo) {
		OrganizationVO org = new OrganizationVO();
		String orgId = userinfo.getOrgId();
		List<OrganizationVO> list = new ArrayList<OrganizationVO>();
		// 业务
		if (node.equals("3401000000000000")) {
			String businessId = sysOrgMapper.searBusinessId(orgId);
			org.setBusinessId(CommonUtils.getSearchId(businessId));
			list = sysOrgMapper.searchOrgTreeBusiness(org);
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setPid((CommonUtils.getParentId(list.get(i).getBusinessId())));
			}
		}
		// 地区
		else if (node.equals("3402000000000000")) {
			String areaId = sysOrgMapper.searAreaId(orgId);
			org.setAreaId(CommonUtils.getSearchId(areaId));
			list = sysOrgMapper.searchOrgTreeArea(org);
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setPid((CommonUtils.getParentId(list.get(i).getAreaId())));
			}
		} // 行业
		else if (node.equals("3403000000000000")) {
			String industryId = sysOrgMapper.searIndustryId(orgId);
			org.setIndustryId(CommonUtils.getSearchId(industryId));
			list = sysOrgMapper.searchOrgTreeIndustry(org);
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setPid((CommonUtils.getParentId(list.get(i).getIndustryId())));
			}
		} else if (node.equals("3404000000000000")) {
			String managerId = sysOrgMapper.searManagerId(orgId);
			org.setManagerId(CommonUtils.getSearchId(managerId));
			list = sysOrgMapper.searchOrgTreeManager(org);
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setPid((CommonUtils.getParentId(list.get(i).getManagerId())));
			}
		}
		// 管理
		return list;
	}

	/**
	 * 加载配置下级单位的树
	 */
	public List<OrganizationVO> searchOrgTreePeizhi(String areaId) {
		OrganizationVO org = new OrganizationVO();
		List<OrganizationVO> list = new ArrayList<OrganizationVO>();
		// 业务
		org.setSearchId(CommonUtils.getSearchId(areaId));
		org.setAreaId(areaId);
		list = sysOrgMapper.searchOrgTreePeizhi(org);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setPid((CommonUtils.getParentId(list.get(i).getBusinessId())));
		}

		return list;
	}

	/**
	 * 加载配置下级单位的树（行业）
	 */
	public List<OrganizationVO> searchOrgTreePeizhiIndustry(String industryId) {
		OrganizationVO org = new OrganizationVO();
		List<OrganizationVO> list = new ArrayList<OrganizationVO>();
		// 业务

		org.setIndustryId(CommonUtils.getSearchId(industryId));
		list = sysOrgMapper.searchOrgTreePeizhiIndustry(org);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setPid((CommonUtils.getParentId(list.get(i).getBusinessId())));
		}
		return list;
	}

	/**
	 * 检索组织列表
	 */
	public Page<OrganizationVO> searchOrgList(OrganizationVO org, int page, int rows) {
		Page<OrganizationVO> pageVO = Page.buildPageRequest(page, rows);
		List<OrganizationVO> list = sysOrgMapper.searchOrgListPage(org, pageVO);
		pageVO.setItems(list);
		return pageVO;
	}

	/**
	 * 获取组织列表(按地区)
	 */
	public Page<OrganizationVO> searchOrgListArea(OrganizationVO org, int page, int rows) {
		Page<OrganizationVO> pageVO = Page.buildPageRequest(page, rows);
		List<OrganizationVO> list = sysOrgMapper.searchOrgListAreaPage(org, pageVO);
		pageVO.setItems(list);
		return pageVO;
	}

	/**
	 * 获取组织列表(按行业)
	 */
	public Page<OrganizationVO> initOrgListIndustry(OrganizationVO org, int page, int rows) {
		Page<OrganizationVO> pageVO = Page.buildPageRequest(page, rows);
		List<OrganizationVO> list = sysOrgMapper.searchOrgListIndustryPage(org, pageVO);
		pageVO.setItems(list);
		return pageVO;
	}

	/**
	 * 检索行政区划的树
	 */
	public List<XZQHVO> searchOrgXZTree(XZQHVO xzqh) {
		xzqh.setFXZQHId("00");
		xzqh.setXZQHId("0");
		xzqh.setXZQHName("行政区域");
		List<XZQHVO> list = sysOrgMapper.searchOrgXZTree();
		list.add(xzqh);
		return list;
	}

	/**
	 * 添加组织
	 */
	public int addOrgInfo(OrganizationVO org, List<IsJuTiOfZhiQuanVO> list, UserVO userInfo) {
		int count = sysOrgMapper.validataOrgName(org.getOrgName());
		if (count == 0) {
			// 获取最大的上级单位的为父亲id孩子id的最大值(业务爸爸生了一个业务儿子)
			String businessId = CommonUtils.getSearchId(org.getBusinessId());
			String maxId = sysOrgMapper.findMaxId(businessId);
			maxId = maxId.substring(0, businessId.length() + 2);
			String id = String.valueOf(Long.parseLong(maxId) + 1);
			String busId = StringUtils.rightPad(id, org.getBusinessId().length(), "0");
			// 获取最大的上级单位的为父亲id孩子id的最大值(上级管理爸爸生了一个管理儿子)
			String managerId = CommonUtils.getSearchId(org.getManagerId());
			String maxManageId = sysOrgMapper.findMaxManageId(managerId);
			maxManageId = maxManageId.substring(0, managerId.length() + 2);
			String Mid = String.valueOf(Long.parseLong(maxManageId) + 1);
			String ManId = StringUtils.rightPad(Mid, org.getManagerId().length(), "0");

			String orgId = sysOrgMapper.findMaxOrgId();
			org.setOrgId(String.valueOf(Long.parseLong(orgId) + 1));
			org.setBusinessId(busId);
			org.setManagerId(ManId);
			sysOrgMapper.addOrgInfo(org);
			return 0;
		} else {
			return 1;
		}

	}

	/**
	 * 更新组织
	 */
	public int updateOrg(OrganizationVO org, List<IsJuTiOfZhiQuanVO> list, UserVO userInfo) {
		int count = sysOrgMapper.validataOrgNameOfUpdate(org.getOrgName(), org.getOrgId());
		if (count == 0) {
			if (org.getBusinessId() != null) {
				// TODO
				sysOrgMapper.updateOrg(org);
			}
			return 0;
		} else {
			return 1;
		}

	}

	/**
	 * 根据id 删除对应的组织
	 */
	public void deleteOrg(String businessId) {
		String[] businessIds = businessId.split(",");
		String delId = "";
		for (int i = 0; i < businessIds.length; i++) {
			delId = CommonUtils.getSearchId(businessIds[i]);
			sysOrgMapper.deleteOrg(delId);
		}

	}

	/**
	 * 根据选择的Id查询 银行的列表
	 */
	public Page<OrganizationVO> searchOrgBankList(OrganizationVO org, int page, int rows) {
		Page<OrganizationVO> pageVO = Page.buildPageRequest(page, rows);
		List<OrganizationVO> list = sysOrgMapper.searchOrgBankList(org, pageVO);
		pageVO.setItems(list);
		return pageVO;
	}

	/**
	 * 编辑银行
	 */
	public void addBank(OrganizationVO org) {
		sysOrgMapper.addBank(org);
	}

	/**
	 * 删除银行
	 */
	public void delBank(OrganizationVO org) {
		sysOrgMapper.delBank(org);

	}

	/**
	 * 设置配置下级单位
	 */
	public void setPeizhi(String areaId, String orgIds) {
		String[] ids = orgIds.split(",");

		// 如果是节点本身自己 则加0
		String selfOrgId = sysOrgMapper.findSelfOrgId(areaId);
		for (int i = 0; i < ids.length; i++) {
			OrganizationVO org = new OrganizationVO();
			if (ids[i].equals(selfOrgId)) {
				org.setOrgId(ids[i]);
				org.setAreaId(CommonUtils.getChildId(areaId, 0));
				sysOrgMapper.setPeizhi(org);
			} else {
				org.setOrgId(ids[i]);
				org.setAreaId(CommonUtils.getChildId(areaId, i + 1));
				sysOrgMapper.setPeizhi(org);
			}
		}

	}

	/**
	 * 设置配置下级单位（行业）
	 */
	public void setPeizhiIndustry(String industryId, String orgIds) {
		String[] ids = orgIds.split(",");

		// 如果是节点本身自己 则加0
		String selfOrgId = sysOrgMapper.findSelfOrgIdByIndustryId(industryId);
		for (int i = 0; i < ids.length; i++) {
			OrganizationVO org = new OrganizationVO();
			if (ids[i].equals(selfOrgId)) {
				org.setOrgId(ids[i]);
				org.setIndustryId(CommonUtils.getChildId(industryId, 0));
				sysOrgMapper.setPeizhiIndustry(org);
			} else {
				org.setOrgId(ids[i]);
				org.setIndustryId(CommonUtils.getChildId(industryId, i + 1));
				sysOrgMapper.setPeizhiIndustry(org);
			}
		}

	}

	/**
	 * 删除配置(地区)
	 */
	public void delPeizhi(String areaId) {
		String delId = CommonUtils.getSearchId(areaId);
		sysOrgMapper.delPeizhi(delId);
	}

	/**
	 * 删除配置(行业)
	 */
	public void delPeizhiIndustry(String industryId) {
		String delId = CommonUtils.getSearchId(industryId);
		sysOrgMapper.delPeizhiIndustry(delId);

	}

	@Override
	public OrganizationVO searchOrgById(String orgId) {

		return sysOrgMapper.selectByOrgId(orgId);
	}

	@Override
	public OrganizationVO searchOrgListNoPage(OrganizationVO org) {
		org = sysOrgMapper.searchOrg(org);
		String searchId = CommonUtils.getParentId(org.getBusinessId());
		String searchManagerId = CommonUtils.getParentId(org.getManagerId());
		String orgBusiness = sysOrgMapper.seachOrgBusinessByBusinessId(searchId);
		String orgManage = sysOrgMapper.seachManagerByManagerId(searchManagerId);
		org.setOrgBusiness(orgBusiness);
		org.setOrgManage(orgManage);
		return org;
	}

}
