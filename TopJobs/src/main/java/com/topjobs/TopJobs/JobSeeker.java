package com.topjobs.TopJobs;

public class JobSeeker {
	
	String jobseekerEmail;
	String jobseekerFisrtName;
	String jobseekerLastName;
	String jobseekerGender;
	String jobseekerDOB;
	String jobseekerPhone;
	String jobseekerPassword;
	String jobseekerCity;
	public JobSeeker() {
		super();
	}
	public JobSeeker(String jobseekerEmail, String jobseekerFisrtName, String jobseekerLastName, String jobseekerGender,
			String jobseekerDOB, String jobseekerPhone, String jobseekerPassword, String jobseekerCity) {
		super();
		this.jobseekerEmail = jobseekerEmail;
		this.jobseekerFisrtName = jobseekerFisrtName;
		this.jobseekerLastName = jobseekerLastName;
		this.jobseekerGender = jobseekerGender;
		this.jobseekerDOB = jobseekerDOB;
		this.jobseekerPhone = jobseekerPhone;
		this.jobseekerPassword = jobseekerPassword;
		this.jobseekerCity = jobseekerCity;
	}
	public String getJobseekerEmail() {
		return jobseekerEmail;
	}
	public void setJobseekerEmail(String jobseekerEmail) {
		this.jobseekerEmail = jobseekerEmail;
	}
	public String getJobseekerFisrtName() {
		return jobseekerFisrtName;
	}
	public void setJobseekerFisrtName(String jobseekerFisrtName) {
		this.jobseekerFisrtName = jobseekerFisrtName;
	}
	public String getJobseekerLastName() {
		return jobseekerLastName;
	}
	public void setJobseekerLastName(String jobseekerLastName) {
		this.jobseekerLastName = jobseekerLastName;
	}
	public String getJobseekerGender() {
		return jobseekerGender;
	}
	public void setJobseekerGender(String jobseekerGender) {
		this.jobseekerGender = jobseekerGender;
	}
	public String getJobseekerDOB() {
		return jobseekerDOB;
	}
	public void setJobseekerDOB(String jobseekerDOB) {
		this.jobseekerDOB = jobseekerDOB;
	}
	public String getJobseekerPhone() {
		return jobseekerPhone;
	}
	public void setJobseekerPhone(String jobseekerPhone) {
		this.jobseekerPhone = jobseekerPhone;
	}
	public String getJobseekerPassword() {
		return jobseekerPassword;
	}
	public void setJobseekerPassword(String jobseekerPassword) {
		this.jobseekerPassword = jobseekerPassword;
	}
	public String getJobseekerCity() {
		return jobseekerCity;
	}
	public void setJobseekerCity(String jobseekerCity) {
		this.jobseekerCity = jobseekerCity;
	}
	
	
}
