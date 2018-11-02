package com.topjobs.TopJobs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JSService {
	private List<JobSeeker> jobseekers = new ArrayList<>( Arrays.asList(
			new JobSeeker("kumar@gmail.com","kumar","7685435765","kumar1","kumar1"),
			new JobSeeker("ravi@gmail.com","ravi","7685435765","ravi1","ravi1"),
			new JobSeeker("shakthi@gmail.com","shakthi","7685435765","shakthi1","shakthi1"),
			new JobSeeker("ramesh@gmail.com","ramesh","7685435765","ramesh1","ramesh1")
			));
	public List<JobSeeker> getAllJobSeekers(){
		return jobseekers;	
	}
	public JobSeeker getJobSeeker(String email) {
		return jobseekers.stream().filter(t->t.getEmail().equals(email)).findFirst().get();
	}
	public String validatepw(String email, String pw) {
JobSeeker js=jobseekers.stream().filter(t->t.getEmail().equals(email)).findFirst().get();
		
		if(js.getEmail().equals(email)  && js.getPw().equals(pw))
			return "Login Success";
		else
			return "Login Failure";
	}
	public void addjobseeker(JobSeeker jobseeker) {
		jobseekers.add(jobseeker);
		
	}
	public void updatjobseeker(String email, JobSeeker jobseeker) {
		for(int i=0;i<jobseekers.size();i++)
		{
			JobSeeker t = jobseekers.get(i);
			if(t.getEmail().equals(email)){
				jobseekers.set(i, jobseeker);
				return;
			}
		}
		
	}
	public void deleteJobSeeker(String email) {
		jobseekers.removeIf(t->t.getEmail().equals(email));
		
	}
	
	
	
}
