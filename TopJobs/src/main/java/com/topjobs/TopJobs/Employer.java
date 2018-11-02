package com.topjobs.TopJobs;

public class Employer {
	String email;
	String name;
	String companyname;
	String companysize;
	String password;
	String confrimpassword;
	public Employer() {
		super();
	}
	public Employer(String email, String name, String companyname, String companysize, String password,
			String confrimpassword) {
		super();
		this.email = email;
		this.name = name;
		this.companyname = companyname;
		this.companysize = companysize;
		this.password = password;
		this.confrimpassword = confrimpassword;
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
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanysize() {
		return companysize;
	}
	public void setCompanysize(String companysize) {
		this.companysize = companysize;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfrimpassword() {
		return confrimpassword;
	}
	public void setConfrimpassword(String confrimpassword) {
		this.confrimpassword = confrimpassword;
	}
	
	
	

}
