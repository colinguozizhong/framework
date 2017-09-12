package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class SysOrgVO extends BaseVO {
	private static final long serialVersionUID = 1L;
	private Long orgId;
	private String orgName;
	private String orgCode;
	private Long parentId;
	private String remark;
	private String orgLv;
	
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
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
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrgLv() {
		return orgLv;
	}
	public void setOrgLv(String orgLv) {
		this.orgLv = orgLv;
	}

}