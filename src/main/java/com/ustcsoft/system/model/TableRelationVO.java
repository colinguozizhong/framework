package com.ustcsoft.system.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ustcsoft.framework.vo.BaseVO;

public class TableRelationVO extends BaseVO{

	private static final long serialVersionUID = -205074496010322966L;
	//数据库字段
	private String zhuJianId;
	private long xiTongBiaoMingId;
	private long xiTongBiaoMing;
	public long getXiTongBiaoMingId() {
		return xiTongBiaoMingId;
	}
	public void setXiTongBiaoMingId(long xiTongBiaoMingId) {
		this.xiTongBiaoMingId = xiTongBiaoMingId;
	}
	public long getXiTongBiaoMing() {
		return xiTongBiaoMing;
	}
	public void setXiTongBiaoMing(long xiTongBiaoMing) {
		this.xiTongBiaoMing = xiTongBiaoMing;
	}
	private String hangYeLeiBie;
	private String wenShuLeiBie;
	private String wenShuMing;
	private String biaoLeiBie;
	private String biaoMing;
	private String guanLianGuanXi;
	private String  guanXiShuoMing;
	public String getGuanXiShuoMing() {
		return guanXiShuoMing;
	}
	public void setGuanXiShuoMing(String guanXiShuoMing) {
		this.guanXiShuoMing = guanXiShuoMing;
	}
	private String creater;
	private Date createTime;
	private String updater;
	private Date updateTime;
	private BigDecimal rowVersion_Decimal;
	public String getZhuJianId() {
		return zhuJianId;
	}
	public void setZhuJianId(String string) {
		this.zhuJianId = string;
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
	public String getGuanLianGuanXi() {
		return guanLianGuanXi;
	}
	public void setGuanLianGuanXi(String guanLianGuanXi) {
		this.guanLianGuanXi = guanLianGuanXi;
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
	
	public BigDecimal getRowVersion_Decimal() {
		return rowVersion_Decimal;
	}
	public void setRowVersion_Decimal(BigDecimal rowVersion_Decimal) {
		this.rowVersion_Decimal = rowVersion_Decimal;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	private String delFlag;	
}
