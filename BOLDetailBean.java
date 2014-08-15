package com.myshipinfo.bean;

import com.pac.bean.GenericBean;

public class BOLDetailBean extends GenericBean {
	private static final long serialVersionUID = -2554541622933891540L;
	private long bolDetailId;
	private long bolHeaderId;
	private String detailType;
	private int lineItemNumber;
	private int pieceQuantity;
	private String packagingType;
	private Long nmfcId;
	private String description;
	private String freightClass;
	private boolean hazardMaterialInd;
	private Double length;
	private Double width;
	private Double height;
	private Double weight;
	private boolean isActive;
	private String nmfc;
	private Double lineCharge;
	private Double discount;

	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String newDetailType) {
		detailType = newDetailType;
	}

	public int getLineItemNumber() {
		return lineItemNumber;
	}

	public void setLineItemNumber(int newLineItemNumber) {
		lineItemNumber = newLineItemNumber;
	}

	public int getPieceQuantity() {
		return pieceQuantity;
	}

	public void setPieceQuantity(int newPieceQuantity) {
		pieceQuantity = newPieceQuantity;
	}

	public String getPackagingType() {
		return packagingType;
	}

	public void setPackagingType(String newPackagingType) {
		packagingType = newPackagingType;
	}

	public Long getNmfcId() {
		return nmfcId;
	}

	public void setNmfcId(Long newNmfcId) {
		nmfcId = newNmfcId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public String getFreightClass() {
		return freightClass;
	}

	public void setFreightClass(String newFreightClass) {
		freightClass = newFreightClass;
	}

	public boolean getHazardMaterialInd() {
		return hazardMaterialInd;
	}

	public void setHazardMaterialInd(boolean newHazardMaterialInd) {
		hazardMaterialInd = newHazardMaterialInd;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double newLength) {
		length = newLength;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double newWidth) {
		width = newWidth;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double newHeight) {
		height = newHeight;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double newWeight) {
		weight = newWeight;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean newIsActive) {
		isActive = newIsActive;
	}

	public String getNmfc() {
		return nmfc;
	}

	public void setNmfc(String newNmfc) {
		nmfc = newNmfc;
	}

	public Double getLineCharge() {
		return lineCharge;
	}

	public void setLineCharge(Double newLineCharge) {
		lineCharge = newLineCharge;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double newDiscount) {
		discount = newDiscount;
	}

	public long getBolDetailId() {
		return bolDetailId;
	}

	public void setBolDetailId(long newBolDetailId) {
		bolDetailId = newBolDetailId;
	}

	public long getBolHeaderId() {
		return bolHeaderId;
	}

	public void setBolHeaderId(long newBolHeaderId) {
		bolHeaderId = newBolHeaderId;
	}

}
