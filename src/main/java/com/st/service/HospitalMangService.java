package com.st.service;

import com.st.dto.PatientDTO;

public interface HospitalMangService {

	public String savePatientDetails(PatientDTO dto) throws Exception;
	public float CalculateBillAbount(int daystay,float perdatyAmount);
}
