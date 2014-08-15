package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Sandyareddy Madireddy
 * @Version : 1.0 Sandyareddy Madireddy 20-Feb-2013 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table <b> shp_allowed_user_vendor_tb
 *          </b>
 *          </p>
 */
public class AllowedUserVendorBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -1678799234037938892L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long userVendorId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long vendorId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long userId;

	public long getUserVendorId() {
		return userVendorId;
	}

	public void setUserVendorId(long userVendorId) {
		this.userVendorId = userVendorId;
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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
	

} // end AllowedUserCarrierBean

