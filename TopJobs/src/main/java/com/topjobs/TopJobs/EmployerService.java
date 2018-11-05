package com.topjobs.TopJobs;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployerService {
	
	private List<Employer> employers = new ArrayList<>( Arrays.asList(
			new Employer("vikram@gmail.com","Vikram","Vicky","MALE", "07/07/1996","sony", "1500","8562457892","vikram1"),
			new Employer("vikram@gmail.com","virkam","vicky","MALE","07/07/1996","Sony","1500","7438981679","virkam1"),
			new Employer("karthik@gmail.com","Karthik","S","MALE","08/23/1996","TCS","2500","8743983268","karthik1"),
			new Employer("pooja@gmail.com","Pooja","J","FEMALE","08/08/1998","Accenture","3500","8562457892","pooja1"),
			new Employer("teli@gmail.com","Teli","P","FEMALE","09/07/1996","Sony","1500","8562457856","teli1")
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
			if(t.getEmployerEmail().equals(email)){
				employers.set(i, employer);
				return;
			}
		}
	}
	public void deleteEmployer(String email) {
		employers.removeIf(t->t.getEmployerEmail().equals(email));
		}
	public Employer getEmployer(String email){
		return employers.stream().filter(t->t.getEmployerEmail().equals(email)).findFirst().get();
	}
	public String validatepw(String email,String pw){
		Employer emp=employers.stream().filter(t->t.getEmployerEmail().equals(email)).findFirst().get();
		
		if(emp.getEmployerEmail().equals(email)  && emp.getEmployerPassword().equals(pw))
			return "Login Success";
		else
			return "Login Failure";
		
	}
}