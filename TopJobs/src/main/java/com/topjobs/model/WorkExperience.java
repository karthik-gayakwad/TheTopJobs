package com.topjobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class WorkExperience {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "experience_Sequence")
    @SequenceGenerator(name = "experience_Sequence", sequenceName = "EXPERIENCE_SEQ", initialValue=1, allocationSize=1)
    private Long experience_id;
	
	@Column(name = "jobTitle")
	String jobTitle;
	
	@Column(name = "companyName")
	String companyName;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
	
	@Column(name = "startDate")
	String startDate;
	
	@Column(name = "endDate")
	String endDate;
	
	@Column(name = "description")
	String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employer_id", nullable = false)
	private Employer employer;
	
	public WorkExperience() {
		
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public WorkExperience(String jobTitle, String companyName, String city, String state, String country, String startDate,String endDate,
			String description) {
		super();
		
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}

	@Override
	public String toString() {
		return "WorkExperience [id=" + id + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", description=" + description + "]";
	}
	
}
