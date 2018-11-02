package com.topjobs.TopJobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.topjobs.TopJobs.JSService;
import com.topjobs.TopJobs.JobSeeker;

@RestController
public class JSController {
	@Autowired
	private JSService js;
	@RequestMapping("/TTD1")
	public String Hello1(){
		return "TTD";
	}
	@RequestMapping("/jobseekers")
		public List<JobSeeker> getAllJobSeekers(){
			return js.getAllJobSeekers();
		}
	@RequestMapping("/getjobseeker/{email}")
	public JobSeeker getJobSeeker(@PathVariable String email){
		return js.getJobSeeker(email);
	}
	@RequestMapping("/validatejobseeker/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return js.validatepw(email,pw);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addjobseeker")
	public void addEmployer(@RequestBody JobSeeker jobseeker){
		js.addjobseeker(jobseeker);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/upjobseeker/{email}")
	public void updateEmployer(@RequestBody JobSeeker jobseeker,@PathVariable String email){
		js.updatjobseeker(email,jobseeker);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/jobseeker/{email}")
	public void deletejobseekers(@PathVariable String email){
		js.deleteJobSeeker(email);
	}
}
