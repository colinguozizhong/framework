package com.ustcsoft.system.model;

import java.math.BigDecimal;

import com.ustcsoft.framework.vo.BaseVO;

public class ZfbzDYjmxVO extends BaseVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1691574840312251337L;
	// 依据明细ID
		private String yiJuMingXiId;
		// 依据明细版本Id
		private String yiJuMingXiBanBenId;
		// 职权项目版本ID
		private String zhiQuanXiangMuBanBenId;
		// 版本状态
		private String banBenZhuangTai;
		//程度等级
		private String chengDuDengJi;
		//程度等级内容
		private String chengDuDengJiNeiRong;
		//程度内容
		private String chengDuNeiRong;
		// 量化标准
		private String liangHuaBiaoZhun;
		// 固化标准
		private String guHuaBiaoZhun;
		// 备注
		private String beiZhu;
		// 版本号
		private BigDecimal banBenHao;
		//职权项目名称
		private String zqxmMingCheng;
		
		//各单位职权版本主键ID；
		private String gdwzqbbglId;
		/**
		 * 标准金额
		 */
		private BigDecimal biaoZhunJinE;
		private String banBenStatus;
		public String getYiJuMingXiId() {
			return yiJuMingXiId;
		}
		public void setYiJuMingXiId(String yiJuMingXiId) {
			this.yiJuMingXiId = yiJuMingXiId;
		}
		public String getYiJuMingXiBanBenId() {
			return yiJuMingXiBanBenId;
		}
		public void setYiJuMingXiBanBenId(String yiJuMingXiBanBenId) {
			this.yiJuMingXiBanBenId = yiJuMingXiBanBenId;
		}
		public String getZhiQuanXiangMuBanBenId() {
			return zhiQuanXiangMuBanBenId;
		}
		public void setZhiQuanXiangMuBanBenId(String zhiQuanXiangMuBanBenId) {
			this.zhiQuanXiangMuBanBenId = zhiQuanXiangMuBanBenId;
		}
		public String getBanBenZhuangTai() {
			return banBenZhuangTai;
		}
		public void setBanBenZhuangTai(String banBenZhuangTai) {
			this.banBenZhuangTai = banBenZhuangTai;
		}
		public String getChengDuDengJi() {
			return chengDuDengJi;
		}
		public void setChengDuDengJi(String chengDuDengJi) {
			this.chengDuDengJi = chengDuDengJi;
		}
		public String getChengDuDengJiNeiRong() {
			return chengDuDengJiNeiRong;
		}
		public void setChengDuDengJiNeiRong(String chengDuDengJiNeiRong) {
			this.chengDuDengJiNeiRong = chengDuDengJiNeiRong;
		}
		public String getChengDuNeiRong() {
			return chengDuNeiRong;
		}
		public void setChengDuNeiRong(String chengDuNeiRong) {
			this.chengDuNeiRong = chengDuNeiRong;
		}
		public String getLiangHuaBiaoZhun() {
			return liangHuaBiaoZhun;
		}
		public void setLiangHuaBiaoZhun(String liangHuaBiaoZhun) {
			this.liangHuaBiaoZhun = liangHuaBiaoZhun;
		}
		public String getGuHuaBiaoZhun() {
			return guHuaBiaoZhun;
		}
		public void setGuHuaBiaoZhun(String guHuaBiaoZhun) {
			this.guHuaBiaoZhun = guHuaBiaoZhun;
		}
		public String getBeiZhu() {
			return beiZhu;
		}
		public void setBeiZhu(String beiZhu) {
			this.beiZhu = beiZhu;
		}
		public BigDecimal getBanBenHao() {
			return banBenHao;
		}
		public void setBanBenHao(BigDecimal banBenHao) {
			this.banBenHao = banBenHao;
		}
		public String getZqxmMingCheng() {
			return zqxmMingCheng;
		}
		public void setZqxmMingCheng(String zqxmMingCheng) {
			this.zqxmMingCheng = zqxmMingCheng;
		}
		public String getGdwzqbbglId() {
			return gdwzqbbglId;
		}
		public void setGdwzqbbglId(String gdwzqbbglId) {
			this.gdwzqbbglId = gdwzqbbglId;
		}
		public BigDecimal getBiaoZhunJinE() {
			return biaoZhunJinE;
		}
		public void setBiaoZhunJinE(BigDecimal biaoZhunJinE) {
			this.biaoZhunJinE = biaoZhunJinE;
		}
		public String getBanBenStatus() {
			return banBenStatus;
		}
		public void setBanBenStatus(String banBenStatus) {
			this.banBenStatus = banBenStatus;
		}
		
		
}
