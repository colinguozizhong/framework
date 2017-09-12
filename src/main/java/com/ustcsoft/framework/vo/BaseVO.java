package com.ustcsoft.framework.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 基本VO
 */
public class BaseVO implements Serializable{
	
	private static final long serialVersionUID = 2051472917667444164L;
	private String delFlg;
	private String creater;
	private Date createTime;
	private String updater;
	private Date updateTime;
	private String createrTimeStr;
	private String updaterTimeStr;
	private Long rowVersion;
	private String jsonStr;
	private String userOrgId;
	private String userDeptId;
	private SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getRowVersion() {
		return rowVersion;
	}

	public void setRowVersion(Long rowVersion) {
		this.rowVersion = rowVersion;
	}

	public String getJsonStr() {
		return jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}

	public void setCreaterTimeStr(String createrTimeStr) {
		this.createrTimeStr = createrTimeStr;
	}

	public void setUpdaterTimeStr(String updaterTimeStr) {
		this.updaterTimeStr = updaterTimeStr;
	}

	public String getCreaterTimeStr() {
		if (this.createTime != null) {
			return dateformat.format(getCreateTime());
		}
		return "";
	}

	public String getUpdaterTimeStr() {
		if (this.updateTime != null) {
			return dateformat.format(getUpdateTime());
		}
		return "";
	}

	public String getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(String userOrgId) {
		this.userOrgId = userOrgId;
	}

	public String getUserDeptId() {
		return userDeptId;
	}

	public void setUserDeptId(String userDeptId) {
		this.userDeptId = userDeptId;
	}
}