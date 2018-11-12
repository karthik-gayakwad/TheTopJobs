package com.topjobs.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.topjobs.model.JobSeeker;

@Service
public class JobSeekerServiceImp implements JobSeekerService {
	private List<JobSeeker> jobseekers = new ArrayList<>( Arrays.asList(
			new JobSeeker("kumar@gmail.com","kumar","R","MALE","07/08/1991","7685435765","kumar1","Bangalore"),
			new JobSeeker("ravi@gmail.com","ravi","R","MALE","07/08/1991","7685435765","ravi1","Delhi"),
			new JobSeeker("shakthi@gmail.com","shakthi","R","MALE","07/08/1991","7685435765","shakthi1","Kolkata"),
			new JobSeeker("ramesh@gmail.com","ramesh","R","MALE","07/08/1991","7685435765","ramesh1","Chennai")
			));
	
	@Override
	public List<JobSeeker> getAllJobSeekers(){
		return jobseekers;	
	}
	
	@Override
	public JobSeeker getJobSeeker(String email) {
		return jobseekers.stream().filter(t->t.getSEmail().equals(email)).findFirst().get();
	}
	
	@Override
	public String validatepw(String email, String pw) {
JobSeeker js=jobseekers.stream().filter(t->t.getSEmail().equals(email)).findFirst().get();
		
		if(js.getSEmail().equals(email)  && js.getSPassword().equals(pw))
			return "Login Success";
		else
			return "Login Failure";
	}
	
	@Override
	public void addjobseeker(JobSeeker jobseeker) {
		jobseekers.add(jobseeker);
		
	}
	
	@Override
	public void updatejobseeker(String email, JobSeeker jobseeker) {
		for(int i=0;i<jobseekers.size();i++)
		{
			JobSeeker t = jobseekers.get(i);
			if(t.getSEmail().equals(email)){
				jobseekers.set(i, jobseeker);
				return;
			}
		}
		
	}
	
	@Override
	public void deleteJobSeeker(String email) {
		jobseekers.removeIf(t->t.getSEmail().equals(email));
		
	}
	
	
	
}
