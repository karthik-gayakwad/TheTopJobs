package com.topjobs.TopJobs.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.TopJobs.Employer;
import com.topjobs.TopJobs.EmployerService;

@RestController
public class EmployerController {
	

	@Autowired
	private EmployerService es;
	@RequestMapping("/TTD")
	public String Hello(){
		return "TTD";
	}
	@RequestMapping("/employers")
		public List<Employer> getAllEmplyers(){
			return es.getAllEmplyers();
		}
	@RequestMapping("/getemployer/{email}")
	public Employer getEmployer(@PathVariable String email){
		return es.getEmployer(email);
	}
	@RequestMapping("/validateemployer/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return es.validatepw(email,pw);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addemployer")
	public void addEmployer(@RequestBody Employer employer){
		es.addEmployer(employer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/upemployer/{email}")
	public void updateEmployer(@RequestBody Employer employer,@PathVariable String email){
		es.updateEmployer(email,employer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employer/{email}")
	public void deleteEmployers(@PathVariable String email){
		es.deleteEmployer(email);
	}
}
