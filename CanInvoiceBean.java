package com.myshipinfo.bean;

import java.sql.Date;
import java.sql.Timestamp;

import com.pac.bean.GenericBean;

public class CanInvoiceBean extends GenericBean{
	
	private static final long serialVersionUID = 1L;
	
	private long canInvoiceID;
	private Float primaryReference;
	private String originCity;
	private String originState;
	private String originZipCode;
	private String originCountry;
	private String destCity;
	private String destState;
	private String destZipCode;
	private String destCountry;
	private Date targetShipDate;
	private Float weight;
	private String frtClass;
	private String createUser;
	private Timestamp createDate;
	private String lastUpdateUser;
	private Timestamp lastUpdateDate;
	private long status;
	
	
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public long getCanInvoiceID() {
		return canInvoiceID;
	}
	public void setCanInvoiceID(long canInvoiceID) {
		this.canInvoiceID = canInvoiceID;
	}
	public Float getPrimaryReference() {
		return primaryReference;
	}
	public void setPrimaryReference(Float primaryReference) {
		this.primaryReference = primaryReference;
	}
	public String getOriginCity() {
		return originCity;
	}
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}
	public String getOriginState() {
		return originState;
	}
	public void setOriginState(String originState) {
		this.originState = originState;
	}
	public String getOriginZipCode() {
		return originZipCode;
	}
	public void setOriginZipCode(String originZipCode) {
		this.originZipCode = originZipCode;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	public String getDestState() {
		return destState;
	}
	public void setDestState(String destState) {
		this.destState = destState;
	}
	public String getDestZipCode() {
		return destZipCode;
	}
	public void setDestZipCode(String destZipCode) {
		this.destZipCode = destZipCode;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public Date getTargetShipDate() {
		return targetShipDate;
	}
	public void setTargetShipDate(Date targetShipDate) {
		this.targetShipDate = targetShipDate;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public String getFrtClass() {
		return frtClass;
	}
	public void setFrtClass(String frtClass) {
		this.frtClass = frtClass;
	}
	
	

}
