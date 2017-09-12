package com.ustcsoft.jt.util;

import java.io.Serializable;
import java.util.List;

public class JSONTreeNodeUtil implements Serializable, Cloneable {
	protected static final long serialVersionUID = 1L;
	private String id;
	private String text;
	private String iconCls;
	private boolean checked;
	private String state;

	protected List<JSONTreeNodeUtil> children;

	public List<JSONTreeNodeUtil> getChildren() {
		return children;
	}

	public void setChildren(List<JSONTreeNodeUtil> children) {
		this.children = children;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getChecked() {
		return this.checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}