package com.ustcsoft.system.model;

/**
 * 下拉框VO
 * @author zhangye
 *
 */
public class CmbItemVO {
	/** 代码 */
	private String code;
	/** 名称 */
	private String name;
	/** 父节点 */
	private String parentId;
	/** 叶子 */
	private String leaf;
	/** 类别名称 */
	private String codeName;
	/** 树的层数 */
	private String treeLevel;
	/**
	 * 组织排序
	 */
	private String paiXu;
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	/**
	 * 
	 */
	public CmbItemVO(){
		
	}
	/**
	 * 
	 * @param code code
	 * @param name name
	 */
	public CmbItemVO(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getLeaf() {
		return leaf;
	}
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}
	public String getPaiXu() {
		return paiXu;
	}
	public void setPaiXu(String paiXu) {
		this.paiXu = paiXu;
	}
	public String getTreeLevel() {
		return treeLevel;
	}
	public void setTreeLevel(String treeLevel) {
		this.treeLevel = treeLevel;
	}

}
