package com.topjobs.TopJobs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JobSeekerService {
	private List<JobSeeker> jobseekers = new ArrayList<>( Arrays.asList(
			new JobSeeker("kumar@gmail.com","kumar","R","MALE","07/08/1991","7685435765","kumar1","Bangalore"),
			new JobSeeker("ravi@gmail.com","ravi","R","MALE","07/08/1991","7685435765","ravi1","Delhi"),
			new JobSeeker("shakthi@gmail.com","shakthi","R","MALE","07/08/1991","7685435765","shakthi1","Kolkata"),
			new JobSeeker("ramesh@gmail.com","ramesh","R","MALE","07/08/1991","7685435765","ramesh1","Chennai")
			));
	public List<JobSeeker> getAllJobSeekers(){
		return jobseekers;	
	}
	public JobSeeker getJobSeeker(String email) {
		return jobseekers.stream().filter(t->t.getJobseekerEmail().equals(email)).findFirst().get();
	}
	public String validatepw(String email, String pw) {
JobSeeker js=jobseekers.stream().filter(t->t.getJobseekerEmail().equals(email)).findFirst().get();
		
		if(js.getJobseekerEmail().equals(email)  && js.getJobseekerPassword().equals(pw))
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
			if(t.getJobseekerEmail().equals(email)){
				jobseekers.set(i, jobseeker);
				return;
			}
		}
		
	}
	public void deleteJobSeeker(String email) {
		jobseekers.removeIf(t->t.getJobseekerEmail().equals(email));
		
	}
	
	
	
}
