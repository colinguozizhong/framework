package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;


/**
 * 组织结构VO
 * @author lc
 *
 */
public class OrganizationVO extends BaseVO {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 组织机构ID
	 */
	private String orgId;
	private String[] ids;
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	/**
	 * 父ID
	 */
	private String parentId;
	/**
	 * 机构名称
	 */
	private String orgName;
	/**
	 * 案件起始编号
	 */
	private String caseNumber;
	/**
	 * 机构编码
	 */
	private String orgCode;
	/**
	 * 机构简称(发文机关带字)
	 */
	private String orgSimpleName;
	/**
	 * 机构说明
	 */
	private String remark;
	/**
	 * 负责人
	 */
	private String manager;
	/**
	 * 联系人
	 */
	private String contactPerson;
	/**
	 * 联系电话
	 */
	private String contactTel;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 单位编号
	 */
	private String bmbh;
	/**
	 * 行业类别
	 */
	private String tradeType;
	/**
	 * 是否独立执法主体
	 */
	private String duLiZhiFa;
	/**
	 * 机构职能
	 */
	private String func;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 网址
	 */
	private String website;
	/**
	 * 单位状态
	 */
	private String status;
	/**
	 * 单位级别
	 */
	private String orgLv;
	/**
	 * 上级业务组织ID
	 */
	private String parentBusinessId;
	/**
	 * 行政区域代码
	 */
	private String regCode;
	/**行政区域名称*/
	private String regName;
	/**
	 * 上级管理机构
	 */
	private String orgManage;
	private String orgManage1;
	private String orgManage2;
	/**
	 * 上级业务机构
	 */
	private String orgBusiness;
	private String orgBusiness1;
	private String orgBusiness2;
	private String pageType;
	/**
	 * 上级证件审批机构
	 */
	private String orgShenPi;
	private String orgShenPi1;
	private String orgShenPi2;
	/**
	 * 检测站号
	 */
	private String jianCeZhanHao;
	/**
	 * 是否显示县机构，0：不显示，1：显示
	 */
	private String viewCounty = "1";
	
	private String flag;
	private String flag2;
	
	private Integer paiXu;
	
	
	private String businessId;
	private String areaId;
	private String industryId;
	private String managerId;
	
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	private String pid;
	
	private Boolean checked;
	
	//查找Id
	private String searchId;
	
	/**
	 * 新增  实施主体编号
	 * @return
	 */
	private String bh;
	
	/**
	 * 新增处罚
	 * @return
	 */
	private String chufa;
	/**
	 * 新增许可
	 * @return
	 */
	private String xuke;
	
	/**
	 * 新增职权种类ID
	 * @return
	 */
	private String authTypeId;
	/**
	 * 新增发文机关带字
	 * @return
	 */
	private String faWenJiGuanDaiZi;
	
	private String isJuTiOfZhiQuanJson;
	
