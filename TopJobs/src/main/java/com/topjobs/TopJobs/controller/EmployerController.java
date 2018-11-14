package com.topjobs.TopJobs.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.topjobs.TopJobs.Employee;
import com.topjobs.TopJobs.Employer;
import com.topjobs.TopJobs.EmployerService;
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
public class EmployerController {
	

	@Autowired
	private EmployerService es;
	@RequestMapping("/api/TTD")
	public String Hello(){
		return "TTD";
	}
	@RequestMapping("/api/employers")
		public List<Employer> getAllEmplyers(){
			return es.getAllEmplyers();
		}
	@RequestMapping("/api/getemployer/{email}")
	public Employer getEmployer(@PathVariable String email){
		return es.getEmployer(email);
	}

	@RequestMapping(method=RequestMethod.POST, value= "/api/validateemployer", produces= {"application/json"})
	public ResponseEntity<String> validate(@RequestBody Employer employer){
		//es.validatepw(employer.getEmployerEmail(),employer.getEmployerPassword());
		System.out.println(employer.getEmployerEmail());
		System.out.println(employer.getEmployerPassword());
		System.out.println(employer);
		return ResponseEntity.ok(es.validatepw(employer.getEmployerEmail(),employer.getEmployerPassword()));
	}
	
	/*
	@RequestMapping("/api/validateemployer/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return es.validatepw(email,pw);
	}*/
	@RequestMapping(method=RequestMethod.POST,value="/api/addemployer")
	public void addEmployer(@RequestBody Employer employer){
		es.addEmployer(employer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/api/upemployer/{email}")
	public void updateEmployer(@RequestBody Employer employer,@PathVariable String email){
		es.updateEmployer(email,employer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/api/employer/{email}")
	public void deleteEmployers(@PathVariable String email){
		es.deleteEmployer(email);
	}
}
