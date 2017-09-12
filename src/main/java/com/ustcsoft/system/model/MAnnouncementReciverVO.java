package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

/**
 * 公告VO
 * @author WangHao
 */
public class MAnnouncementReciverVO extends BaseVO {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/** 公告ID */
	private String announcementId;
	/** 接收机构ID */
	private String reciverOrgId;
	//VIEW
	/** ID */
	private String id;
	/** text */
	private String text;
	/** 机构名称 */
	private String orgName;
	/** leaf */
	private boolean leaf;
	/** checked */
	private boolean checked;
	/** parentId */
	private String parentId;
	/** businessId */
	private String businessId;
	/** parentBusinessId */
	private String pid;
	public String getAnnouncementId() {
		return announcementId;
	}
	public void setAnnouncementId(String announcementId) {
		this.announcementId = announcementId;
	}
	public String getReciverOrgId() {
		return reciverOrgId;
	}
	public void setReciverOrgId(String reciverOrgId) {
		this.reciverOrgId = reciverOrgId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
