package com.topjobs.TopJobs;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeerService {
	
	private List<Employeer> employeers = new ArrayList<>( Arrays.asList(
			new Employeer("Vikram","vikram@gmail.com","vikram1","sony"),
			new Employeer("Karthik","karthik@gmail.com","karthik1","sony"),
			new Employeer("pooja","pooja@gmail.com","pooja1","sony"),
			new Employeer("teli","teli@gmail.com","teli1","sony"),
			new Employeer("Vicky","vicky1@gmail.com","vicky1","sony"),
			new Employeer("Mahima","mahima@gmail.com","mahima11","sony")
			));
	public List<Employeer> getAllEmplyeers(){
		return employeers;	
	}
	
	
	public void addEmployeer(Employeer employeer){
		employeers.add(employeer);
	}

	public void updateEmployeer(String name, Employeer employeer) {
		for(int i=0;i<employeers.size();i++)
		{
			Employeer t=employeers.get(i);
			if(t.getName().equals(name)){
				employeers.set(i, employeer);
				return;
			}
		}
	}
	public void deleteEmployeer(String email) {
		employeers.removeIf(t->t.getEmail().equals(email));
		}
	public Employeer getEmployeer(String name){
		return employeers.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}
	public String validatepw(String email,String pw){
		Employeer emp=employeers.stream().filter(t->t.getEmail().equals(email)).findFirst().get();
		
		if(emp.getEmail().equals(email)  && emp.getPw().equals(pw))
			return "Login Success";
		else
			return "Login Failure";
		
	}
}