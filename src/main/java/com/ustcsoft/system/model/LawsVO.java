package com.ustcsoft.system.model;

import java.util.Date;

import com.ustcsoft.framework.vo.BaseVO;

public class LawsVO extends BaseVO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3431482159597949277L;

	/**
     * 法律法规ID
     */
	private String lawsId;
	
	/**
     * 法律法规名称
     */
	private String lawsName;
	
	/**
     * 类别
     */
	private String typeId;
	
	/**
     * 制定机关
     */
	private String makeOrg;
	
	/**
     * 发布机关
     */
	private String pubOrg;
	
	/**
     * 发布文号
     */
	private String pubNum;
	
	/**
     * 发布日期
     */
	private Date pubDate;
	
	/**
     * 实施日期
     */
	private Date operDate;
	
	/**
     * 失效日期
     */
	private Date invDate;
	
	/**
     * 实效性
     */
	private String valid;
	
	/**
     * 正文内容
     */
	private String content;
	
	/**
     * 附件ID
     */
	private String fileId;
	
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getPubNum() {
		return pubNum;
	}
	public void setPubNum(String pubNum) {
		this.pubNum = pubNum;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public Date getOperDate() {
		return operDate;
	}
	public void setOperDate(Date operDate) {
		this.operDate = operDate;
	}
	public Date getInvDate() {
		return invDate;
	}
	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}
	public String getPubOrg() {
		return pubOrg;
	}
	public void setPubOrg(String pubOrg) {
		this.pubOrg = pubOrg;
	}
	public String getMakeOrg() {
		return makeOrg;
	}
	public void setMakeOrg(String makeOrg) {
		this.makeOrg = makeOrg;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getLawsName() {
		return lawsName;
	}
	public void setLawsName(String lawsName) {
		this.lawsName = lawsName;
	}
	public String getLawsId() {
		return lawsId;
	}
	public void setLawsId(String lawsId) {
		this.lawsId = lawsId;
	}
}
