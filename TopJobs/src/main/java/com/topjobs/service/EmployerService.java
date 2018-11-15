package com.topjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.topjobs.model.Employer;

public interface EmployerService {
	
	public List<Employer> getAllEmployers();
	
	public void addEmployer(Employer employer);
	
	public ResponseEntity<Object> updateEmployer(String id,Employer employer);
			
	public void deleteEmployer(Long id);
			
	public Optional<Employer> getEmployer(Long id);

	public String validatepw(String email,String password);
}
