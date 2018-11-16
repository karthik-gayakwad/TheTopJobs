package com.topjobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.model.Company;
import com.topjobs.model.Employer;
import com.topjobs.service.CompanyService;
import com.topjobs.service.EmployerService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	//List All
	@RequestMapping(method=RequestMethod.GET, value="/api/company")
		public List<Company> getAllCompany(){
			return companyService.getAllCompany();
		}
}
