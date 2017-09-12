package com.ustcsoft.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.system.model.IsJuTiOfZhiQuanVO;
import com.ustcsoft.system.model.OrganizationVO;
import com.ustcsoft.system.model.SysOrgVO;
import com.ustcsoft.system.model.XZQHVO;

public interface SysOrgMapper {

	List<OrganizationVO> searchOrgTreeBusiness(@Param("org") OrganizationVO org);

	List<OrganizationVO> searchOrgTreeArea(@Param("org") OrganizationVO org);
	List<OrganizationVO> searchOrgTreeManager(@Param("org") OrganizationVO org);
	List<OrganizationVO> searchOrgListPage(@Param("org") OrganizationVO org, @Param("page") Page<OrganizationVO> page
		);

	List<XZQHVO> searchOrgXZTree();

	// TODO
	@Select("select * from M_org where parent_id = #{orgId}")
	List<SysOrgVO> findAllOrgInfo(String id);

	String findBusinessId(@Param("orgBusiness") String orgBusiness);

	String findMaxId(@Param("BusinessId") String BusinessId);

	void addOrgInfo(@Param("org") OrganizationVO org);

	void updateOrg(@Param("org") OrganizationVO org);

	void deleteOrg(@Param("businessId") String  businessId);

	String findReCode(@Param("regName") String regName);

	List<OrganizationVO> searchOrgBankList(@Param("org") OrganizationVO org,
			@Param("page") Page<OrganizationVO> page);

	void addBank(@Param("org") OrganizationVO org);

	void delBank(@Param("org") OrganizationVO org);


	String findMaxOrgId();

	List<OrganizationVO> searchOrgListAreaPage(@Param("org") OrganizationVO org,
			@Param("page") Page<OrganizationVO> pageVO);

	List<OrganizationVO> searchOrgTreePeizhi(@Param("org") OrganizationVO org);

	void setPeizhi(@Param("org") OrganizationVO org);

	String findSelfOrgId(@Param("areaId") String areaId);

	void delPeizhi(@Param("areaId") String areaId);

	List<OrganizationVO> searchOrgListIndustryPage(@Param("org") OrganizationVO org,
			@Param("page")	Page<OrganizationVO> pageVO);

	List<OrganizationVO> searchOrgTreeIndustry(@Param("org") OrganizationVO org);

	List<OrganizationVO> searchOrgTreePeizhiIndustry(@Param("org") OrganizationVO org);

	void setPeizhiIndustry(@Param("org") OrganizationVO org);

	void delPeizhiIndustry(@Param("industryId") String industryId);

	String searBusinessId(@Param("orgId") String orgId);

	String searAreaId(@Param("orgId") String orgId);

	String searIndustryId(@Param("orgId") String orgId);

	@Select("select * from M_ORG where org_id = #{orgId}")
	OrganizationVO selectByOrgId(@Param("orgId") String orgId);

	OrganizationVO searchOrg(@Param("org") OrganizationVO org);

	String seachOrgBusinessByBusinessId(@Param("searchId") String searchId);
	@Select("select ORG_ID from  M_ORG where industry_Id =#{industryId}")
	String findSelfOrgIdByIndustryId(@Param("industryId") String industryId);
	@Select("select BUSINESS_ID from  M_ORG where ORG_ID =#{orgId}")
	String findBusinessIdByOrgId(@Param("orgId") String orgId);
	@Select("select count(0) from  M_ORG where org_name =#{orgName}")
	int validataOrgName(@Param("orgName") String orgName);

	@Select("select count(0) from  M_ORG where org_name =#{orgName} and org_name!=(select org_name from M_ORG where org_id=#{orgId})")
	int validataOrgNameOfUpdate(@Param("orgName") String orgName,@Param("orgId") String orgId);
	@Select("select MANAGER_ID from  M_ORG where ORG_ID =#{orgId}")
	String searManagerId(@Param("orgId") String orgId);
	@Select("select  max(O.MANAGER_ID)  FROM  M_ORG O 	where  O.MANAGER_ID like '${managerId}%'")
	String findMaxManageId(@Param("managerId") String managerId);
	@Select("select org_name from  M_ORG where manager_id=#{searchManagerId}")
	String seachManagerByManagerId(@Param("searchManagerId") String searchManagerId);
	@Select("select org_id from m_org where business_id=#{businessId}")
	String findOrgIdByBusinessId(@Param("businessId") String businessId);





}
