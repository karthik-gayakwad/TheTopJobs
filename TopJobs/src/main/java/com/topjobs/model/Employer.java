package com.topjobs.model;

public class Employer {
	String SEmail;
	String SFirstName;
	String SName;
	String SGender;
	String SDOB;
	String SCompany;
	String SCompanySize;
	String SPhone;
	String SPassword;
	
	public Employer() {
		
	}

	public String getSEmail() {
		return SEmail;
	}

	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}

	public String getSFirstName() {
		return SFirstName;
	}

	public void setSFirstName(String sFirstName) {
		SFirstName = sFirstName;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
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

	public String getSCompany() {
		return SCompany;
	}

	public void setSCompany(String sCompany) {
		SCompany = sCompany;
	}

	public String getSCompanySize() {
		return SCompanySize;
	}

	public void setSCompanySize(String sCompanySize) {
		SCompanySize = sCompanySize;
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

	public Employer(String sEmail, String sFirstName, String sName, String sGender, String sDOB, String sCompany,
			String sCompanySize, String sPhone, String sPassword) {
		super();
		SEmail = sEmail;
		SFirstName = sFirstName;
		SName = sName;
		SGender = sGender;
		SDOB = sDOB;
		SCompany = sCompany;
		SCompanySize = sCompanySize;
		SPhone = sPhone;
		SPassword = sPassword;
	}
	
}
