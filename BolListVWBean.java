package com.myshipinfo.bean;

import java.sql.Date;

import com.pac.bean.GenericBean;

public class BolListVWBean extends GenericBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9088480311393991204L;
	private String batchNumber;
	private String customerName;
	private long customerId;
	private String shipperNumber;
	private String bolNumber;
	private Date bolDate;
	private String carrierName;
	private String status;
	private String senderCity;
	private String senderState;
	private String senderZipCode;
	private String consigneeCity;
	private String consigneeState;
	private String consigneeZipCode;
	private String proNumber;
	private long carrierId;
	private long batchId;
	private long bolHeaderId;
	private Date shipDate;
	private Date invoiceDate;
	private String batchStatus;

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String newBatchNumber) {
		batchNumber = newBatchNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String newCustomerName) {
		customerName = newCustomerName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long newCustomerId) {
		customerId = newCustomerId;
	}

	public String getShipperNumber() {
		return shipperNumber;
	}

	public void setShipperNumber(String newShipperNumber) {
		shipperNumber = newShipperNumber;
	}

	public String getBolNumber() {
		return bolNumber;
	}

	public void setBolNumber(String newBolNumber) {
		bolNumber = newBolNumber;
	}

	public Date getBolDate() {
		return bolDate;
	}

	public void setBolDate(Date newBolDate) {
		bolDate = newBolDate;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String newCarrierName) {
		carrierName = newCarrierName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

	public String getSenderCity() {
		return senderCity;
	}

	public void setSenderCity(String newSenderCity) {
		senderCity = newSenderCity;
	}

	public String getSenderState() {
		return senderState;
	}

	public void setSenderState(String newSenderState) {
		senderState = newSenderState;
	}

	public String getSenderZipCode() {
		return senderZipCode;
	}

	public void setSenderZipCode(String newSenderZipCode) {
		senderZipCode = newSenderZipCode;
	}

	public String getConsigneeCity() {
		return consigneeCity;
	}

	public void setConsigneeCity(String newConsigneeCity) {
		consigneeCity = newConsigneeCity;
	}

	public String getConsigneeState() {
		return consigneeState;
	}

	public void setConsigneeState(String newConsigneeState) {
		consigneeState = newConsigneeState;
	}

	public String getConsigneeZipCode() {
		return consigneeZipCode;
	}

	public void setConsigneeZipCode(String newConsigneeZipCode) {
		consigneeZipCode = newConsigneeZipCode;
	}

	public String getProNumber() {
		return proNumber;
	}

	public void setProNumber(String newProNumber) {
		proNumber = newProNumber;
	}

	public long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(long newCarrierId) {
		carrierId = newCarrierId;
	}

	public long getBatchId() {
		return batchId;
	}

	public void setBatchId(long newBatchId) {
		batchId = newBatchId;
	}

	public long getBolHeaderId() {
		return bolHeaderId;
	}

	public void setBolHeaderId(long newBolHeaderId) {
		bolHeaderId = newBolHeaderId;
	}

	public String getSender() {
		StringBuffer sb = new StringBuffer();

		if (senderCity != null)
			sb.append(senderCity);

		if (senderState != null && senderCity != null)
			sb.append("," + senderState);
		else if (senderState != null)
			sb.append(senderState);

		if (senderZipCode != null && senderState != null)
			sb.append(" - " + senderZipCode);
		else if (senderZipCode != null)
			sb.append(senderZipCode);

		return sb.toString();
	}

	public String getConsignee() {
		StringBuffer sb = new StringBuffer();

		if (consigneeCity != null)
			sb.append(consigneeCity);

		if (consigneeState != null && consigneeCity != null)
			sb.append("," + consigneeState);
		else if (consigneeState != null)
			sb.append(consigneeState);

		if (consigneeZipCode != null && consigneeState != null)
			sb.append(" - " + consigneeZipCode);
		else if (consigneeZipCode != null)
			sb.append(consigneeZipCode);

		return sb.toString();
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date newShipDate) {
		shipDate = newShipDate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date newInvoiceDate) {
		invoiceDate = newInvoiceDate;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String newBatchStatus) {
		batchStatus = newBatchStatus;
	}

}