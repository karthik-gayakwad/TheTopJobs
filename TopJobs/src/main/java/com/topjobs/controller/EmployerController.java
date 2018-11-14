package com.topjobs.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.topjobs.model.Employer;
import com.topjobs.service.EmployerServiceImp;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class EmployerController {
	

	@Autowired
	private EmployerServiceImp employerservice;
	@RequestMapping("/api/TTD")
	public String Hello(){
		return "TTD";
	}
	@RequestMapping("/api/employers")
		public List<Employer> getAllEmplyers(){
			return employerservice.getAllEmployers();
		}
	@RequestMapping("/api/getemployer/{email}")
	public Employer getEmployer(@PathVariable String email){
		return employerservice.getEmployer(email);
	}
	@RequestMapping(method=RequestMethod.POST, value="/api/validateemployer",headers="Accept=application/json", produces={"application/json"})
	public ResponseEntity<String> validate(@RequestBody Employer employer){
		//es.validatepw(employer.getEmployerEmail(),employer.getEmployerPassword());
		System.out.println(employer.getsEmail());
		System.out.println(employer.getsPassword());
		System.out.println(employer);
		return ResponseEntity.ok(employerservice.validatepw(employer.getsEmail(),employer.getsPassword()));
	}
	/*@RequestMapping("/validateemployer/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return employerservice.validatepw(email,pw);
	}*/
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
		employerservice.deleteEmployer(email);
	}
}
