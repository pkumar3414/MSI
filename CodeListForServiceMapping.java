package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * This bean is created to get records for Service Mapping MSI-11690
 * @author Sreedhar.T
 */

public class CodeListForServiceMapping extends GenericBean {

	private static final long serialVersionUID = 1L;
	private double nspCodeValueId;
	private String codeValue;
	private String serviceId;
	private String carrierId;
	private String active;
	private String carrier;
	private String service;


	public double getNspCodeValueId() {
		return nspCodeValueId;
	}
	public void setNspCodeValueId(double nspCodeValueId) {
		this.nspCodeValueId = nspCodeValueId;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}




}
