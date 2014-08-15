package com.myshipinfo.bean;

import com.pac.bean.GenericBean;
import java.sql.Date;

/** Added by Suresh Gaddam */

public class CreditMaintenanceListVWBean extends GenericBean {
	private static final long serialVersionUID = -7155615472299553579L;
	private String bolNumber;
	private String customerName;
	private String proNumber;
	private String scacCode;
	private String carrierName;
	private Date bolDate;
	private Long lineItemNumber;
	private String nmfc;
	private String freightClass;
	private String description;
	private Double lineCharge;
	private long carrierId;
	private long customerId;
	private String status;

	public String getBolNumber() {
		return bolNumber;
	}

	public void setBolNumber(String newBolNumber) {
		bolNumber = newBolNumber;
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

	public String getScacCode() {
		return scacCode;
	}

	public void setScacCode(String newScacCode) {
		scacCode = newScacCode;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String newCarrierName) {
		carrierName = newCarrierName;
	}

	public Date getBolDate() {
		return bolDate;
	}

	public void setBolDate(Date newBolDate) {
		bolDate = newBolDate;
	}

	public Long getLineItemNumber() {
		return lineItemNumber;
	}

	public void setLineItemNumber(Long newLineItemNumber) {
		lineItemNumber = newLineItemNumber;
	}

	public String getNmfc() {
		return nmfc;
	}

	public void setNmfc(String newNmfc) {
		nmfc = newNmfc;
	}

	public String getFreightClass() {
		return freightClass;
	}

	public void setFreightClass(String newFreightClass) {
		freightClass = newFreightClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public Double getLineCharge() {
		return lineCharge;
	}

	public void setLineCharge(Double newLineCharge) {
		lineCharge = newLineCharge;
	}

	public long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(long newCarrierId) {
		carrierId = newCarrierId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long newCustomerId) {
		customerId = newCustomerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

}