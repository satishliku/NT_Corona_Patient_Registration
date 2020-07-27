package com.st.service;

import com.st.bo.PatientBO;
import com.st.dao.PatientDAO;
import com.st.dto.PatientDTO;

public class HospitalMangServiceImpl implements HospitalMangService{

	private PatientDAO dao=null;
	
	HospitalMangServiceImpl(PatientDAO dao){
		this.dao=dao;
	}

	@Override
	public String savePatientDetails(PatientDTO dto) throws Exception {
		
		PatientBO bo=null;
		int count;
		bo=new PatientBO();
		//set bo properties from dto
		bo.setpName(dto.getpName());
		bo.setPaddress(dto.getPaddress());
		bo.setHospitalName(dto.getHospitalName());
		bo.setDaysStay(dto.getDaysStay());
		bo.setBillAmonut(CalculateBillAbount(dto.getDaysStay(),dto.getPerdayAmount()));
		System.out.println(dto.toString());
		
		count=dao.save(bo);
		
		if(count==0) {
			return "Corona Patient registration faild";
		}
		else {
			
			return "Corona Patient registration sucessfull and Bill Amount is"+bo.getBillAmonut();
		}
		
	}

	@Override
	public float CalculateBillAbount(int daystay, float perdatyAmount) {
		// TODO Auto-generated method stub
		float billAmonut=daystay*perdatyAmount;
		return billAmonut;
	}
	
}
