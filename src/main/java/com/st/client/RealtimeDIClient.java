package com.st.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.st.controller.HospitalMangController;
import com.st.vo.PatientVO;

public class RealtimeDIClient {

	
	

	public static void main(String[] args) {
		String pName,pAddress,hospitalName,daystay,perdayAmount;
		
		PatientVO vo=null;
		HospitalMangController controller=null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		String result=null;
		
		
		Scanner userInput=null;
		userInput=new Scanner(System.in);
		
		//Take Input of Patient and Set to PatiendVO
		
		System.out.println("Enter Patient Name");
		pName=userInput.next();
		
		
		System.out.println("Enter Address");
		pAddress=userInput.next();
		
		
		System.out.println("Enter Hospita Name");
		hospitalName=userInput.next();
		
		
		System.out.println("Enter How Many Days Stay");
		daystay=userInput.next();
		
		
		System.out.println("Enter Per Day Charg Amount");
		perdayAmount=userInput.next();
		

		vo=new PatientVO();
		vo.setpName(pName);
		vo.setPaddress(pAddress);
		vo.setHospitalName(hospitalName);
		vo.setDaysStay(daystay);
		vo.setPerdayAmount(perdayAmount);
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/st/cfg/applicationContext.xml");
		// get Controller Bean class object..
		controller = factory.getBean("controller", HospitalMangController.class);
		
		try {
			result=controller.coronaPatientRegistraion(vo);
			System.out.println(result);
			
		}
		catch(Exception e) {
			System.out.println("Corona Petient Registation Faild");
			e.printStackTrace();
		}
	}

}
