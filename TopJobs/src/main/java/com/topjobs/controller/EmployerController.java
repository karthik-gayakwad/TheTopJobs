package com.topjobs.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.topjobs.model.Employer;
import com.topjobs.service.EmployerService;


@RestController
public class EmployerController {
	

	@Autowired
	private EmployerService employerservice;
	
	//List All
	@RequestMapping(method=RequestMethod.GET, value="/api/employers")
		public List<Employer> getAllEmployer(){
			return employerservice.getAllEmployers();
		}
	
	//Update
	@RequestMapping(method=RequestMethod.PUT, value= "/api/employers_update/{id}")
	public void update(@PathVariable String id, @RequestBody Employer employer) {
		employerservice.updateEmployer(id, employer);
	}
	
	//Delete
	@RequestMapping(method=RequestMethod.DELETE, value= "/api/employers_delete/{id}")
	public void delete(@PathVariable String id) {
		employerservice.deleteEmployer(Long.parseLong(id));
	}
	
	//Get by ID
	@RequestMapping(method=RequestMethod.GET, value="/getemployer/{id}")
	public Optional<Employer> getEmployer(@PathVariable Long id){
		return employerservice.getEmployer(id);
	}
	
	//Add
	@RequestMapping(method=RequestMethod.POST,value="/addemployer")
	public void addEmployer(@RequestBody Employer employer){
		employerservice.addEmployer(employer);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/api/validateemployer", produces= {"application/json"})
	public ResponseEntity<String> validate(@RequestBody Employer employer){
		//es.validatepw(employer.getEmployerEmail(),employer.getEmployerPassword());
		System.out.println(employer.getSEmail());
		System.out.println(employer.getSPassword());
		System.out.println(employer);
		return ResponseEntity.ok(employerservice.validatepw(employer.getSEmail(),employer.getSPassword()));
	}
	
}
