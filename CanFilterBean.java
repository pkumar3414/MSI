package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author SandyaReddy
 * @Version : 1.0 SandyaReddy 10-Aug-2011 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table Invoice_filter_tb.
 *          </p>
 */
public class CanFilterBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -8977143908029350464L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long invoiceFilterId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String filterName;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private boolean isPublic;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private boolean status;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String createdUser;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	
	private java.sql.Date createdDate;
	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	
	private String whereClause;
	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	
	private String updatedUser;
	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private java.sql.Date updatedDate;
	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	
	private java.sql.Date effectiveDate;
	private java.sql.Date expiryDate;
	private Long reason;
	private String comments;
	private Long auditAction;
	private String filterGroup;
	private Long cusomerId;
	private Long priority;
	private boolean dynamicQueue;  
	private boolean eifoc;  
	private boolean gainShare;  
	private boolean autoCloseRule;
	private boolean isODValid;


	public boolean isODValid() {
		return isODValid;
	}

	public void setODValid(boolean isODValid) {
		this.isODValid = isODValid;
	}

	public boolean isAutoCloseRule() {
		return autoCloseRule;
	}

	public void setAutoCloseRule(boolean autoCloseRule) {
		this.autoCloseRule = autoCloseRule;
	}

	public boolean isEifoc() {
		return eifoc;
	}

	public void setEifoc(boolean eifoc) {
		this.eifoc = eifoc;
	}

	public boolean isDynamicQueue() {
		return dynamicQueue;
	}

	public void setDynamicQueue(boolean dynamicQueue) {
		this.dynamicQueue = dynamicQueue;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Long getAuditAction() {
		return auditAction;
	}

	public void setAuditAction(Long auditAction) {
		this.auditAction = auditAction;
	}

	public java.sql.Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(java.sql.Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public java.sql.Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(java.sql.Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Long getReason() {
		return reason;
	}

	public void setReason(Long reson) {
		this.reason = reson;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getFilterGroup() {
		return filterGroup;
	}

	public void setFilterGroup(String filterGroup) {
		this.filterGroup = filterGroup;
	}

	public Long getCusomerId() {
		return cusomerId;
	}

	public void setCusomerId(Long cusomerId) {
		this.cusomerId = cusomerId;
	}

	public long getInvoiceFilterId() {
		return invoiceFilterId;
	}

	public void setInvoiceFilterId(long invoiceFilterId) {
		this.invoiceFilterId = invoiceFilterId;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
	
	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	public java.sql.Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(java.sql.Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public String getWhereClause() { 
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}
	
	public boolean isGainShare() {
		return gainShare;
	}

	public void setGainShare(boolean gainShare) {
		this.gainShare = gainShare;
	}
			
} // end UserProfileBean

