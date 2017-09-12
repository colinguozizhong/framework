package com.ustcsoft.system.model;

import com.ustcsoft.framework.vo.BaseVO;

public class TagAndLegalBasis extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tagId;
	private String legalBasisId;

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getLegalBasisId() {
		return legalBasisId;
	}

	public void setLegalBasisId(String legalBasisId) {
		this.legalBasisId = legalBasisId;
	}

}
