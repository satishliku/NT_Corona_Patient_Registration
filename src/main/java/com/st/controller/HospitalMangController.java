package com.st.controller;

import com.st.dto.PatientDTO;
import com.st.service.HospitalMangService;
import com.st.vo.PatientVO;

public class HospitalMangController {

	HospitalMangService service=null;
	
	
	HospitalMangController(HospitalMangService service){
		this.service=service;
	}
	
   
public String coronaPatientRegistraion(PatientVO vo) throws Exception {
	   PatientDTO dto=new PatientDTO();
	   String result=null;
	   	System.out.println(vo.getpName());
	   	System.out.println(vo.getPaddress());
	   	System.out.println(vo.getHospitalName());
	   	System.out.println(vo.getDaysStay());
	   	System.out.println(vo.getPerdayAmount());
	   	
	   dto.setpName(vo.getpName());
	   dto.setPaddress(vo.getPaddress());
	   dto.setHospitalName(vo.getHospitalName());
	   dto.setDaysStay(Integer.parseInt(vo.getDaysStay()));
	   dto.setPerdayAmount(Integer.parseInt(vo.getPerdayAmount()));
		   
		
		   System.out.println(dto.toString());
	   
		   result= service.savePatientDetails(dto);
	  
	   return result;
	}
	
	
}
