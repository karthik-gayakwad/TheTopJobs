package com.topjobs.service;

import java.util.List;

import com.topjobs.model.JobSeeker;

public interface JobSeekerService {

	public List<JobSeeker> getAllJobSeekers();
	
	public JobSeeker getJobSeeker(String email);
	
	public String validatepw(String email, String password);
	
	public void addjobseeker(JobSeeker jobseeker);
	
	public void updatejobseeker(String email, JobSeeker jobseeker);
	
	public void deleteJobSeeker(String email);
}
