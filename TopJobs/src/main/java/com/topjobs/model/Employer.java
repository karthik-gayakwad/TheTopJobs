package com.topjobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/*
{"SEmail":"teli.pooja@gmail.com","SFirstName":"Pooja","SName":"Teli","SGender":"Female","SCompany":"Sony","SCompanySize":"2000","SPhone":"857473784","SPassword":"Pooja"}

*/

@Entity
public class Employer {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "employer_Sequence")
    @SequenceGenerator(name = "employer_Sequence", sequenceName = "EMPLOYER_SEQ", initialValue=1, allocationSize=1)
    private Long id;
	
	@Column(name = "sEmail")
	String sEmail;
	
	@Column(name = "sFirstName")
	String sFirstName;
	
	@Column(name = "sName")
	String sName;
	
	@Column(name = "sGender")
	String sGender;
	
	@Column(name = "sDOB")
	String sDOB;
	
	@Column(name = "sCompany")
	String sCompany;
	
	@Column(name = "sCompanySize")
	String sCompanySize;
	
	@Column(name = "sPhone")
	String sPhone;
	
	@Column(name = "sPassword")
	String sPassword;
	
	public Employer() {
		
	}

	public String getSEmail() {
		return sEmail;
	}

	public void setSEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getSFirstName() {
		return sFirstName;
	}

	public void setSFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public String getSGender() {
		return sGender;
	}

	public void setSGender(String sGender) {
		this.sGender = sGender;
	}

	public String getSDOB() {
		return sDOB;
	}

	public void setSDOB(String sDOB) {
		this.sDOB = sDOB;
	}

	public String getSCompany() {
		return sCompany;
	}

	public void setSCompany(String sCompany) {
		this.sCompany = sCompany;
	}

	public String getSCompanySize() {
		return sCompanySize;
	}

	public void setSCompanySize(String sCompanySize) {
		this.sCompanySize = sCompanySize;
	}

	public String getSPhone() {
		return sPhone;
	}

	public void setSPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getSPassword() {
		return sPassword;
	}

	public void setSPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public Employer(String sEmail, String sFirstName, String sName, String sGender, String sDOB, String sCompany,
			String sCompanySize, String sPhone, String sPassword) {
		super();
		
		this.sEmail = sEmail;
		this.sFirstName = sFirstName;
		this.sName = sName;
		this.sGender = sGender;
		this.sDOB = sDOB;
		this.sCompany = sCompany;
		this.sCompanySize = sCompanySize;
		this.sPhone = sPhone;
		this.sPassword = sPassword;
	}
	
}
