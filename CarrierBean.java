package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Sreedhar Mallepaddi
 * @Version : 1.0 Sreedhar Mallepaddi 10-Apr-2003 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table shp_carrier_tb
 *          </p>
 */
public class CarrierBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -1817880393493081984L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long carrierId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String carrierName;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String carrierDescription;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String zoomURL;
	private boolean isLTL;
	private boolean isFTL;
	private boolean isAir;
	private boolean isOcean;
	private String scacCode;
	private String remitToAddress1;
	private String remitToAddress2;
	private String remitToCity;
	private String remitToState;
	private String remitToZipCode;
	private String remitToCountry;
	private String remitToContact;
	private String remitToPhone;
	private String remitToFax;
	private String remitToEmail;
	private String ediAddress;
	private String ediUserId;
	private String ediPassword;
	private boolean alwaysUseThisAddress;
	private boolean send997;
	private boolean isTl;
	private boolean isTlPrimary;
	private Long tlEdiMethod;
	private boolean isLtlPrimary;
	private Long ltlEdiMethod;
	private boolean isAirPrimary;
	private Long airEdiMethod;
	private boolean isOceanPrimary;
	private Long oceanEdiMethod;
	private boolean isInterModal;
	private boolean isInterModalPrimary;
	private Long interModalEdiMethod;
	private boolean isActive;
	private String invoiceFormat;
	private String carrierModes;
	private String primaryMode;
	private String ediMethods;

	// /////////////////////////////////////
	// operations

	

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a long with ...
	 *         </p>
	 */
	public long getCarrierId() {
		return carrierId;
	} // end getCarrierId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _carrierId
	 *            ...
	 *            </p>
	 */
	public void setCarrierId(long _carrierId) {
		carrierId = _carrierId;
	} // end setCarrierId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getCarrierName() {
		return carrierName;
	} // end getCarrierName

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _carrierName
	 *            ...
	 *            </p>
	 */
	public void setCarrierName(String _carrierName) {
		carrierName = _carrierName;
	} // end setCarrierName

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getCarrierDescription() {
		return carrierDescription;
	} // end getCarrierDescription

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _carrierDescription
	 *            ...
	 *            </p>
	 */
	public void setCarrierDescription(String _carrierDescription) {
		carrierDescription = _carrierDescription;
	} // end setCarrierDescription

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getZoomURL() {
		return zoomURL;
	} // end getZoomURL

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _zoomURL
	 *            ...
	 *            </p>
	 */
	public void setZoomURL(String _zoomURL) {
		zoomURL = _zoomURL;
	} // end setZoomURL

	public boolean isLTL() {
		return isLTL;
	}

	public void setLTL(boolean newIsLTL) {
		isLTL = newIsLTL;
	}

	public boolean isIsFTL() {
		return isFTL;
	}

	public void setIsFTL(boolean newIsFTL) {
		isFTL = newIsFTL;
	}

	public void setAir(boolean isAir) {
		this.isAir = isAir;
	}

	public void setOcean(boolean newIsOcean) {
		isOcean = newIsOcean;
	}

	public String getScacCode() {
		return scacCode;
	}

	public void setScacCode(String newScacCode) {
		scacCode = newScacCode;
	}

	public String getRemitToAddress1() {
		return remitToAddress1;
	}

	public void setRemitToAddress1(String newRemitToAddress1) {
		remitToAddress1 = newRemitToAddress1;
	}

	public String getRemitToAddress2() {
		return remitToAddress2;
	}

	public void setRemitToAddress2(String newRemitToAddress2) {
		remitToAddress2 = newRemitToAddress2;
	}

	public String getRemitToCity() {
		return remitToCity;
	}

	public void setRemitToCity(String newRemitToCity) {
		remitToCity = newRemitToCity;
	}

	public String getRemitToState() {
		return remitToState;
	}

	public void setRemitToState(String newRemitToState) {
		remitToState = newRemitToState;
	}

	public String getRemitToZipCode() {
		return remitToZipCode;
	}

	public void setRemitToZipCode(String newRemitToZipCode) {
		remitToZipCode = newRemitToZipCode;
	}

	public String getRemitToCountry() {
		return remitToCountry;
	}

	public void setRemitToCountry(String newRemitToCountry) {
		remitToCountry = newRemitToCountry;
	}

	public String getRemitToContact() {
		return remitToContact;
	}

	public void setRemitToContact(String newRemitToContact) {
		remitToContact = newRemitToContact;
	}

	public String getRemitToPhone() {
		return remitToPhone;
	}

	public void setRemitToPhone(String newRemitToPhone) {
		remitToPhone = newRemitToPhone;
	}

	public String getRemitToFax() {
		return remitToFax;
	}

	public void setRemitToFax(String newRemitToFax) {
		remitToFax = newRemitToFax;
	}

	public String getRemitToEmail() {
		return remitToEmail;
	}

	public void setRemitToEmail(String newRemitToEmail) {
		remitToEmail = newRemitToEmail;
	}

	public boolean isAir() {
		return isAir;
	}

	public boolean isOcean() {
		return isOcean;
	}

	public String getEdiAddress() {
		return ediAddress;
	}

	public void setEdiAddress(String ediAddress) {
		this.ediAddress = ediAddress;
	}

	public String getEdiUserId() {
		return ediUserId;
	}

	public void setEdiUserId(String ediUserId) {
		this.ediUserId = ediUserId;
	}

	public String getEdiPassword() {
		return ediPassword;
	}

	public void setEdiPassword(String ediPassword) {
		this.ediPassword = ediPassword;
	}

	public boolean isAlwaysUseThisAddress() {
		return alwaysUseThisAddress;
	}

	public void setAlwaysUseThisAddress(boolean alwaysUseThisAddress) {
		this.alwaysUseThisAddress = alwaysUseThisAddress;
	}

	public boolean isSend997() {
		return send997;
	}

	public void setSend997(boolean send997) {
		this.send997 = send997;
	}

	public boolean isTl() {
		return isTl;
	}

	public void setTl(boolean isTl) {
		this.isTl = isTl;
	}

	public boolean isTlPrimary() {
		return isTlPrimary;
	}

	public void setTlPrimary(boolean isTlPrimary) {
		this.isTlPrimary = isTlPrimary;
	}

	public Long getTlEdiMethod() {
		return tlEdiMethod;
	}

	public boolean isLtlPrimary() {
		return isLtlPrimary;
	}

	public void setLtlPrimary(boolean isLtlPrimary) {
		this.isLtlPrimary = isLtlPrimary;
	}

	public void setTlEdiMethod(Long tlEdiMethod) {
		this.tlEdiMethod = tlEdiMethod;
	}

	public Long getLtlEdiMethod() {
		return ltlEdiMethod;
	}

	public void setLtlEdiMethod(Long ltlEdiMethod) {
		this.ltlEdiMethod = ltlEdiMethod;
	}

	public boolean isAirPrimary() {
		return isAirPrimary;
	}

	public void setAirPrimary(boolean isAirPrimary) {
		this.isAirPrimary = isAirPrimary;
	}

	public Long getAirEdiMethod() {
		return airEdiMethod;
	}

	public void setAirEdiMethod(Long airEdiMethod) {
		this.airEdiMethod = airEdiMethod;
	}

	public boolean isOceanPrimary() {
		return isOceanPrimary;
	}

	public void setOceanPrimary(boolean isOceanPrimary) {
		this.isOceanPrimary = isOceanPrimary;
	}

	public Long getOceanEdiMethod() {
		return oceanEdiMethod;
	}

	public void setOceanEdiMethod(Long oceanEdiMethod) {
		this.oceanEdiMethod = oceanEdiMethod;
	}

	public boolean isInterModal() {
		return isInterModal;
	}

	public void setInterModal(boolean isInterModal) {
		this.isInterModal = isInterModal;
	}

	public boolean isInterModalPrimary() {
		return isInterModalPrimary;
	}

	public void setInterModalPrimary(boolean isInterModalPrimary) {
		this.isInterModalPrimary = isInterModalPrimary;
	}

	public Long getInterModalEdiMethod() {
		return interModalEdiMethod;
	}

	public void setInterModalEdiMethod(Long interModalEdiMethod) {
		this.interModalEdiMethod = interModalEdiMethod;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getInvoiceFormat() {
		return invoiceFormat;
	}

	public void setInvoiceFormat(String invoiceFormat) {
		this.invoiceFormat = invoiceFormat;
	}

	public String getCarrierModes() {
		return carrierModes;
	}

	public void setCarrierModes(String carrierModes) {
		this.carrierModes = carrierModes;
	}

	public String getPrimaryMode() {
		return primaryMode;
	}

	public void setPrimaryMode(String primaryMode) {
		this.primaryMode = primaryMode;
	}

	public String getEdiMethods() {
		return ediMethods;
	}

	public void setEdiMethods(String ediMethods) {
		this.ediMethods = ediMethods;
	}

} // end CarrierBean

