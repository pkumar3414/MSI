package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * 
 * @author Sreedhar Mallepaddi
 * @version 1.0
 * @Created by Sreedhar Mallepaddi 25-apr-2003
 *          <p>
 *          This bean represent the shp_carrier_user_shipper_tb
 *          </p>
 * 
 */
public class CarrierUserShipperBean extends GenericBean {

	// /////////////////////////////////////
	// attributes

	private static final long serialVersionUID = -4813691000685691315L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private long carrierUserShipperId;

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
	private long shipperId;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 */
	private Long carrierUserId;

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
	public long getCarrierUserShipperId() {
		return carrierUserShipperId;
	} // end getCarrierUserShipperId

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * <p>
	 * 
	 * </p>
	 * <p>
	 * 
	 * @param _carrierUserShipperId
	 *            ...
	 *            </p>
	 */
	public void setCarrierUserShipperId(long _carrierUserShipperId) {
		carrierUserShipperId = _carrierUserShipperId;
	} // end setCarrierUserShipperId

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
	 * @return a Long with ...
	 *         </p>
	 */
	public Long getCarrierUserId() {
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
	public void setCarrierUserId(Long _carrierUserId) {
		carrierUserId = _carrierUserId;
	} // end setCarrierUserId

} // end CarrierUserShipperBean

