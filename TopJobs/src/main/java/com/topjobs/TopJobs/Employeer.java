package com.topjobs.TopJobs;

public class Employeer {
	String name;
	String email;
	String pw;
	String company;
	
	public Employeer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Employeer(String name, String email, String pw, String company) {
		super();
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.company = company;
	}
	
	

}
