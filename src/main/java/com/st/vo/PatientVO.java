package com.st.vo;

public class PatientVO {

	private String pName;
	private String paddress;
	private String hospitalName;
	private String daysStay;
	private String perdayAmount;
	
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
	public String getDaysStay() {
		return daysStay;
	}
	public void setDaysStay(String daysStay) {
		this.daysStay = daysStay;
	}
	public String getPerdayAmount() {
		return perdayAmount;
	}
	public void setPerdayAmount(String perdayAmount) {
		this.perdayAmount = perdayAmount;
	}
	
	@Override
	public String toString() {
		return "PatientVO [pName=" + pName + ", paddress=" + paddress + ", hospitalName=" + hospitalName + ", daysStay="
				+ daysStay + ", perdayAmount=" + perdayAmount + "]";
	}
	
	
	
	
	
	
}
