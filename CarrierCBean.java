package com.myshipinfo.bean;

import java.util.ArrayList;

import com.pac.bean.GenericBean;

public class CarrierCBean extends GenericBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CarrierBean carrierBean;
	private ArrayList<NspContactBean> nspContactBeanList;
	private NspLocationBean nspLocationBean;

	public CarrierBean getCarrierBean() {
		return carrierBean;
	}

	public void setCarrierBean(CarrierBean carrierBean) {
		this.carrierBean = carrierBean;
	}

	public ArrayList<NspContactBean> getNspContactBeanList() {
		return nspContactBeanList;
	}

	public void setNspContactBeanList(ArrayList<NspContactBean> nspContactBean) {
		this.nspContactBeanList = nspContactBean;
	}

	public NspLocationBean getNspLocationBean() {
		return nspLocationBean;
	}

	public void setNspLocationBean(NspLocationBean nspLocationBean) {
		this.nspLocationBean = nspLocationBean;
	}

}
