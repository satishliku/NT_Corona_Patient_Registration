package com.st.bo;

public class PatientBO {

	
	private String pName;
	private String paddress;
	private String hospitalName;
	private int daysStay;
	private float billAmonut;
	
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
	public float getBillAmonut() {
		return billAmonut;
	}
	public void setBillAmonut(float billAmonut) {
		this.billAmonut = billAmonut;
	}
	
	@Override
	public String toString() {
		return "PatientBO [pName=" + pName + ", paddress=" + paddress + ", hospitalName=" + hospitalName + ", daysStay="
				+ daysStay + ", billAmonut=" + billAmonut + "]";
	}
}
