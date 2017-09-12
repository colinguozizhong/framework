package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class SignDataVO extends BaseVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1069856823480653916L;
	
	/**
	 * 部门组织Id
	 */
	private String operatorOrgId;
	
	
	/**
	 * 签名类型
	 */
	private String signType;
	/**
	 * 工作流实例ID
	 */
	private Long entryId;
	/**
	 * 签名ID
	 */
	private String signId;
	/**
	 * 签名数据
	 */
	private String signData;
	
	/**
	 * 签章姓名
	 */
	private String signName;
	
	/**
	 * 创建人所属机构	
	 */
	private String createrOrgid;
	
	/**
	 * 创建人所属机构	
	 */
	private String createrOrgName;
	/**
	 * 创建人姓名	
	 */
	private String createrName;
	/**
	 * 标记当前用户是否有移除该授权签章的权限	
	 */
	private String deleteAuth;
	/**
	 * 被授权人
	 */
	private String userId;
	
	/**
	 * 执法证号
	 */
	private String zhiFaZhengHao;
	
	//数据类型
	private String dataType;
	//是否代签
	private String isDQ;
	//代签人姓名
	private String dqrXingMing;
	//代签人执法证号
	private String dqrZhiFaZhengHao;
	
	private String userDzqztp;
	/**
	 * 签章图片id
	 */
	private String qianZhangId;
	
	/**
	 * 组织表的业务ID
	 */
	private String businessId;
	
	/**
	 * 组织表的orgId
	 */
	private String orgId;
	
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOperatorOrgId() {
		return operatorOrgId;
	}
	public void setOperatorOrgId(String operatorOrgId) {
		this.operatorOrgId = operatorOrgId;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public Long getEntryId() {
		return entryId;
	}
	public void setEntryId(Long entryId) {
		this.entryId = entryId;
	}
	public String getSignId() {
		return signId;
	}
	public void setSignId(String signId) {
		this.signId = signId;
	}
	public String getSignData() {
		return signData;
	}
	public void setSignData(String signData) {
		this.signData = signData;
	}
	public String getSignName() {
		return signName;
	}
	public void setSignName(String signName) {
		this.signName = signName;
	}
	public String getCreaterOrgid() {
		return createrOrgid;
	}
	public void setCreaterOrgid(String createrOrgid) {
		this.createrOrgid = createrOrgid;
	}
	public String getCreaterOrgName() {
		return createrOrgName;
	}
	public void setCreaterOrgName(String createrOrgName) {
		this.createrOrgName = createrOrgName;
	}
	public String getCreaterName() {
		return createrName;
	}
	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}
	public String getDeleteAuth() {
		return deleteAuth;
	}
	public void setDeleteAuth(String deleteAuth) {
		this.deleteAuth = deleteAuth;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getZhiFaZhengHao() {
		return zhiFaZhengHao;
	}
	public void setZhiFaZhengHao(String zhiFaZhengHao) {
		this.zhiFaZhengHao = zhiFaZhengHao;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getIsDQ() {
		return isDQ;
	}
	public void setIsDQ(String isDQ) {
		this.isDQ = isDQ;
	}
	public String getDqrXingMing() {
		return dqrXingMing;
	}
	public void setDqrXingMing(String dqrXingMing) {
		this.dqrXingMing = dqrXingMing;
	}
	public String getDqrZhiFaZhengHao() {
		return dqrZhiFaZhengHao;
	}
	public void setDqrZhiFaZhengHao(String dqrZhiFaZhengHao) {
		this.dqrZhiFaZhengHao = dqrZhiFaZhengHao;
	}
	public String getUserDzqztp() {
		return userDzqztp;
	}
	public void setUserDzqztp(String userDzqztp) {
		this.userDzqztp = userDzqztp;
	}
	public String getQianZhangId() {
		return qianZhangId;
	}
	public void setQianZhangId(String qianZhangId) {
		this.qianZhangId = qianZhangId;
	}
	
	
}
