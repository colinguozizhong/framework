package com.ustcsoft.system.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ustcsoft.framework.vo.BaseVO;

public class KeyWordVO extends BaseVO{

	private static final long serialVersionUID = -205074496010322966L;
	//数据库字段
		private String zhuJianId;
		private String hangYeLeiBie;
		private String wenShuLeiBie;
		private String wenShuMing;
		private String biaoLeiBie;
		private String biaoMing;
		private String biaoMingDaiMa;
		private String creater;
		private Date createTime;
		private String updater;
		private Date updateTime;
		private String xuHao;
		private String  isSelect;
		private String guanJianZiDuan;
		private String guanJianZiMing;
		private String delFlag;
		private String guanJianZi;
		private String guanXiShuoMing;
		
		public String getZhuJianId() {
			return zhuJianId;
		}
		public void setZhuJianId(String zhuJianId) {
			this.zhuJianId = zhuJianId;
		}
		public String getHangYeLeiBie() {
			return hangYeLeiBie;
		}
		public void setHangYeLeiBie(String hangYeLeiBie) {
			this.hangYeLeiBie = hangYeLeiBie;
		}
		public String getWenShuLeiBie() {
			return wenShuLeiBie;
		}
		public void setWenShuLeiBie(String wenShuLeiBie) {
			this.wenShuLeiBie = wenShuLeiBie;
		}
		public String getWenShuMing() {
			return wenShuMing;
		}
		public void setWenShuMing(String wenShuMing) {
			this.wenShuMing = wenShuMing;
		}
		public String getBiaoLeiBie() {
			return biaoLeiBie;
		}
		public void setBiaoLeiBie(String biaoLeiBie) {
			this.biaoLeiBie = biaoLeiBie;
		}
		public String getBiaoMing() {
			return biaoMing;
		}
		public void setBiaoMing(String biaoMing) {
			this.biaoMing = biaoMing;
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
		public String getXuHao() {
			return xuHao;
		}
		public void setXuHao(String xuHao) {
			this.xuHao = xuHao;
		}
		public String getIsSelect() {
			return isSelect;
		}
		public void setIsSelect(String isSelect) {
			this.isSelect = isSelect;
		}
		public String getGuanJianZiDuan() {
			return guanJianZiDuan;
		}
		public void setGuanJianZiDuan(String guanJianZiDuan) {
			this.guanJianZiDuan = guanJianZiDuan;
		}
		public String getGuanJianZiMing() {
			return guanJianZiMing;
		}
		public void setGuanJianZiMing(String guanJianZiMing) {
			this.guanJianZiMing = guanJianZiMing;
		}
		public String getDelFlag() {
			return delFlag;
		}
		public void setDelFlag(String delFlag) {
			this.delFlag = delFlag;
		}
		public BigDecimal getRowVersion_Decimal() {
			return rowVersion_Decimal;
		}
		public void setRowVersion_Decimal(BigDecimal rowVersion_Decimal) {
			this.rowVersion_Decimal = rowVersion_Decimal;
		}
		private BigDecimal rowVersion_Decimal;
		/**
		 * @return biaoMingDaiMa
		 */
		public String getBiaoMingDaiMa() {
			return biaoMingDaiMa;
		}
		/**
		 * @param biaoMingDaiMa 要设置的 biaoMingDaiMa
		 */
		public void setBiaoMingDaiMa(String biaoMingDaiMa) {
			this.biaoMingDaiMa = biaoMingDaiMa;
		}
		
		public String getGuanJianZi() {
			return guanJianZi;
		}
		public void setGuanJianZi(String guanJianZi) {
			this.guanJianZi = guanJianZi;
		}
		/**
		 * @return guanXiShuoMing
		 */
		public String getGuanXiShuoMing() {
			return guanXiShuoMing;
		}
		/**
		 * @param guanXiShuoMing 要设置的 guanXiShuoMing
		 */
		public void setGuanXiShuoMing(String guanXiShuoMing) {
			this.guanXiShuoMing = guanXiShuoMing;
		}
		
}
