package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class CateCodeValueVO extends BaseVO{
	private static final long serialVersionUID = -1896950550633188143L;
	/**
	 * 树的Id
	 */
	private String id;
	/**
	 * 树的父节点
	 */
	private String pid;
	/**
	 * 节点名称
	 */
	private String codeName;
	/**
	 * 行业类别
	 */
	private String cateCode;
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	

}
