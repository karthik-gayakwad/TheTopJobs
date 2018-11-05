package com.topjobs.TopJobs;

import java.util.Date;

public class Employer {
	String employerEmail;
	String employerFirstName;
	String employerLastName;
	String employerGender;
	String employerDOB;
	String employerCompany;
	String employerCompanySize;
	String employerPhone;
	String employerPassword;
	public Employer() {
		super();
	}
	public Employer(String employerEmail, String employerFirstName, String employerLastName, String employerGender,
			String employerDOB, String employerCompany, String employerCompanySize, String employerPhone,
			String employerPassword) {
		super();
		this.employerEmail = employerEmail;
		this.employerFirstName = employerFirstName;
		this.employerLastName = employerLastName;
		this.employerGender = employerGender;
		this.employerDOB = employerDOB;
		this.employerCompany = employerCompany;
		this.employerCompanySize = employerCompanySize;
		this.employerPhone = employerPhone;
		this.employerPassword = employerPassword;
	}
	public String getEmployerEmail() {
		return employerEmail;
	}
	public void setEmployerEmail(String employerEmail) {
		this.employerEmail = employerEmail;
	}
	public String getEmployerFirstName() {
		return employerFirstName;
	}
	public void setEmployerFirstName(String employerFirstName) {
		this.employerFirstName = employerFirstName;
	}
	public String getEmployerLastName() {
		return employerLastName;
	}
	public void setEmployerLastName(String employerLastName) {
		this.employerLastName = employerLastName;
	}
	public String getEmployerGender() {
		return employerGender;
	}
	public void setEmployerGender(String employerGender) {
		this.employerGender = employerGender;
	}
	public String getEmployerDOB() {
		return employerDOB;
	}
	public void setEmployerDOB(String employerDOB) {
		this.employerDOB = employerDOB;
	}
	public String getEmployerCompany() {
		return employerCompany;
	}
	public void setEmployerCompany(String employerCompany) {
		this.employerCompany = employerCompany;
	}
	public String getEmployerCompanySize() {
		return employerCompanySize;
	}
	public void setEmployerCompanySize(String employerCompanySize) {
		this.employerCompanySize = employerCompanySize;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public String getEmployerPassword() {
		return employerPassword;
	}
	public void setEmployerPassword(String employerPassword) {
		this.employerPassword = employerPassword;
	}
	
	
}
