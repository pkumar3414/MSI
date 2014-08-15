package com.myshipinfo.bean;

import java.sql.Date;
import com.pac.bean.GenericBean;

public class BatchListVWBean extends GenericBean {
	private static final long serialVersionUID = -514706007965408439L;
	private String vendorName;
	private String batchNumber;
	private Date batchDate;
	private String batchStatus;
	private Date batchClosedDate;
	private long batchId;
	private long vendorId;

	public BatchListVWBean() {
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String newVendorName) {
		vendorName = newVendorName;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String newBatchNumber) {
		batchNumber = newBatchNumber;
	}

	public Date getBatchDate() {
		return batchDate;
	}

	public void setBatchDate(Date newBatchDate) {
		batchDate = newBatchDate;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String newBatchStatus) {
		batchStatus = newBatchStatus;
	}

	public Date getBatchClosedDate() {
		return batchClosedDate;
	}

	public void setBatchClosedDate(Date newBatchClosedDate) {
		batchClosedDate = newBatchClosedDate;
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
}