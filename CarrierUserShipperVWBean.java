package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Sreedhar Mallepaddi
 * @Version : 1.0 Sreedhar Mallepaddi 31-Mar-2003 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table <b> shp_shipper_tb </b>
 *          </p>
 */
public class CarrierUserShipperVWBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -3013617090785087296L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long shipperId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String shipperCode;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String email;

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
	private String userName;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String password;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String accessLicenseNumber;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private boolean isPoolPoint;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private boolean isMbaClient;
	private boolean poolPointUPS;
	private String dhlUserName;
	private String dhlPassword;
	private String dhlShippingKey;

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
	public long getShipperId() {
		return shipperId;
	} // end getShipperId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _shipperId
	 *            ...
	 *            </p>
	 */
	public void setShipperId(long _shipperId) {
		shipperId = _shipperId;
	} // end setShipperId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getShipperCode() {
		return shipperCode;
	} // end getShipperCode

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _shipperCode
	 *            ...
	 *            </p>
	 */
	public void setShipperCode(String _shipperCode) {
		shipperCode = _shipperCode;
	} // end setShipperCode

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getEmail() {
		return email;
	} // end getEmail

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _email
	 *            ...
	 *            </p>
	 */
	public void setEmail(String _email) {
		email = _email;
	} // end setEmail

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
	public String getUserName() {
		return userName;
	} // end getUserName

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _userName
	 *            ...
	 *            </p>
	 */
	public void setUserName(String _userName) {
		userName = _userName;
	} // end setUserName

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getPassword() {
		return password;
	} // end getPassword

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _password
	 *            ...
	 *            </p>
	 */
	public void setPassword(String _password) {
		password = _password;
	} // end setPassword

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getAccessLicenseNumber() {
		return accessLicenseNumber;
	} // end getAccessLicenseNumber

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _accessLicenseNumber
	 *            ...
	 *            </p>
	 */
	public void setAccessLicenseNumber(String _accessLicenseNumber) {
		accessLicenseNumber = _accessLicenseNumber;
	} // end setAccessLicenseNumber

	public boolean getIsPoolPoint() {
		return isPoolPoint;
	}

	public void setIsPoolPoint(boolean _poolPoint) {
		isPoolPoint = _poolPoint;
	}

	public boolean getIsMbaClient() {
		return isMbaClient;
	}

	public void setIsMbaClient(boolean _mbaClient) {
		isMbaClient = _mbaClient;
	}

	public boolean isPoolPointUPS() {
		return poolPointUPS;
	}

	public void setPoolPointUPS(boolean newPoolPointUPS) {
		poolPointUPS = newPoolPointUPS;
	}

	public String getDhlUserName() {
		return dhlUserName;
	}

	public void setDhlUserName(String newDhlUserName) {
		dhlUserName = newDhlUserName;
	}

	public String getDhlPassword() {
		return dhlPassword;
	}

	public void setDhlPassword(String newDhlPassword) {
		dhlPassword = newDhlPassword;
	}

	public String getDhlShippingKey() {
		return dhlShippingKey;
	}

	public void setDhlShippingKey(String newDhlShippingKey) {
		dhlShippingKey = newDhlShippingKey;
	}

	/**
	 * <p>
	 * Does conversion to XML
	 * </p>
	 * <p>
	 * It is to be implemented later. @
	 * </p>
	 * 
	 * 
	 * public String convertToXML() { return null; }
	 */

	/*
	 * public String toString() { return new String( " SHIPPER_ID="+ shipperId +
	 * "\r\nSHIPPER_CODE=" + shipperCode + "\r\nEMAIL " + email +
	 * "\r\nCARRIER ID " + carrierId + "\r\nCARRIER NAME " + carrierName +
	 * "\r\nUSER NAME " + userName + "\r\nPASSWORD " + password +
	 * "\r\nAccess License Number " + accessLicenseNumber );
	 * 
	 * }
	 */

} // end ShipperBean
