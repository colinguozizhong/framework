package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class GuideVO extends BaseVO{
	private static final long serialVersionUID = 1007371121289619326L;
	// id
	private String id;
	// 职权ID
	private String authItemId;
	// 申报条件
	private String qualification;
	// 材料目录
	private String dataList;
	// 办理程序
	private String procedure;
	// 办理时限
	private String timeLimit;
	// 收费标准
	private String feeStd;
	// 收费依据
	private String feeBasis;
	// 办理流程图
	private String flowChart;
	// 办件类别
	private String handleType;
	// 备注
	private String memo;
	// 指南名称
	private String guideName;
	
	private String rowno;
	
	/** 职权项目 **/
	private String authItem;
	
	//各单位职权版本主键ID；
	private String gdwzqbbglId;
	
	private String banBenStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthItemId() {
		return authItemId;
	}

	public void setAuthItemId(String authItemId) {
		this.authItemId = authItemId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDataList() {
		return dataList;
	}

	public void setDataList(String dataList) {
		this.dataList = dataList;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getFeeStd() {
		return feeStd;
	}

	public void setFeeStd(String feeStd) {
		this.feeStd = feeStd;
	}

	public String getFeeBasis() {
		return feeBasis;
	}

	public void setFeeBasis(String feeBasis) {
		this.feeBasis = feeBasis;
	}

	public String getFlowChart() {
		return flowChart;
	}

	public void setFlowChart(String flowChart) {
		this.flowChart = flowChart;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getGuideName() {
		return guideName;
	}

	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}

	public String getRowno() {
		return rowno;
	}

	public void setRowno(String rowno) {
		this.rowno = rowno;
	}

	public String getAuthItem() {
		return authItem;
	}

	public void setAuthItem(String authItem) {
		this.authItem = authItem;
	}

	public String getGdwzqbbglId() {
		return gdwzqbbglId;
	}

	public void setGdwzqbbglId(String gdwzqbbglId) {
		this.gdwzqbbglId = gdwzqbbglId;
	}

	public String getBanBenStatus() {
		return banBenStatus;
	}

	public void setBanBenStatus(String banBenStatus) {
		this.banBenStatus = banBenStatus;
	}
	

}
