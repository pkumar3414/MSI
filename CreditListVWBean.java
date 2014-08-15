package com.myshipinfo.bean;

import java.sql.Date;
import com.pac.bean.*;

public class CreditListVWBean extends GenericBean {
	private static final long serialVersionUID = -8597783810620485952L;
	private String vendorName;
	private String batchNumber;
	private Date batchDate;
	private String customerName;
	private String carrierName;
	private String claimNumber;
	private String bolNumber;
	private String proNumber;
	private Double filedAmount;
	private Double creditAmount;
	private String status;
	private String isActive;
	private long creditId;

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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String newCustomerName) {
		customerName = newCustomerName;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String newCarrierName) {
		carrierName = newCarrierName;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String newClaimNumber) {
		claimNumber = newClaimNumber;
	}

	public String getBolNumber() {
		return bolNumber;
	}

	public void setBolNumber(String newBolNumber) {
		bolNumber = newBolNumber;
	}

	public String getProNumber() {
		return proNumber;
	}

	public void setProNumber(String newProNumber) {
		proNumber = newProNumber;
	}

	public Double getFiledAmount() {
		return filedAmount;
	}

	public void setFiledAmount(Double newFiledAmount) {
		filedAmount = newFiledAmount;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double newCreditAmount) {
		creditAmount = newCreditAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String newIsActive) {
		isActive = newIsActive;
	}

	public long getCreditId() {
		return creditId;
	}

	public void setCreditId(long newCreditId) {
		creditId = newCreditId;
	}

}