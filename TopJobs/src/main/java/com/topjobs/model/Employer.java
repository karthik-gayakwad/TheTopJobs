package com.topjobs.model;

public class Employer {

	String sEmail;
	String sFirstName;
	String sLastName;
	String sGender;
	String sDOB;
	String sCompany;
	String sCompanySize;
	String sPhone;
	String sPassword;
	Boolean sIsActive;
	
	public Employer() {
		
	}
	
	public Employer(String sEmail, String sFirstName, String sName, String sGender, String sDOB, String sCompany,
			String sCompanySize, String sPhone, String sPassword) {
		super();
		this.sEmail = sEmail;
		this.sFirstName = sFirstName;
		this.sLastName = sName;
		this.sGender = sGender;
		this.sDOB = sDOB;
		this.sCompany = sCompany;
		this.sCompanySize = sCompanySize;
		this.sPhone = sPhone;
		this.sPassword = sPassword;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	public String getsDOB() {
		return sDOB;
	}

	public void setsDOB(String sDOB) {
		this.sDOB = sDOB;
	}

	public String getsCompany() {
		return sCompany;
	}

	public void setsCompany(String sCompany) {
		this.sCompany = sCompany;
	}

	public String getsCompanySize() {
		return sCompanySize;
	}

	public void setsCompanySize(String sCompanySize) {
		this.sCompanySize = sCompanySize;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public Boolean getsIsActive() {
		return sIsActive;
	}

	public void setsIsActive(Boolean sIsActive) {
		this.sIsActive = sIsActive;
	}

	@Override
	public String toString() {
		return "Employer [sEmail=" + sEmail + ", sFirstName=" + sFirstName + ", sLastName=" + sLastName + ", sGender="
				+ sGender + ", sDOB=" + sDOB + ", sCompany=" + sCompany + ", sCompanySize=" + sCompanySize + ", sPhone="
				+ sPhone + ", sPassword=" + sPassword + ", sIsActive=" + sIsActive + "]";
	}

	

}
