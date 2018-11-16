package com.topjobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Qualification {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "qualification_Sequence")
    @SequenceGenerator(name = "qualification_Sequence", sequenceName = "QUALIFICATION_SEQ", initialValue=1, allocationSize=1)
    private Long id;
	
	@Column(name = "degree")
	String degree;
	
	@Column(name = "major")
	String major;
	
	@Column(name = "school")
	String school;
	
	@Column(name = "university")
	String university;
	
	@Column(name = "startYear")
	String startYear;
	
	@Column(name = "endYear")
	String endYear;
	
	@Column(name = "cgpa")
	float cgpa;
	
	public Qualification() {
		
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public Qualification(String degree, String major, String school, String university, String startYear, String endYear,
			float cgpa) {
		super();
		
		this.degree = degree;
		this.major = major;
		this.school = school;
		this.university = university;
		this.startYear = startYear;
		this.endYear = endYear;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Qualification [id=" + id + ", degree=" + degree + ", major=" + major + ", school=" + school
				+ ", university=" + university + ", startYear=" + startYear + ", endYear=" + endYear + ", cgpa=" + cgpa
				+ "]";
	}
	
}
