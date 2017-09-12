package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class SysTempletVO extends BaseVO {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String muBanId;
	
	private String hangYeType;
	
	private String wenShuName;
	
	private String wenShuId;
	
	private String muBanName;
	
	private String muBanContent;
	
	private String wenShuLeiBie;

	public String getMuBanId() {
		return muBanId;
	}

	public void setMuBanId(String muBanId) {
		this.muBanId = muBanId;
	}

	public String getHangYeType() {
		return hangYeType;
	}

	public void setHangYeType(String hangYeType) {
		this.hangYeType = hangYeType;
	}

	public String getWenShuName() {
		return wenShuName;
	}

	public void setWenShuName(String wenShuName) {
		this.wenShuName = wenShuName;
	}

	public String getWenShuId() {
		return wenShuId;
	}

	public void setWenShuId(String wenShuId) {
		this.wenShuId = wenShuId;
	}

	public String getMuBanName() {
		return muBanName;
	}

	public void setMuBanName(String muBanName) {
		this.muBanName = muBanName;
	}

	public String getMuBanContent() {
		return muBanContent;
	}

	public void setMuBanContent(String muBanContent) {
		this.muBanContent = muBanContent;
	}

	public String getWenShuLeiBie() {
		return wenShuLeiBie;
	}

	public void setWenShuLeiBie(String wenShuLeiBie) {
		this.wenShuLeiBie = wenShuLeiBie;
	}

}
