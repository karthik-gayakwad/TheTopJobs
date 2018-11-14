package com.topjobs.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.topjobs.model.Employer;
public interface EmployerRepository extends CrudRepository<Employer, Long> {

}
