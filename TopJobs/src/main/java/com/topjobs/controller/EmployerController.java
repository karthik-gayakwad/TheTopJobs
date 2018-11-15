package com.topjobs.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.topjobs.model.Employer;
import com.topjobs.service.EmployerService;

@CrossOrigin(origins="*",maxAge=3600)
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
	
	@RequestMapping("/api/getemployer/{email}")
	public Optional<Employer> getEmployer(@PathVariable String email){
		return employerservice.getEmployer(1L);

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
	
	
	@RequestMapping(method=RequestMethod.POST, value="/api/validateemployer",headers="Accept=application/json", produces={"application/json"})
	public ResponseEntity<String> validate(@RequestBody Employer employer){
		//es.validatepw(employer.getEmployerEmail(),employer.getEmployerPassword());
		System.out.println(employer.getsEmail());
		System.out.println(employer.getsPassword());
		System.out.println(employer);
		return ResponseEntity.ok(employerservice.validatepw(employer.getsEmail(),employer.getsPassword()));
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/addemployer")
	public Employer addEmployer(@RequestBody Employer employer){
		System.out.println(employer);
		employerservice.addEmployer(employer);
		return employer;
	}
	@RequestMapping(method=RequestMethod.PUT,value="/upemployer/{email}")
	public void updateEmployer(@RequestBody Employer employer,@PathVariable String email){
		employerservice.updateEmployer(email,employer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employer/{email}")
	public void deleteEmployers(@PathVariable String email){
		employerservice.deleteEmployer(1L);
	}

}
