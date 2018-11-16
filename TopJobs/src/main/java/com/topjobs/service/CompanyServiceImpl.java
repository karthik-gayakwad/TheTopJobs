package com.topjobs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.topjobs.model.Company;
import com.topjobs.model.Employer;
import com.topjobs.repository.CompanyRepository;
import com.topjobs.repository.EmployerRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
	 @Autowired
	 private CompanyRepository companyRepository;

	@Override
	public List<Company> getAllCompany() {
		List<Company> result = new ArrayList<Company>();
        List<Company> companys = (List<Company>) companyRepository.findAll();
        for (Company company : companys) {
            result.add(company);
        }
        return result;
	}

	@Override
	public void addCompany(Company company) {
		companyRepository.save(company);
	}
	 
	 
}
