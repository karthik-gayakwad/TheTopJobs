package com.topjobs.repository;

import org.springframework.data.repository.CrudRepository;

import com.topjobs.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {

}
