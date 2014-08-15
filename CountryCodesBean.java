package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

public class CountryCodesBean extends GenericBean {

	private static final long serialVersionUID = 1303213969049744218L;
	private String countryCode;
	private String countryCodeName;
	private String vatInFormat;
	
	public String getVatInFormat() {
		return vatInFormat;
	}
	public void setVatInFormat(String vatInFormat) {
		this.vatInFormat = vatInFormat;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryCodeName() {
		return countryCodeName;
	}
	public void setCountryCodeName(String countryCodeName) {
		this.countryCodeName = countryCodeName;
	}
	
	
}