package com.topjobs.service;

import java.util.List;

import com.topjobs.model.Company;
import com.topjobs.model.Employer;

public interface CompanyService {

public List<Company> getAllCompany();
	
	public void addCompany(Company company);
}
