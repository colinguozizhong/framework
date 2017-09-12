package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;


/**
 * 职权是否具体VO
 * @author lc
 *
 */
public class IsJuTiOfZhiQuanVO extends BaseVO{
	private static final long serialVersionUID = 6834399578058749863L;
	//职权配置ID
	private String  zhiQuanPZId;
	//orgid
	private String orgId;
	
	//职权种类id
	private String authTypeId;
	
	//是否具体
	private String isJuTi;
	//发文机关带字
	
	private String faWenJiGuanDaiZi;
	
	//案件起始值
	private String startId;

	public String getStartId() {
		return startId;
	}

	public void setStartId(String startId) {
		this.startId = startId;
	}

	public String getZhiQuanPZId() {
		return zhiQuanPZId;
	}

	public void setZhiQuanPZId(String zhiQuanPZId) {
		this.zhiQuanPZId = zhiQuanPZId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}



	public String getIsJuTi() {
		return isJuTi;
	}

	public void setIsJuTi(String isJuTi) {
		this.isJuTi = isJuTi;
	}

	public String getFaWenJiGuanDaiZi() {
		return faWenJiGuanDaiZi;
	}

	public void setFaWenJiGuanDaiZi(String faWenJiGuanDaiZi) {
		this.faWenJiGuanDaiZi = faWenJiGuanDaiZi;
	}

	public String getAuthTypeId() {
		return authTypeId;
	}

	public void setAuthTypeId(String authTypeId) {
		this.authTypeId = authTypeId;
	}
	
}
