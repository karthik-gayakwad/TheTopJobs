package com.topjobs.model;

public class JobSeeker {
	
	String SEmail;
	String SFisrtName;
	String SLastName;
	String SGender;
	String SDOB;
	String SPhone;
	String SPassword;
	String SCity;
	public JobSeeker() {
		super();
	}
	public JobSeeker(String sEmail, String sFisrtName, String sLastName, String sGender, String sDOB, String sPhone,
			String sPassword, String sCity) {
		super();
		SEmail = sEmail;
		SFisrtName = sFisrtName;
		SLastName = sLastName;
		SGender = sGender;
		SDOB = sDOB;
		SPhone = sPhone;
		SPassword = sPassword;
		SCity = sCity;
	}
	public String getSEmail() {
		return SEmail;
	}
	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}
	public String getSFisrtName() {
		return SFisrtName;
	}
	public void setSFisrtName(String sFisrtName) {
		SFisrtName = sFisrtName;
	}
	public String getSLastName() {
		return SLastName;
	}
	public void setSLastName(String sLastName) {
		SLastName = sLastName;
	}
	public String getSGender() {
		return SGender;
	}
	public void setSGender(String sGender) {
		SGender = sGender;
	}
	public String getSDOB() {
		return SDOB;
	}
	public void setSDOB(String sDOB) {
		SDOB = sDOB;
	}
	public String getSPhone() {
		return SPhone;
	}
	public void setSPhone(String sPhone) {
		SPhone = sPhone;
	}
	public String getSPassword() {
		return SPassword;
	}
	public void setSPassword(String sPassword) {
		SPassword = sPassword;
	}
	public String getSCity() {
		return SCity;
	}
	public void setSCity(String sCity) {
		SCity = sCity;
	}

}
