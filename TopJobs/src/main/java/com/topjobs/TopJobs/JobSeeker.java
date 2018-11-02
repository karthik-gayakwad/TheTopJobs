package com.topjobs.TopJobs;

public class JobSeeker {
	
	String email;
	String name;
	String phoneno;
	String pw;
	String cpw;
	public JobSeeker() {
		super();
	}
	public JobSeeker(String email, String name, String phoneno, String pw, String cpw) {
		super();
		this.email = email;
		this.name = name;
		this.phoneno = phoneno;
		this.pw = pw;
		this.cpw = cpw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getCpw() {
		return cpw;
	}
	public void setCpw(String cpw) {
		this.cpw = cpw;
	}
	

}
