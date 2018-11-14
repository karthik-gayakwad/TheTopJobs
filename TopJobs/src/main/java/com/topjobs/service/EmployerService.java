package com.topjobs.service;

import java.util.List;

import com.topjobs.model.Employer;

public interface EmployerService {
	
	public List<Employer> getAllEmployers();
	
	public void addEmployer(Employer employer);
	
	public void updateEmployer(String email,Employer employer);
			
	public void deleteEmployer(String email);
			
	public Employer getEmployer(String email);

	public String validatepw(String email,String password);
}
