package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author SandyaReddy
 * @Version : 1.0 SandyaReddy 10-Aug-2011 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table invoice_filter_details.
 *          </p>
 */

public class CanFilterDetailsBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -8977143908029350464L;

	
	private long invoiceFilterDetailsId;
	
	
	private long filterId;
	
	
	private long codeValueId;
	
	
	private String columnName;
	
	
	private String andOROperator;
	
		
	private String critOperator;
	
	
	private String value;

	
	private boolean isMatch;

	
	private String createdUser;

	
	private java.sql.Date createdDate;

	

	
	public long getInvoiceFilterDetailsId() {
		return invoiceFilterDetailsId;
	}


	public void setInvoiceFilterDetailsId(long invoiceFilterDetailsId) {
		this.invoiceFilterDetailsId = invoiceFilterDetailsId;
	}


	


	public String getCritOperator() {
		return critOperator;
	}


	public void setCritOperator(String critOperator) {
		this.critOperator = critOperator;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public boolean isMatch() {
		return isMatch;
	}


	public void setMatch(boolean isMatch) {
		this.isMatch = isMatch;
	}


	public String getCreatedUser() {
		return createdUser;
	}


	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}


	public java.sql.Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(java.sql.Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public long getFilterId() {
		return filterId;
	}


	public void setFilterId(long filterId) {
		this.filterId = filterId;
	}


	public long getCodeValueId() {
		return codeValueId;
	}


	public void setCodeValueId(long codeValueId) {
		this.codeValueId = codeValueId;
	}


	public String getColumnName() {
		return columnName;
	}


	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public String getAndOROperator() {
		return andOROperator;
	}


	public void setAndOROperator(String andOROperator) {
		this.andOROperator = andOROperator;
	}			
} // end UserProfileBean

