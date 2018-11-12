package com.topjobs.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.model.JobSeeker;
import com.topjobs.service.JobSeekerServiceImp;




@RestController
public class JobSeekerController {
	@Autowired
	private JobSeekerServiceImp jobseekerservice;
	
	@RequestMapping("/TTD1")
	public String Hello1(){
		return "TTD";
	}
	@RequestMapping("/jobseekers")
		public List<JobSeeker> getAllJobSeekers(){
			return jobseekerservice.getAllJobSeekers();
		}
	@RequestMapping("/getjobseeker/{email}")
	public JobSeeker getJobSeeker(@PathVariable String email){
		return jobseekerservice.getJobSeeker(email);
	}
	@RequestMapping("/validatejobseeker/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return jobseekerservice.validatepw(email,pw);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addjobseeker")
	public void addJobSeeker(@RequestBody JobSeeker jobseeker){
		jobseekerservice.addjobseeker(jobseeker);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/upjobseeker/{email}")
	public void updateJobSeeker(@RequestBody JobSeeker jobseeker,@PathVariable String email){
		jobseekerservice.updatejobseeker(email,jobseeker);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/jobseeker/{email}")
	public void deletejobseekers(@PathVariable String email){
		jobseekerservice.deleteJobSeeker(email);
	}
}
