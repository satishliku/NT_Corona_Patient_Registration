package com.st.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {

	private String pName;
	private String paddress;
	private String hospitalName;
	private int daysStay;
	private float perdayAmount;
	
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public int getDaysStay() {
		return daysStay;
	}
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	
	public float getPerdayAmount() {
		return perdayAmount;
	}
	public void setPerdayAmount(float perdayAmount) {
		this.perdayAmount = perdayAmount;
	}
	
	@Override
	public String toString() {
		return "PatientDTO [pName=" + pName + ", paddress=" + paddress + ", hospitalName=" + hospitalName
				+ ", daysStay=" + daysStay + ", perdayAmount=" + perdayAmount + "]";
	}
	
	
	
}
