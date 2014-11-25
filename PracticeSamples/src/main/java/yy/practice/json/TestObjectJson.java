package yy.practice.json;

import java.io.Serializable;
import java.util.Date;

public class TestObjectJson implements Serializable {

	private static final long serialVersionUID = 1L;

	private String manufacturer;

	private String manufacturerOther;

	private String firearmTypeCode;

	private String model;

	private String caliber;

	private String caliberType;

	private String displayMulCaliberValue;

	private String serialNumber;

	private boolean coregistered;

	private Date acquisitionDate;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturerOther() {
		return manufacturerOther;
	}

	public void setManufacturerOther(String manufacturerOther) {
		this.manufacturerOther = manufacturerOther;
	}

	public String getFirearmTypeCode() {
		return firearmTypeCode;
	}

	public void setFirearmTypeCode(String firearmTypeCode) {
		this.firearmTypeCode = firearmTypeCode;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	public String getCaliberType() {
		return caliberType;
	}

	public void setCaliberType(String caliberType) {
		this.caliberType = caliberType;
	}

	public String getDisplayMulCaliberValue() {
		return displayMulCaliberValue;
	}

	public void setDisplayMulCaliberValue(String displayMulCaliberValue) {
		this.displayMulCaliberValue = displayMulCaliberValue;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isCoregistered() {
		return coregistered;
	}

	public void setCoregistered(boolean coregistered) {
		this.coregistered = coregistered;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String toString() {
		return "FirearmJson [manufacturer=" + manufacturer
				+ ", manufacturerOther=" + manufacturerOther
				+ ", firearmTypeCode=" + firearmTypeCode + ", model=" + model
				+ ", caliber=" + caliber + ", caliberType=" + caliberType
				+ ", displayMulCaliberValue=" + displayMulCaliberValue
				+ ", serialNumber=" + serialNumber + ", coregistered="
				+ coregistered + ", acquisitionDate=" + acquisitionDate + "]";
	}



}
