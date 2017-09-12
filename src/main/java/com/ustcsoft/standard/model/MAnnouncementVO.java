package com.ustcsoft.standard.model;

import java.util.List;

import com.ustcsoft.framework.vo.BaseVO;

/**
 * 公告VO
 * @author WangHao
 */
public class MAnnouncementVO extends BaseVO {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/** 公告ID */
	private String announcementId;

	/** 标题 */
	private String title;

	/** 内容 */
	private String content;

	/** 发送组织ID */
	private String senderOrgId;

	/** 发送组织名称 */
	private String senderOrgName;

	/** 接收者ID*/
	private String reciverOrgId;
	/** 接收组织列表 */
	private List<MAnnouncementReciverVO> listOrg;

	public String getAnnouncementId() {
		return announcementId;
	}
	public void setAnnouncementId(String announcementId) {
		this.announcementId = announcementId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSenderOrgId() {
		return senderOrgId;
	}
	public void setSenderOrgId(String senderOrgId) {
		this.senderOrgId = senderOrgId;
	}
	public String getReciverOrgId() {
		return reciverOrgId;
	}
	public void setReciverOrgId(String reciverOrgId) {
		this.reciverOrgId = reciverOrgId;
	}
	public String getSenderOrgName() {
		return senderOrgName;
	}
	public void setSenderOrgName(String senderOrgName) {
		this.senderOrgName = senderOrgName;
	}
	public List<MAnnouncementReciverVO> getListOrg() {
		return listOrg;
	}
	public void setListOrg(List<MAnnouncementReciverVO> listOrg) {
		this.listOrg = listOrg;
	}
}
