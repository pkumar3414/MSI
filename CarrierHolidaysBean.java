package com.myshipinfo.bean;

import java.util.Date;

import com.pac.bean.GenericBean;

/**
 * <p>
 * 
 * @author Kamal K Ganti
 * @Version : 1.0 Kamal K Ganti 06-Dec-2006 Created
 *          </p>
 *          <p>
 *          This Bean class represent the table shp_Carrier_Holidays_tb
 *          </p>
 */
public class CarrierHolidaysBean extends GenericBean {
	private static final long serialVersionUID = 7826362830679637381L;

	public CarrierHolidaysBean() {
	}

	/**
	 * <p>
	 * Represents ... carrier_id field in shp_Carrier_Holidays_tb
	 * </p>
	 */
	private long carrierId;

	/**
	 * <p>
	 * Represents ...holiday_id field in shp_Carrier_Holidays_tb
	 * </p>
	 */
	private long holidayId;

	/**
	 * <p>
	 * Represents ...holiday field in shp_Carrier_Holidays_tb
	 * </p>
	 */
	private Date holiday;

	/**
	 * <p>
	 * Represents ...description field in shp_Carrier_Holidays_tb
	 * </p>
	 */
	private String description;
	private boolean groundHoliday;
	private boolean airHoliday;
	private String serviceCode;
	private int graceTime;
	private boolean isAir;
	private boolean isIntl;
	private boolean hdHoliday;

	/**
	 * <p>
	 * Represents ...only_ground field in shp_Carrier_Holidays_tb
	 * </p>
	 */

	public long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(long newCarrierId) {
		carrierId = newCarrierId;
	}

	public Date getHoliday() {
		return holiday;
	}

	public void setHoliday(Date newHoliday) {
		holiday = newHoliday;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public long getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(long newHolidayId) {
		holidayId = newHolidayId;
	}

	public boolean isGroundHoliday() {
		return groundHoliday;
	}

	public void setGroundHoliday(boolean newGroundHoliday) {
		groundHoliday = newGroundHoliday;
	}

	public boolean isAirHoliday() {
		return airHoliday;
	}

	public void setAirHoliday(boolean newAirHoliday) {
		airHoliday = newAirHoliday;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String newServiceCode) {
		serviceCode = newServiceCode;
	}

	public int getGraceTime() {
		return graceTime;
	}

	public void setGraceTime(int newGraceTime) {
		graceTime = newGraceTime;
	}

	public boolean isIsAir() {
		return isAir;
	}

	public void setIsAir(boolean newIsAir) {
		isAir = newIsAir;
	}

	public boolean isIsIntl() {
		return isIntl;
	}

	public void setIsIntl(boolean newIsIntl) {
		isIntl = newIsIntl;
	}

	public boolean isHdHoliday() {
		return hdHoliday;
	}

	public void setHdHoliday(boolean newHdHoliday) {
		hdHoliday = newHdHoliday;
	}

	// /////////////////////////////////////
	// operations

}