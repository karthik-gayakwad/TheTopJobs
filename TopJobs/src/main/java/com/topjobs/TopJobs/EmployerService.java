package com.topjobs.TopJobs;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployerService {
	
	private List<Employer> employers = new ArrayList<>( Arrays.asList(
			new Employer("vikram@gmail.com","Vikram","Sony","1500","vikram1","vikram1"),
			new Employer("karthik@gmail.com","Karthik","TCS","2500","karthik1","karthik1"),
			new Employer("pooja@gmail.com","Pooja","Accenture","3500","pooja1","pooja1"),
			new Employer("teli@gmail.com","Teli","Sony","1500","teli1","teli1")
			));
	public List<Employer> getAllEmplyers(){
		return employers;	
	}
	
	
	public void addEmployer(Employer employer){
		employers.add(employer);
	}

	public void updateEmployer(String email, Employer employer) {
		for(int i=0;i<employers.size();i++)
		{
			Employer t=employers.get(i);
			if(t.getEmail().equals(email)){
				employers.set(i, employer);
				return;
			}
		}
	}
	public void deleteEmployer(String email) {
		employers.removeIf(t->t.getEmail().equals(email));
		}
	public Employer getEmployer(String email){
		return employers.stream().filter(t->t.getEmail().equals(email)).findFirst().get();
	}
	public String validatepw(String email,String pw){
		Employer emp=employers.stream().filter(t->t.getEmail().equals(email)).findFirst().get();
		
		if(emp.getEmail().equals(email)  && emp.getPassword().equals(pw))
			return "Login Success";
		else
			return "Login Failure";
		
	}
}