package com.myshipinfo.bean;

import com.pac.bean.GenericBean;
import java.sql.Date;

/**
 * <p>
 * 
 * @author Suryakiran
 * @Version : 1.0 Suryakiran 13-Feb-2008 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table Shp_BOL_Header_Tb table.
 *          </p>
 */

public class BOLHeaderBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = 2886536080759646825L;
	private long bolHeaderId;
	private long batchId;
	private long customerId;
	private String bolNumber;
	private String proNumber;
	private long carrierId;
	private Date bolDate;
	private String status;
	private String poNumber;
	private String orderNumber;
	private String invoiceNumber;
	private String referenceNumber;
	private Date pickupDate;
	private Date expectedDeliveryDate;
	private Date deliveredDate;
	private String instructions;
	private String comments;
	private String transportMode;
	private String terms;
	private String trailerNumber;
	private String sealNumber;
	private String senderName;
	private String senderAddress1;
	private String senderAddress2;
	private String senderCity;
	private String senderState;
	private String senderZipCode;
	private String senderCountry;
	private String senderFax;
	private String senderPhone;
	private String senderEmail;
	private String consigneeName;
	private String consigneeAddress1;
	private String consigneeAddress2;
	private String consigneeCity;
	private String consigneeState;
	private String consigneeZipCode;
	private String consigneeCountry;
	private String consigneeFax;
	private String consigneePhone;
	private String consigneeEmail;
	private String billToName;
	private String billToAddress1;
	private String billToAddress2;
	private String billToCity;
	private String billToState;
	private String billToZipCode;
	private String billToCountry;
	private String billToFax;
	private String billToPhone;
	private String billToEmail;
	private boolean isActive;
	private String shipperNumber;
	private Date invoiceDate;
	private Date shipDate;

	// /////////////////////////////////////
	// operations

	public long getBolHeaderId() {
		return bolHeaderId;
	}

	public void setBolHeaderId(long newBolHeaderId) {
		bolHeaderId = newBolHeaderId;
	}

	public long getBatchId() {
		return batchId;
	}

	public void setBatchId(long newBatchId) {
		batchId = newBatchId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long newCustomerId) {
		customerId = newCustomerId;
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

	public long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(long newCarrierId) {
		carrierId = newCarrierId;
	}

	public Date getBolDate() {
		return bolDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String newPoNumber) {
		poNumber = newPoNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String newOrderNumber) {
		orderNumber = newOrderNumber;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String newInvoiceNumber) {
		invoiceNumber = newInvoiceNumber;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String newReferenceNumber) {
		referenceNumber = newReferenceNumber;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date newPickupDate) {
		pickupDate = newPickupDate;
	}

	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(Date newExpectedDeliveryDate) {
		expectedDeliveryDate = newExpectedDeliveryDate;
	}

	public Date getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(Date newDeliveredDate) {
		deliveredDate = newDeliveredDate;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String newInstructions) {
		instructions = newInstructions;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String newComments) {
		comments = newComments;
	}

	public void setBolDate(Date newBolDate) {
		bolDate = newBolDate;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String newTransportMode) {
		transportMode = newTransportMode;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String newTerms) {
		terms = newTerms;
	}

	public String getTrailerNumber() {
		return trailerNumber;
	}

	public void setTrailerNumber(String newTrailerNumber) {
		trailerNumber = newTrailerNumber;
	}

	public String getSealNumber() {
		return sealNumber;
	}

	public void setSealNumber(String newSealNumber) {
		sealNumber = newSealNumber;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String newSenderName) {
		senderName = newSenderName;
	}

	public String getSenderAddress1() {
		return senderAddress1;
	}

	public void setSenderAddress1(String newSenderAddress1) {
		senderAddress1 = newSenderAddress1;
	}

	public String getSenderAddress2() {
		return senderAddress2;
	}

	public void setSenderAddress2(String newSenderAddress2) {
		senderAddress2 = newSenderAddress2;
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

	public String getSenderCountry() {
		return senderCountry;
	}

	public void setSenderCountry(String newSenderCountry) {
		senderCountry = newSenderCountry;
	}

	public String getSenderFax() {
		return senderFax;
	}

	public void setSenderFax(String newSenderFax) {
		senderFax = newSenderFax;
	}

	public String getSenderPhone() {
		return senderPhone;
	}

	public void setSenderPhone(String newSenderPhone) {
		senderPhone = newSenderPhone;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String newSenderEmail) {
		senderEmail = newSenderEmail;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String newConsigneeName) {
		consigneeName = newConsigneeName;
	}

	public String getConsigneeAddress1() {
		return consigneeAddress1;
	}

	public void setConsigneeAddress1(String newConsigneeAddress1) {
		consigneeAddress1 = newConsigneeAddress1;
	}

	public String getConsigneeAddress2() {
		return consigneeAddress2;
	}

	public void setConsigneeAddress2(String newConsigneeAddress2) {
		consigneeAddress2 = newConsigneeAddress2;
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

	public String getConsigneeCountry() {
		return consigneeCountry;
	}

	public void setConsigneeCountry(String newConsigneeCountry) {
		consigneeCountry = newConsigneeCountry;
	}

	public String getConsigneeFax() {
		return consigneeFax;
	}

	public void setConsigneeFax(String newConsigneeFax) {
		consigneeFax = newConsigneeFax;
	}

	public String getConsigneePhone() {
		return consigneePhone;
	}

	public void setConsigneePhone(String newConsigneePhone) {
		consigneePhone = newConsigneePhone;
	}

	public String getConsigneeEmail() {
		return consigneeEmail;
	}

	public void setConsigneeEmail(String newConsigneeEmail) {
		consigneeEmail = newConsigneeEmail;
	}

	public String getBillToName() {
		return billToName;
	}

	public void setBillToName(String newBillToName) {
		billToName = newBillToName;
	}

	public String getBillToAddress1() {
		return billToAddress1;
	}

	public void setBillToAddress1(String newBillToAddress1) {
		billToAddress1 = newBillToAddress1;
	}

	public String getBillToAddress2() {
		return billToAddress2;
	}

	public void setBillToAddress2(String newBillToAddress2) {
		billToAddress2 = newBillToAddress2;
	}

	public String getBillToCity() {
		return billToCity;
	}

	public void setBillToCity(String newBillToCity) {
		billToCity = newBillToCity;
	}

	public String getBillToState() {
		return billToState;
	}

	public void setBillToState(String newBillToState) {
		billToState = newBillToState;
	}

	public String getBillToCountry() {
		return billToCountry;
	}

	public void setBillToCountry(String newBillToCountry) {
		billToCountry = newBillToCountry;
	}

	public String getBillToFax() {
		return billToFax;
	}

	public void setBillToFax(String newBillToFax) {
		billToFax = newBillToFax;
	}

	public String getBillToPhone() {
		return billToPhone;
	}

	public void setBillToPhone(String newBillToPhone) {
		billToPhone = newBillToPhone;
	}

	public String getBillToEmail() {
		return billToEmail;
	}

	public void setBillToEmail(String newBillToEmail) {
		billToEmail = newBillToEmail;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean newIsActive) {
		isActive = newIsActive;
	}

	public String getShipperNumber() {
		return shipperNumber;
	}

	public void setShipperNumber(String newShipperNumber) {
		shipperNumber = newShipperNumber;
	}

	public String getBillToZipCode() {
		return billToZipCode;
	}

	public void setBillToZipCode(String newBillToZipCode) {
		billToZipCode = newBillToZipCode;
	}

	public String getConsigneeZipCode() {
		return consigneeZipCode;
	}

	public void setConsigneeZipCode(String newConsigneeZipCode) {
		consigneeZipCode = newConsigneeZipCode;
	}

	public String getSenderZipCode() {
		return senderZipCode;
	}

	public void setSenderZipCode(String newSenderZipCode) {
		senderZipCode = newSenderZipCode;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date newInvoiceDate) {
		invoiceDate = newInvoiceDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date newShipDate) {
		shipDate = newShipDate;
	}

}// class