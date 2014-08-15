package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * tracknow table bean.
 * </p>
 * 
 */
public class AlertTrackNowBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = 1L;
	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long alertTrackNowId;

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
	private String trackingNumber;
	private boolean emailSent12;

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
	public long getAlertTrackNowId() {
		return alertTrackNowId;
	} // end getTrackNowId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _trackNowId
	 *            ...
	 *            </p>
	 */
	public void setAlertTrackNowId(long _alertTrackNowId) {
		alertTrackNowId = _alertTrackNowId;
	} // end setTrackNowId

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
	public String getTrackingNumber() {
		return trackingNumber;
	} // end getTrackingNumber

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @param _trackingNumber
	 *            ...
	 *            </p>
	 *            <p>
	 * 
	 *            </p>
	 */
	public void setTrackingNumber(String _trackingNumber) {
		trackingNumber = _trackingNumber;
	} // end setTrackingNumber

	public boolean isEmailSent12() {
		return emailSent12;
	}

	public void setEmailSent12(boolean newEmailSent12) {
		emailSent12 = newEmailSent12;
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * 
	 * public String convertToXML() { // your code here return null; } // end
	 * convertToXML
	 */
} // end TrackNowBean

