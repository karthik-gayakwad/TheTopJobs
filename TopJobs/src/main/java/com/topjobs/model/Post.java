package com.topjobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Post {
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "post_Sequence")
    @SequenceGenerator(name = "post_Sequence", sequenceName = "POST_SEQ", initialValue=1, allocationSize=1)
    private Long id;
	
	@Column(name = "jobCategory")
	String jobCategory;
	
	@Column(name = "jobTitle")
	String jobTitle;
	
	@Column(name = "company")
	String company;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
	
	@Column(name = "pin")
	String pin;
	
	@Column(name = "jobType")
	String jobType;
	
	@Column(name = "salary")
	double salary;
	
	@Column(name = "summary")
	String summary;
	
	@Column(name = "duties")
	String duties;
	
	@Column(name = "skills")
	String skills;
	
	@Column(name = "benefits")
	String benefits;
	
	@Column(name = "experience")
	int experience;
	
	@Column(name = "education")
	String education;
	
	public Post() {
		
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDuties() {
		return duties;
	}

	public void setDuties(String duties) {
		this.duties = duties;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	public Post(String jobCategory ,String jobTitle, String company, String city, String state, String country, 
			String pin,String jobType, double salary, String summary, String duties, String skills, String benefits,
			int experience, String education) {
		super();
		
		this.jobCategory = jobCategory;
		this.jobTitle = jobTitle;
		this.company = company;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.jobType = jobType;
		this.salary = salary;
		this.summary = summary;
		this.duties = duties;
		this.skills = skills;
		this.benefits = benefits;
		this.experience = experience;
		this.education = education;
		
	}
}