	public String getAuthTypeId() {
		return authTypeId;
	}
	public void setAuthTypeId(String authTypeId) {
		this.authTypeId = authTypeId;
	}
	public String getFaWenJiGuanDaiZi() {
		return faWenJiGuanDaiZi;
	}
	public void setFaWenJiGuanDaiZi(String faWenJiGuanDaiZi) {
		this.faWenJiGuanDaiZi = faWenJiGuanDaiZi;
	}
	public String getChufa() {
		return chufa;
	}
	public void setChufa(String chufa) {
		this.chufa = chufa;
	}
	public String getXuke() {
		return xuke;
	}
	public void setXuke(String xuke) {
		this.xuke = xuke;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public String getSearchId() {
		return searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	private boolean chkDisabled;
	
	
	public boolean getChkDisabled() {
		return chkDisabled;
	}
	public void setChkDisabled(boolean chkDisabled) {
		this.chkDisabled = chkDisabled;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getIndustryId() {
		return industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}
	public String getFlag2() {
		return flag2;
	}
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getOrgManage1() {
		return orgManage1;
	}
	public void setOrgManage1(String orgManage1) {
		this.orgManage1 = orgManage1;
	}
	public String getOrgManage2() {
		return orgManage2;
	}
	public void setOrgManage2(String orgManage2) {
		this.orgManage2 = orgManage2;
	}
	public String getOrgBusiness1() {
		return orgBusiness1;
	}
	public void setOrgBusiness1(String orgBusiness1) {
		this.orgBusiness1 = orgBusiness1;
	}
	public String getOrgBusiness2() {
		return orgBusiness2;
	}
	public void setOrgBusiness2(String orgBusiness2) {
		this.orgBusiness2 = orgBusiness2;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * 对应人民政府
	 */
	private String government;
	// VIEW
	/** 树ID */
	private String id;
	/** 树显示文字 */
	private String text;
	/**是否子节点*/
	private boolean leaf;
	public String getXiangMuId() {
		return xiangMuId;
	}
	public void setXiangMuId(String xiangMuId) {
		this.xiangMuId = xiangMuId;
	}
	/**执法评议_组织 项目ID*/
	private String xiangMuId;
	/**执法评议_组织 执法人员编号*/
	private String zfrybh;
	/**
	 * 执法评议_组织执法人员id数组
	 */
	private String[] zfrybhArray;
	/**
	 * 执法评议_组织执法人员id数组
	 */
	private String[] orgIdArray;
	
	/**
	 * 银行名称
	 */
	private String bankName;
	/**
	 * 账号
	 */
	private String accountNumber;
	/**
	 * 账号ID
	 */
	private String accountId;
	
	/**邮编*/
	private String youBian;
	
	private String roleType;
	
	/**
	  *行业id 
	  */
	 private String hangYeId;
	
	 
	 
	public String getHangYeId() {
		return hangYeId;
	}
	public void setHangYeId(String hangYeId) {
		this.hangYeId = hangYeId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String[] getOrgIdArray() {
		return orgIdArray;
	}
	public void setOrgIdArray(String[] orgIdArray) {
		this.orgIdArray = orgIdArray;
	}
	public String[] getZfrybhArray() {
		return zfrybhArray;
	}
	public void setZfrybhArray(String[] zfrybhArray) {
		this.zfrybhArray = zfrybhArray;
	}
	public String getZfrybh() {
		return zfrybh;
	}
	public void setZfrybh(String zfrybh) {
		this.zfrybh = zfrybh;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgSimpleName() {
		return orgSimpleName;
	}
	public void setOrgSimpleName(String orgSimpleName) {
		this.orgSimpleName = orgSimpleName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getFunc() {
		return func;
	}
	public void setFunc(String func) {
		this.func = func;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrgLv() {
		return orgLv;
	}
	public void setOrgLv(String orgLv) {
		this.orgLv = orgLv;
	}
	public String getParentBusinessId() {
		return parentBusinessId;
	}
	public void setParentBusinessId(String parentBusinessId) {
		this.parentBusinessId = parentBusinessId;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBmbh() {
		return bmbh;
	}
	public void setBmbh(String bmbh) {
		this.bmbh = bmbh;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getOrgManage() {
		return orgManage;
	}
	public void setOrgManage(String orgManage) {
		this.orgManage = orgManage;
	}
	public String getOrgBusiness() {
		return orgBusiness;
	}
	public void setOrgBusiness(String orgBusiness) {
		this.orgBusiness = orgBusiness;
	}
	public String getGovernment() {
		return government;
	}
	public void setGovernment(String government) {
		this.government = government;
	}
	public String getPageType() {
		return pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	
	public String getOrgShenPi() {
		return orgShenPi;
	}
	public void setOrgShenPi(String orgShenPi) {
		this.orgShenPi = orgShenPi;
	}
	public String getOrgShenPi1() {
		return orgShenPi1;
	}
	public void setOrgShenPi1(String orgShenPi1) {
		this.orgShenPi1 = orgShenPi1;
	}
	public String getOrgShenPi2() {
		return orgShenPi2;
	}
	public void setOrgShenPi2(String orgShenPi2) {
		this.orgShenPi2 = orgShenPi2;
	}
	public String getViewCounty() {
		return viewCounty;
	}
	public void setViewCounty(String viewCounty) {
		this.viewCounty = viewCounty;
	}
	public String getYouBian() {
		return youBian;
	}
	public void setYouBian(String youBian) {
		this.youBian = youBian;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getDuLiZhiFa() {
		return duLiZhiFa;
	}
	public void setDuLiZhiFa(String duLiZhiFa) {
		this.duLiZhiFa = duLiZhiFa;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getJianCeZhanHao() {
		return jianCeZhanHao;
	}
	public void setJianCeZhanHao(String jianCeZhanHao) {
		this.jianCeZhanHao = jianCeZhanHao;
	}
	public Integer getPaiXu() {
		return paiXu;
	}
	public void setPaiXu(Integer paiXu) {
		this.paiXu = paiXu;
	}
	public String getIsJuTiOfZhiQuanJson() {
		return isJuTiOfZhiQuanJson;
	}
	public void setIsJuTiOfZhiQuanJson(String isJuTiOfZhiQuanJson) {
		this.isJuTiOfZhiQuanJson = isJuTiOfZhiQuanJson;
	}
	
}