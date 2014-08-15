package com.myshipinfo.bean;

import java.util.Collection;

import com.pac.bean.GenericBean;
import com.pac.bean.IBean;

public class BOLHeaderCBean extends GenericBean {
	static final long serialVersionUID = 7526471111622776147L;

	private BOLHeaderBean bolHeaderBean;
	private Collection<IBean> bolDetailList;

	public BOLHeaderBean getBolHeaderBean() {
		return bolHeaderBean;
	}

	public void setBolHeaderBean(BOLHeaderBean newBolHeaderBean) {
		bolHeaderBean = newBolHeaderBean;
	}

	public Collection<IBean> getBolDetailList() {
		return bolDetailList;
	}

	public void setBolDetailList(Collection<IBean> newBolDetailList) {
		bolDetailList = newBolDetailList;
	}

}