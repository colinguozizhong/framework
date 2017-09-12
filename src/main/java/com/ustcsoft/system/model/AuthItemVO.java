package com.ustcsoft.system.model;

import java.util.List;

import com.ustcsoft.framework.vo.BaseVO;

public class AuthItemVO extends BaseVO{
	private static final long serialVersionUID = 1016478184291785131L;
	
	private String zhuJianId;
	
	private String orgId;
	
	private String releaseFlg;
	
	private String deptId;
	
	private String deptName;
	
	private String zhiQuanHuaFen;
	
	private String shenQingShuLeiXing;
	
	/** 实施主体分类 */
	private String shiShiZhuTi;
	/** 职权项目id */
	private String itemId;
	/** 实施主体名称 */
	private String operOrgName;
	/** 职权项目名称 */
	private String itemName;
	/** 查询范围 */
	private String chaXunFangShi;
	
	/** 实施主体id */
	private String operOrgId;
	/** 职权种类id */
	private String authTypeId;
	/** 时限 */ 
	private String timeLimit;
	/** 时限说明*/ 
	private String timeLimitExplain;
	/** 职权种类名称 */
	private String authTypeName;
	/** 法律责任 */ 
	private String legalResp;
	/** 程序 */
	private String process;
	/** 选择标记  0 未选中 1 选中*/
	private String checkFlg;
	/** 编码 */ 
	private String itemCode;
	/** 备注 */
	private String authItemMemo;
	/** 执法依据 */
	private String authLegal;
	/** 表区分 */
	private String tableDiff;
	/** 法律法规 20120601 zhangye追加 */
	private String law;
	/** 同步职权 20120719 zhangye追加 */
	private String syncJson;
	/** 行业 类型   01公路  02运管   03海事  04质监  05交通运输主管部门 06港航 */
	private String industryCate; 
	/**工作流 */
	private String workFlowCode;
	/**工作流名称 */
	private String workFlowName;
	/**证件类型 */
	private String zhengJianLeiXing;
	/** 程度内容 */
	private String cdnr;
	/** 量化标准 */
	private String lhbz;
	/** 固化标准 */
	private String ghbz;
		
	// 2014-05-19 guozizhong add
	/** 职权类别 */
	private String authCategory;
		
	/** 申请书类型 */
	private String applyType;
		
	// 特殊职权使用
	/**材料目录*/
	private String dataList;
	
	private String banjianleibie;
	
	private String banBenStatus;
	
	private String newZhuJianId;
	
	private String shiShiZhuTiMingCheng;
	
	private String roleType;
	
	//通用职权版本ID
	private String gdwzqbbglId;
	
	private List<String> orgIds = null;
	
	//行政处罚 前台传进的json字符串
	private String chufaJson;
	//行政许可前台传进的json字符串
	private String xukeJson;


	public String getChufaJson() {
		return chufaJson;
	}

	public void setChufaJson(String chufaJson) {
		this.chufaJson = chufaJson;
	}

	public String getXukeJson() {
		return xukeJson;
	}

	public void setXukeJson(String xukeJson) {
		this.xukeJson = xukeJson;
	}

	public String getZhuJianId() {
		return zhuJianId;
	}

