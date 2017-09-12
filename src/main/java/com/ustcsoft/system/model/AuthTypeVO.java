package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class AuthTypeVO extends BaseVO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1838016803993016316L;
	private String typeName;
	private String typeCode;
	private String typeId;
	private String typeBMId;
	private String flag;
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeBMId() {
		return typeBMId;
	}
	public void setTypeBMId(String typeBMId) {
		this.typeBMId = typeBMId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
}
