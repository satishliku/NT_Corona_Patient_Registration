package com.st.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.st.bo.PatientBO;

public class PatientImplDAO implements PatientDAO{
	
	private DataSource ds;
	
	private static final String PATIENT_INSERT_QUERY
	="INSERT INTO patiend_details (NAME,ADDRESS,HOSPITAL_NAME,DAYS_STAY,BILLAMOUNT) VALUES(?,?,?,?,?)";
	
	PatientImplDAO(DataSource ds){
		this.ds=ds;
	}
	
	@Override
	public int save(PatientBO bo) throws Exception {
		
		Connection conection=null;
		int count;
		PreparedStatement ps=null;
		
		//get The connection pool boject
		conection=ds.getConnection();
		
		//Create the prepareStatement object
		ps=conection.prepareStatement(PATIENT_INSERT_QUERY);
		
		//Set the query params
		ps.setString(1,bo.getpName());
		ps.setString(2, bo.getPaddress());
		ps.setString(3, bo.getHospitalName());
		ps.setLong(4, bo.getDaysStay());
		ps.setFloat(5, bo.getBillAmonut());
		
		//Exicute the sql statement
		count=ps.executeUpdate();
		
		ps.close();
		conection.close();
		
		return count;
	} 

}
