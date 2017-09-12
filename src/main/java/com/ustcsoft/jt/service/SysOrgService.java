package com.ustcsoft.jt.service;

import java.util.List;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.system.model.IsJuTiOfZhiQuanVO;
import com.ustcsoft.system.model.OrganizationVO;
import com.ustcsoft.system.model.XZQHVO;


public interface SysOrgService {

	List<OrganizationVO> searchOrgTree(String node,UserVO userinfo);

	Page<OrganizationVO> searchOrgList(OrganizationVO org, int page, int rows);

	List<XZQHVO> searchOrgXZTree(XZQHVO xzqh);

	int addOrgInfo(OrganizationVO org,List<IsJuTiOfZhiQuanVO> list,UserVO userInfo);

	int updateOrg(OrganizationVO org,List<IsJuTiOfZhiQuanVO> list,UserVO userInfo);

	void deleteOrg(String businessId);

	Page<OrganizationVO> searchOrgBankList(OrganizationVO org, int page,
			int rows);


	void addBank(OrganizationVO org);

	void delBank(OrganizationVO org);

	Page<OrganizationVO> searchOrgListArea(OrganizationVO org, int page,
			int rows);

	List<OrganizationVO> searchOrgTreePeizhi(String areaId);

	void setPeizhi(String areaId, String orgIds);

	void delPeizhi(String areaId);

	Page<OrganizationVO> initOrgListIndustry(OrganizationVO org, int page,
			int rows);

	List<OrganizationVO> searchOrgTreePeizhiIndustry(String industryId);

	void setPeizhiIndustry(String industryId, String orgIds);

	void delPeizhiIndustry(String industryId);

	OrganizationVO searchOrgById(String orgId);

	OrganizationVO searchOrgListNoPage(OrganizationVO org);



	



}
