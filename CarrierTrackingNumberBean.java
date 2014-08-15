package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Sreedhar Mallepaddi
 * @Version : 1.0 Sreedhar Mallepaddi 16-May-2003 Created
 *          </p>
 *          <p>
 *          This Bean class represent the tracking number and the respective
 *          carrier site tracking number link
 *          </p>
 */

public class CarrierTrackingNumberBean extends GenericBean {
	private static final long serialVersionUID = 782414553770672324L;
	private String zoomUrl;
	private String trackingNumber;

	public CarrierTrackingNumberBean() {
	}

	public String getZoomUrl() {
		return zoomUrl;
	}

	public void setZoomUrl(String newZoomUrl) {
		zoomUrl = newZoomUrl;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String newTrackingNumber) {
		trackingNumber = newTrackingNumber;
	}

	public String getLink() {
		return zoomUrl + trackingNumber;
	}
}