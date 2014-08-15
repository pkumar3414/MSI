package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

public class ChargeCodeBean extends GenericBean {
	private static final long serialVersionUID = 3069292355551212856L;
	private long chargeCodeId;
	private String chargeCode;
	private String chargeDescription;
	private String tranCode;
	private long carrierId;

	public long getChargeCodeId() {
		return chargeCodeId;
	}

	public void setChargeCodeId(long newChargeCodeId) {
		chargeCodeId = newChargeCodeId;
	}

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String newChargeCode) {
		chargeCode = newChargeCode;
	}

	public String getChargeDescription() {
		return chargeDescription;
	}

	public void setChargeDescription(String newChargeDescription) {
		chargeDescription = newChargeDescription;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String newTranCode) {
		tranCode = newTranCode;
	}

	public long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(long newCarrierId) {
		carrierId = newCarrierId;
	}

}