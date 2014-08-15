package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Kamal K Ganti
 * @version 1.0 Kamal K Ganti 15-oct-2007 Created The AssignedShipperGroupBean
 *          is a frame that links shipper group object and shipper object
 *          </p>
 * 
 */
public class AssignedShipperGroupBean extends GenericBean {

	// attributes

	private static final long serialVersionUID = 1L;
	private long assignedShipperGroupId;
	private long shipperGroupId;
	private long shipperId;

	// getter methods
	public long getAssignedShipperGroupId() {
		return assignedShipperGroupId;
	}

	public long getShipperGroupId() {
		return shipperGroupId;
	}

	public long getShipperId() {
		return shipperId;
	}

	// setter method

	public void setAssignedShipperGroupId(long assignedShipperGroupId) {
		this.assignedShipperGroupId = assignedShipperGroupId;
	}

	public void setShipperGroupId(long shipperGroupId) {
		this.shipperGroupId = shipperGroupId;
	}

	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}

}