package com.myshipinfo.bean;

import com.pac.bean.*;
import java.sql.Date;

public class BalanceDueBean extends GenericBean {
	private static final long serialVersionUID = -762043806046161138L;
	private long balanceDueId;
	private String invoiceNumber;
	private String shipperCode;
	// private double invoiceAmount;
	private double originalCharge;
	private double creditAmount;
	private double netDueAmount;
	private Date invoiceDate;
	private String controlNumber;

	public void setBalanceDueId(long newBalanceDueId) {
		balanceDueId = newBalanceDueId;
	}

	public long getBalanceDueId() {
		return balanceDueId;
	}

	public void setInvoiceNumber(String newInvoiceNumber) {
		invoiceNumber = newInvoiceNumber;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setShipperCode(String newShipperCode) {
		shipperCode = newShipperCode;
	}

	public String getShipperCode() {
		return shipperCode;
	}

	/*
	 * public void setInvoiceAmount(double newInvoiceAmount) {
	 * invoiceAmount=newInvoiceAmount; } public double getInvoiceAmount() {
	 * return invoiceAmount; }
	 */
	public void setOriginalCharge(double newOriginalCharge) {
		originalCharge = newOriginalCharge;
	}

	public double getOriginalCharge() {
		return originalCharge;
	}

	public void setCreditAmount(double newCreditAmount) {
		creditAmount = newCreditAmount;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setNetDueAmount(double newNetDueAmount) {
		netDueAmount = newNetDueAmount;
	}

	public double getNetDueAmount() {
		return netDueAmount;
	}

	public void setInvoiceDate(java.sql.Date newInvoiceDate) {
		invoiceDate = newInvoiceDate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setControlNumber(String newControlNumber) {
		controlNumber = newControlNumber;
	}

	public String getControlNumber() {
		return controlNumber;
	}
}