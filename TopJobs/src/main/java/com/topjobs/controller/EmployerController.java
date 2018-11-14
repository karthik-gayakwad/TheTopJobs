package com.topjobs.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.topjobs.model.Employer;
import com.topjobs.service.EmployerServiceImp;


@RestController
public class EmployerController {
	

	@Autowired
	private EmployerServiceImp employerservice;
	@RequestMapping("/TTD")
	public String Hello(){
		return "TTD";
	}
	@RequestMapping("/employers")
		public List<Employer> getAllEmplyers(){
			return employerservice.getAllEmployers();
		}
	@RequestMapping("/getemployer/{email}")
	public Employer getEmployer(@PathVariable String email){
		return employerservice.getEmployer(email);
	}
	@RequestMapping("/validateemployer/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return employerservice.validatepw(email,pw);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addemployer")
	public void addEmployer(@RequestBody Employer employer){
		employerservice.addEmployer(employer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/upemployer/{email}")
	public void updateEmployer(@RequestBody Employer employer,@PathVariable String email){
		employerservice.updateEmployer(email,employer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employer/{email}")
	public void deleteEmployers(@PathVariable String email){
		employerservice.deleteEmployer(email);
	}
}