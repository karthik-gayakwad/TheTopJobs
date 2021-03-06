package com.topjobs.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employer_Sequence")
	@SequenceGenerator(name = "employer_Sequence", sequenceName = "EMPLOYER_SEQ", initialValue = 1, allocationSize = 1)
	private Long employer_id;

	@Column(name = "sEmail")
	String sEmail;

	@Column(name = "sFirstName")
	String sFirstName;

	@Column(name = "sName")
	String sLastName;

	@Column(name = "sGender")
	String sGender;

	@Column(name = "sDOB")
	String sDOB;

	@Column(name = "sPhone")
	String sPhone;

	@Column(name = "sPassword")
	String sPassword;

	@Column(name = "sIsActive")
	Boolean sIsActive;
	
	@Column(name = "sUserType")
	String sUserType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "employer")
    private Set<Qualification> qualification;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "employer")
    private Set<WorkExperience> workexperience;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "employer")
    private Set<Post> post;

	public Employer() {
	}

	public Employer(String sEmail, String sFirstName, String sName, String sGender, String sDOB, String sPhone,
			String sPassword, Boolean sIsActive,String sUserType) {

		super();

		this.sEmail = sEmail;
		this.sFirstName = sFirstName;
		this.sLastName = sName;
		this.sGender = sGender;
		this.sDOB = sDOB;
		this.sPhone = sPhone;
		this.sPassword = sPassword;
		this.sIsActive = sIsActive;
		this.sUserType = sUserType;
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
	public String getsUserType() {
		return sUserType;
	}

	public void setsUserType(String sUserType) {
		this.sUserType = sUserType;
	}
	
	@Override
	public String toString() {
		return "Employer [id=" + employer_id + ", sEmail=" + sEmail + ", sFirstName=" + sFirstName + ", sLastName=" + sLastName
				+ ", sGender=" + sGender + ", sDOB=" + sDOB +  ", sPhone=" + sPhone + ", sPassword=" + sPassword + ", sIsActive=" + sIsActive
				+ ", sUserType=" + sUserType + "]";
	
	}

}
