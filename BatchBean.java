package com.myshipinfo.bean;

import java.sql.Date;
import com.pac.bean.*;

public class BatchBean extends GenericBean {
	private static final long serialVersionUID = 4666942247202564916L;
	private long batchId;
	private long vendorId;
	private String batchNumber;
	private String batchStatus;
	private Date batchDate;
	private Date batchClosedDate;
	private boolean isActive;

	public BatchBean() {
	}

	public long getBatchId() {
		return batchId;
	}

	public void setBatchId(long newBatchId) {
		batchId = newBatchId;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long newVendorId) {
		vendorId = newVendorId;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String newBatchNumber) {
		batchNumber = newBatchNumber;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String newBatchStatus) {
		batchStatus = newBatchStatus;
	}

	public Date getBatchDate() {
		return batchDate;
	}

	public void setBatchDate(Date newBatchDate) {
		batchDate = newBatchDate;
	}

	public Date getBatchClosedDate() {
		return batchClosedDate;
	}

	public void setBatchClosedDate(Date newBatchClosedDate) {
		batchClosedDate = newBatchClosedDate;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean newIsActive) {
		isActive = newIsActive;
	}

}