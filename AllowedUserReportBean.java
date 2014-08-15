package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Sreedhar Mallepaddi
 * @Version : 1.0 Sreedhar Mallepaddi 31-Mar-2003 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table <b> shp_allowed_user_report_tb
 *          </b>
 *          </p>
 */
public class AllowedUserReportBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -1678799234037938892L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long userReportId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long reportId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long userId;

	private Long rptId;

	// /////////////////////////////////////
	// operations

	public Long getRptId() {
		return rptId;
	}

	public void setRptId(Long rptId) {
		this.rptId = rptId;
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * @return a long with ...
	 *         </p>
	 */
	public long getUserReportId() {
		return userReportId;
	} // end getUserReportId

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
	public void setUserReportId(long _userReportId) {
		userReportId = _userReportId;
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
	public long getReportId() {
		return reportId;
	} // end getReportId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _reportId
	 *            ...
	 *            </p>
	 */
	public void setReportId(long _reportId) {
		reportId = _reportId;
	} // end setReportId

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

} // end AllowedUserReportBean

