package com.myshipinfo.bean;

import java.sql.Date;

import com.myshipinfo.util.Constants;
import com.pac.bean.GenericBean;

/**
 * 
 * @author Sreedhar Mallepaddi
 * @version 1.0
 * @Created by Sreedhar Mallepaddi 25-apr-2003
 *          <p>
 *          This bean represent the shp_carrier_users_tb
 *          </p>
 * 
 */
public class CarrierUserBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	/**
	 * 
	 */
	private static final long serialVersionUID = 7794542515077888211L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long carrierUserId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String username;

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
	private Date lastChanged;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private String accessLicenseNumber = Constants.UPS_DEFAULT_ACCESS_LICENCE_KEY;

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
	public long getCarrierUserId() {
		return carrierUserId;
	} // end getCarrierUserId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _carrierUserId
	 *            ...
	 *            </p>
	 */
	public void setCarrierUserId(long _carrierUserId) {
		carrierUserId = _carrierUserId;
	} // end setCarrierUserId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a String with ...
	 *         </p>
	 */
	public String getUsername() {
		return username;
	} // end getUsername

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _username
	 *            ...
	 *            </p>
	 */
	public void setUsername(String _username) {
		username = _username;
	} // end setUsername

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
	 * @return a java.sql.Date with ...
	 *         </p>
	 */
	public java.sql.Date getLastChanged() {
		return lastChanged;
	} // end getLastChanged

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _lastChanged
	 *            ...
	 *            </p>
	 */
	public void setLastChanged(java.sql.Date _lastChanged) {
		lastChanged = _lastChanged;
	} // end setLastChanged

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

} // end CarrierUserBean
