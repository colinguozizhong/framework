package com.ustcsoft.jt.util;

import java.io.Serializable;
import java.util.List;

public class JSONTreeNodeUtil4EasyUI<T> implements Serializable, Cloneable {
	protected static final long serialVersionUID = 1L;
	private String id;
	private String text;
	private String iconCls;
	private boolean checked;
	private String state;
	private T attributes;

	protected List<JSONTreeNodeUtil4EasyUI<T>> children;

	public List<JSONTreeNodeUtil4EasyUI<T>> getChildren() {
		return children;
	}

	public void setChildren(List<JSONTreeNodeUtil4EasyUI<T>> children) {
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

	public T getAttributes() {
		return attributes;
	}

	public void setAttributes(T attributes) {
		this.attributes = attributes;
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