	public void setZhuJianId(String zhuJianId) {
		this.zhuJianId = zhuJianId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getReleaseFlg() {
		return releaseFlg;
	}

	public void setReleaseFlg(String releaseFlg) {
		this.releaseFlg = releaseFlg;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getZhiQuanHuaFen() {
		return zhiQuanHuaFen;
	}

	public void setZhiQuanHuaFen(String zhiQuanHuaFen) {
		this.zhiQuanHuaFen = zhiQuanHuaFen;
	}

	public String getShenQingShuLeiXing() {
		return shenQingShuLeiXing;
	}

	public void setShenQingShuLeiXing(String shenQingShuLeiXing) {
		this.shenQingShuLeiXing = shenQingShuLeiXing;
	}

	public String getShiShiZhuTi() {
		return shiShiZhuTi;
	}

	public void setShiShiZhuTi(String shiShiZhuTi) {
		this.shiShiZhuTi = shiShiZhuTi;
	}

	

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOperOrgName() {
		return operOrgName;
	}

	public void setOperOrgName(String operOrgName) {
		this.operOrgName = operOrgName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getChaXunFangShi() {
		return chaXunFangShi;
	}

	public void setChaXunFangShi(String chaXunFangShi) {
		this.chaXunFangShi = chaXunFangShi;
	}

	public String getOperOrgId() {
		return operOrgId;
	}

	public void setOperOrgId(String operOrgId) {
		this.operOrgId = operOrgId;
	}

	public String getAuthTypeId() {
		return authTypeId;
	}

	public void setAuthTypeId(String authTypeId) {
		this.authTypeId = authTypeId;
	}

	public String getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getTimeLimitExplain() {
		return timeLimitExplain;
	}

	public void setTimeLimitExplain(String timeLimitExplain) {
		this.timeLimitExplain = timeLimitExplain;
	}

	public String getAuthTypeName() {
		return authTypeName;
	}

	public void setAuthTypeName(String authTypeName) {
		this.authTypeName = authTypeName;
	}

	public String getLegalResp() {
		return legalResp;
	}

	public void setLegalResp(String legalResp) {
		this.legalResp = legalResp;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getCheckFlg() {
		return checkFlg;
	}

	public void setCheckFlg(String checkFlg) {
		this.checkFlg = checkFlg;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getAuthItemMemo() {
		return authItemMemo;
	}

	public void setAuthItemMemo(String authItemMemo) {
		this.authItemMemo = authItemMemo;
	}

	public String getAuthLegal() {
		return authLegal;
	}

	public void setAuthLegal(String authLegal) {
		this.authLegal = authLegal;
	}

	public String getTableDiff() {
		return tableDiff;
	}

	public void setTableDiff(String tableDiff) {
		this.tableDiff = tableDiff;
	}

	public String getLaw() {
		return law;
	}

	public void setLaw(String law) {
		this.law = law;
	}

	public String getSyncJson() {
		return syncJson;
	}

	public void setSyncJson(String syncJson) {
		this.syncJson = syncJson;
	}

	public String getIndustryCate() {
		return industryCate;
	}

	public void setIndustryCate(String industryCate) {
		this.industryCate = industryCate;
	}

	public String getWorkFlowCode() {
		return workFlowCode;
	}

	public void setWorkFlowCode(String workFlowCode) {
		this.workFlowCode = workFlowCode;
	}

	public String getWorkFlowName() {
		return workFlowName;
	}

	public void setWorkFlowName(String workFlowName) {
		this.workFlowName = workFlowName;
	}

	public String getZhengJianLeiXing() {
		return zhengJianLeiXing;
	}

	public void setZhengJianLeiXing(String zhengJianLeiXing) {
		this.zhengJianLeiXing = zhengJianLeiXing;
	}

	public String getCdnr() {
		return cdnr;
	}

	public void setCdnr(String cdnr) {
		this.cdnr = cdnr;
	}

	public String getLhbz() {
		return lhbz;
	}

	public void setLhbz(String lhbz) {
		this.lhbz = lhbz;
	}

	public String getGhbz() {
		return ghbz;
	}

	public void setGhbz(String ghbz) {
		this.ghbz = ghbz;
	}

	public String getAuthCategory() {
		return authCategory;
	}

	public void setAuthCategory(String authCategory) {
		this.authCategory = authCategory;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getDataList() {
		return dataList;
	}

	public void setDataList(String dataList) {
		this.dataList = dataList;
	}

	public String getBanjianleibie() {
		return banjianleibie;
	}

	public void setBanjianleibie(String banjianleibie) {
		this.banjianleibie = banjianleibie;
	}

	public String getBanBenStatus() {
		return banBenStatus;
	}

	public void setBanBenStatus(String banBenStatus) {
		this.banBenStatus = banBenStatus;
	}

	public String getNewZhuJianId() {
		return newZhuJianId;
	}

	public void setNewZhuJianId(String newZhuJianId) {
		this.newZhuJianId = newZhuJianId;
	}

	public String getShiShiZhuTiMingCheng() {
		return shiShiZhuTiMingCheng;
	}

	public void setShiShiZhuTiMingCheng(String shiShiZhuTiMingCheng) {
		this.shiShiZhuTiMingCheng = shiShiZhuTiMingCheng;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getGdwzqbbglId() {
		return gdwzqbbglId;
	}

	public void setGdwzqbbglId(String gdwzqbbglId) {
		this.gdwzqbbglId = gdwzqbbglId;
	}

	public List<String> getOrgIds() {
		return orgIds;
	}

	public void setOrgIds(List<String> orgIds) {
		this.orgIds = orgIds;
	}
	
}
