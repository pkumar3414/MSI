package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Sandyareddy Madireddy
 * @Version : 1.0 Sandyareddy Madireddy 19-Oct-2012 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table <b> shp_allowed_user_carrier_tb
 *          </b>
 *          </p>
 */
public class AllowedUserCarrierBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -1678799234037938892L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long userCarrierId;

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
	private long userId;

	
	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a long with ...
	 *         </p>
	 */
	public long getUserCarrierId() {
		return userCarrierId;
	} // end getUserCarrierId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _userReportId
	 *            ...
	 *            </p>
	 */
	public void setUserCarrierId(long _userCarrierId) {
		userCarrierId = _userCarrierId;
	} // end setUserReportId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a long with ...
	 *         </p>
	 */
	public Long getCarrierId() {
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
	public void setCarrierId(Long _carrierId) {
		carrierId = _carrierId;
	} // end setCarrierId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a long with ...
	 *         </p>
	 */
	public long getUserId() {
		return userId;
	} // end getUserId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _userId
	 *            ...
	 *            </p>
	 */
	public void setUserId(long _userId) {
		userId = _userId;
	} // end setUserId

	/**
	 * <p>
	 * Does conversion to XML
	 * </p>
	 * <p>
	 * It is to be implemented later. @
	 * </p>
	 * 
	 * 
	 * /*public String convertToXML() { return null; }
	 */

	/**
	 * <p>
	 * Does conversion to a String
	 * </p>
	 * <p>
	 * </p>
	 * 
	 * public String toString() { return new
	 * String("UserReportId = "+userReportId+ " ;\n\rUserId = "+userId +
	 * " ;\n\rReportId = "+reportId); }
	 */

} // end AllowedUserCarrierBean

