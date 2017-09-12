package com.ustcsoft.standard.model;

import com.ustcsoft.framework.vo.BaseVO;

	/**
	 * 部门VO
	 * @author WangHao
	 *
	 */
	public class DepartmentVO extends BaseVO {
		/**
		 * serialVersionUID
		 */
		private static final long serialVersionUID = 1L;
		/** 部门ID */
		private String deptId;
		/** 组织机构ID */
		private String orgId;
		/** 部门名称 */
		private String deptName;
		/** 部门简称 */
		private String abbr;
		/** 部门说明 */
		private String remark;
		/** 负责人 */
		private String manager;
		/** 联系人 */
		private String contactPerson;
		/** 联系电话 */
		private String contactTel;
		/** 电子邮箱 */
		private String email;
		/** 排序序号 */
		private String sortNo;
		/** 部门状态 */
		private String status;
		/** 实施主体编号1 */
		private String shiShiZhuTiBianHao1;
		/**实施主体名称1*/
		private String shiShiZhuTiMingCheng1;
		/** 实施主体编号2 */
		private String shiShiZhuTiBianHao2;
		/**实施主体名称2*/
		private String shiShiZhuTiMingCheng2;
		/**上级管理机构*/
		private String orgManage;
		/**上级业务机构*/
		private String orgBusiness;
		/**对应人民政府*/
		private String government;
		/**牌子类别*/
		private String deptType;
		
		public String getDeptType() {
			return deptType;
		}
		public void setDeptType(String deptType) {
			this.deptType = deptType;
		}
		public String getOrgManage() {
			return orgManage;
		}
		public void setOrgManage(String orgManage) {
			this.orgManage = orgManage;
		}
		public String getOrgBusiness() {
			return orgBusiness;
		}
		public void setOrgBusiness(String orgBusiness) {
			this.orgBusiness = orgBusiness;
		}
		public String getGovernment() {
			return government;
		}
		public void setGovernment(String government) {
			this.government = government;
		}
		public String getDeptId() {
			return deptId;
		}
		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}
		public String getOrgId() {
			return orgId;
		}
		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getAbbr() {
			return abbr;
		}
		public void setAbbr(String abbr) {
			this.abbr = abbr;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getManager() {
			return manager;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		public String getContactTel() {
			return contactTel;
		}
		public void setContactTel(String contactTel) {
			this.contactTel = contactTel;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSortNo() {
			return sortNo;
		}
		public void setSortNo(String sortNo) {
			this.sortNo = sortNo;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getShiShiZhuTiBianHao1() {
			return shiShiZhuTiBianHao1;
		}
		public void setShiShiZhuTiBianHao1(String shiShiZhuTiBianHao1) {
			this.shiShiZhuTiBianHao1 = shiShiZhuTiBianHao1;
		}
		public String getShiShiZhuTiMingCheng1() {
			return shiShiZhuTiMingCheng1;
		}
		public void setShiShiZhuTiMingCheng1(String shiShiZhuTiMingCheng1) {
			this.shiShiZhuTiMingCheng1 = shiShiZhuTiMingCheng1;
		}
		public String getShiShiZhuTiBianHao2() {
			return shiShiZhuTiBianHao2;
		}
		public void setShiShiZhuTiBianHao2(String shiShiZhuTiBianHao2) {
			this.shiShiZhuTiBianHao2 = shiShiZhuTiBianHao2;
		}
		public String getShiShiZhuTiMingCheng2() {
			return shiShiZhuTiMingCheng2;
		}
		public void setShiShiZhuTiMingCheng2(String shiShiZhuTiMingCheng2) {
			this.shiShiZhuTiMingCheng2 = shiShiZhuTiMingCheng2;
		}
	}


