package com.myshipinfo.bean;

import com.pac.bean.*;
import java.sql.Date;

/**
 * <p>
 * 
 * @author Sreedhar Mallepaddi
 * @Version : 1.0 Sreedhar Mallepaddi 24-Jul-2003 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table shp_Ebill_area_surcharge_tb
 *          </p>
 */

public class AreaSurchargeBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	private long areaSurchargeId;
	private String zipCode;
	private double surcharge;
	private boolean airborne;
	private boolean fedexExp;
	private boolean fedexGnd;
	private boolean ups;
	private Date fromDate;
	private Date toDate;

	public long getAreaSurchargeId() {
		return areaSurchargeId;
	}

	public void setAreaSurchargeId(long newAreaSurchargeId) {
		areaSurchargeId = newAreaSurchargeId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String newZipCode) {
		zipCode = newZipCode;
	}

	public double getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(double newSurcharge) {
		surcharge = newSurcharge;
	}

	public boolean isAirborne() {
		return airborne;
	}

	public void setAirborne(boolean newAirborne) {
		airborne = newAirborne;
	}

	public boolean isUps() {
		return ups;
	}

	public void setUps(boolean newUps) {
		ups = newUps;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date newToDate) {
		toDate = newToDate;
	}

	public boolean isFedexExp() {
		return fedexExp;
	}

	public void setFedexExp(boolean newFedexExp) {
		fedexExp = newFedexExp;
	}

	public boolean isFedexGnd() {
		return fedexGnd;
	}

	public void setFedexGnd(boolean newFedexGnd) {
		fedexGnd = newFedexGnd;
	}
}