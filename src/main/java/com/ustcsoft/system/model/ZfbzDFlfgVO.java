package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

/**
 * 法律法规版本管理 ZFBZ_D_FLFG
 * 
 * @author dongfengda
 * 
 */
public class ZfbzDFlfgVO extends BaseVO {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 法律法规ID
	 */
	private String falvFaGuiId;
	/**
	 * 法律法规版本ID
	 */
	private String flfgBanBenId;

	public String getFlfgBanBenId() {
		return flfgBanBenId;
	}

	public void setFlfgBanBenId(String flfgBanBenId) {
		this.flfgBanBenId = flfgBanBenId;
	}

	/**
	 * 法律类别
	 */
	private String falvLeiBie;
	/**
	 * 版本状态
	 */
	private String banBenZhuangTai;
	/**
	 * 名称
	 */
	private String mingCheng;
	/**
	 * 制定机关
	 */
	private String zhiDingJiGuan;
	/**
	 * 发布机关
	 */
	private String fabuJiGuan;
	/**
	 * 发布文号
	 */
	private String fabuWenHao;
	/**
	 * 发布日期
	 */
	private java.util.Date fabuRiQi;
	/**
	 * 实施日期
	 */
	private java.util.Date shiShiRiQi;
	/**
	 * 失效日期
	 */
	private java.util.Date shiXiaoRiQi;
	/**
	 * 实效性
	 */
	private String shiXiaoXing;
	/**
	 * 正文内容
	 */
	private String zhengWenNeiRong;
	/**
	 * 附件ID
	 */
	private String fujianId;
	/**
	 * 版本号
	 */
	private java.math.BigDecimal versionNo;
	/**
	 * 办理状态显示
	 */
	private String banBenZhuangTaiName;
	/**
	 * 法律类别名称
	 */
	private String leiBieMing;
	/**
	 * 更新人名
	 */
	private String updaterName;

	public String getBanBenZhuangTaiName() {
		return banBenZhuangTaiName;
	}

	public void setBanBenZhuangTaiName(String banBenZhuangTaiName) {
		this.banBenZhuangTaiName = banBenZhuangTaiName;
	}

	public String getLeiBieMing() {
		return leiBieMing;
	}

	public void setLeiBieMing(String leiBieMing) {
		this.leiBieMing = leiBieMing;
	}

	public String getUpdaterName() {
		return updaterName;
	}

	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName;
	}

	public String getFalvFaGuiId() {
		return falvFaGuiId;
	}

	public void setFalvFaGuiId(String falvFaGuiId) {
		this.falvFaGuiId = falvFaGuiId;
	}

	public String getFalvLeiBie() {
		return falvLeiBie;
	}

	public void setFalvLeiBie(String falvLeiBie) {
		this.falvLeiBie = falvLeiBie;
	}

	public String getBanBenZhuangTai() {
		return banBenZhuangTai;
	}

	public void setBanBenZhuangTai(String banBenZhuangTai) {
		this.banBenZhuangTai = banBenZhuangTai;
	}

	public String getMingCheng() {
		return mingCheng;
	}

	public void setMingCheng(String mingCheng) {
		this.mingCheng = mingCheng;
	}

	public String getZhiDingJiGuan() {
		return zhiDingJiGuan;
	}

	public void setZhiDingJiGuan(String zhiDingJiGuan) {
		this.zhiDingJiGuan = zhiDingJiGuan;
	}

	public String getFabuJiGuan() {
		return fabuJiGuan;
	}

	public void setFabuJiGuan(String fabuJiGuan) {
		this.fabuJiGuan = fabuJiGuan;
	}

	public String getFabuWenHao() {
		return fabuWenHao;
	}

	public void setFabuWenHao(String fabuWenHao) {
		this.fabuWenHao = fabuWenHao;
	}

	public java.util.Date getFabuRiQi() {
		return fabuRiQi;
	}

	public void setFabuRiQi(java.util.Date fabuRiQi) {
		this.fabuRiQi = fabuRiQi;
	}

	public java.util.Date getShiShiRiQi() {
		return shiShiRiQi;
	}

	public void setShiShiRiQi(java.util.Date shiShiRiQi) {
		this.shiShiRiQi = shiShiRiQi;
	}

	public java.util.Date getShiXiaoRiQi() {
		return shiXiaoRiQi;
	}

	public void setShiXiaoRiQi(java.util.Date shiXiaoRiQi) {
		this.shiXiaoRiQi = shiXiaoRiQi;
	}

	public String getShiXiaoXing() {
		return shiXiaoXing;
	}

	public void setShiXiaoXing(String shiXiaoXing) {
		this.shiXiaoXing = shiXiaoXing;
	}

	public String getZhengWenNeiRong() {
		return zhengWenNeiRong;
	}

	public void setZhengWenNeiRong(String zhengWenNeiRong) {
		this.zhengWenNeiRong = zhengWenNeiRong;
	}

	public String getFujianId() {
		return fujianId;
	}

	public void setFujianId(String fujianId) {
		this.fujianId = fujianId;
	}

	public java.math.BigDecimal getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(java.math.BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

}
