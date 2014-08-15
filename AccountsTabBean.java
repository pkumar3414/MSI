package com.myshipinfo.bean;

import java.util.TreeSet;

import com.pac.bean.GenericBean;

public class AccountsTabBean extends GenericBean implements Comparable<AccountsTabBean> {
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private boolean isSelected = false;
	private long carrierId;
	private long parentId;
	private String parentName;
	private String type; // To set if this bean is a customer/customer group/shipper group/shipper.
	private boolean paidCust;
	private String value;

	public AccountsTabBean(String name, long id, boolean isSelected, long carrierId, String type, Long parentId, String parentName, boolean paidCust) {
		this.name = name;
		this.id = id;
		this.isSelected = isSelected;
		this.carrierId = carrierId;
		this.type = type;
		if(parentId != null) {
			this.parentId = parentId;
		}
		this.parentName = parentName;
		this.paidCust = paidCust;
	}

	public AccountsTabBean() {

	}

	private TreeSet<AccountsTabBean> collection = new TreeSet<AccountsTabBean>();

	public long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(long carrierId) {
		this.carrierId = carrierId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public boolean equals(Object obj) {
		AccountsTabBean atb = (AccountsTabBean) obj;
		return (atb.getId() == this.id ? true : false);
	}

	public int compareTo(AccountsTabBean bean) {
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;

	    if(this == bean) {
	    	return EQUAL;
	    }
		if(this.getId() < 0 && bean.getId() > 0) {
			return BEFORE;
		}

		if(bean.getId() < 0 && this.getId() > 0) {
			return AFTER;
		}
		if (this.getName() != null)
			return this.getName().compareToIgnoreCase(bean.getName());
		return 0;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public TreeSet<AccountsTabBean> getCollection() {
		return collection;
	}

	public void setCollection(TreeSet<AccountsTabBean> collection) {
		this.collection = collection;
	}

	public boolean isPaidCust() {
		return paidCust;
	}

	public void setPaidCust(boolean paidCust) {
		this.paidCust = paidCust;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
