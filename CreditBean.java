package com.myshipinfo.bean;

import java.sql.Date;
import com.pac.bean.*;

public class CreditBean extends GenericBean {
	private static final long serialVersionUID = -18215339770731765L;
	private long creditId;
	private String batchNumber;
	private String bolNumber;
	private String carrierName;
	private String customerName;
	private String proNumber;
	private Date datePaid;
	private String claimNumber;
	private String paymentNumber;
	private Double originalAmount;
	private Double filedAmount;
	private Double rate;
	private Double fee;
	private String reason;
	private Double creditAmount;
	private String comments;
	private boolean isActive;
	private String status;

	public long getCreditId() {
		return creditId;
	}

	public void setCreditId(long newCreditId) {
		creditId = newCreditId;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String newBatchNumber) {
		batchNumber = newBatchNumber;
	}

	public String getBolNumber() {
		return bolNumber;
	}

	public void setBolNumber(String newBolNumber) {
		bolNumber = newBolNumber;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String newCarrierName) {
		carrierName = newCarrierName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String newCustomerName) {
		customerName = newCustomerName;
	}

	public String getProNumber() {
		return proNumber;
	}

	public void setProNumber(String newProNumber) {
		proNumber = newProNumber;
	}

	public Date getDatePaid() {
		return datePaid;
	}

	public void setDatePaid(Date newDatePaid) {
		datePaid = newDatePaid;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String newClaimNumber) {
		claimNumber = newClaimNumber;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String newPaymentNumber) {
		paymentNumber = newPaymentNumber;
	}

	public Double getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(Double newOriginalAmount) {
		originalAmount = newOriginalAmount;
	}

	public Double getFiledAmount() {
		return filedAmount;
	}

	public void setFiledAmount(Double newFiledAmount) {
		filedAmount = newFiledAmount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double newRate) {
		rate = newRate;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double newFee) {
		fee = newFee;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String newReason) {
		reason = newReason;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double newCreditAmount) {
		creditAmount = newCreditAmount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String newComments) {
		comments = newComments;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean newIsActive) {
		isActive = newIsActive;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

}