package com.topjobs.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.topjobs.model.Employer;
import com.topjobs.repository.EmployerRepository;

@Service
public class EmployerServiceImp implements EmployerService {
	
	 @Autowired
	 private EmployerRepository employerRepository;
	 
	private List<Employer> employers = new ArrayList<>( Arrays.asList(
			new Employer("vikram@gmail.com","Vikram","Vicky","MALE", "07/07/1996","sony", "1500","8562457892","vikram1"),
			new Employer("vikram@gmail.com","virkam","vicky","MALE","07/07/1996","Sony","1500","7438981679","virkam1"),
			new Employer("karthik@gmail.com","Karthik","S","MALE","08/23/1996","TCS","2500","8743983268","karthik1"),
			new Employer("pooja@gmail.com","Pooja","J","FEMALE","08/08/1998","Accenture","3500","8562457892","pooja1"),
			new Employer("teli@gmail.com","Teli","P","FEMALE","09/07/1996","Sony","1500","8562457856","teli1")
			));
	
	/*@Bean
	@Override
	public List<String> getAllEmployers(){
		List<String> result = new ArrayList<String>();
        List<Employer> employers = (List<Employer>) employerRepository.findAll();
        for (Employer employer : employers) {
            result.add(employer.getSFirstName());
        }
        return result;
	}*/
	
	@Bean
	@Override
	public List<Employer> getAllEmployers(){
		List<Employer> result = new ArrayList<Employer>();
        List<Employer> employers = (List<Employer>) employerRepository.findAll();
        for (Employer employer : employers) {
            result.add(employer);
        }
        return result;
	}
	
	@Override
	public void addEmployer(Employer employer){
		
		employerRepository.save(employer);
				
		/*JSONObject jsonObject = new JSONObject(employer);
		
		try {
			String email = jsonObject.getString("s_email");
			String firstName = jsonObject.getString("s_first_name");
			
			employer.setSEmail(email);
			employer.setSFirstName(firstName);
			System.out.println("\n\n\n"+employer.getSEmail());
			employerRepository.save(employer);
		} catch (JSONException e) {
			e.printStackTrace();
		}	*/	
	}

	@Override 
	public void updateEmployer(String email, Employer employer) {
		for(int i=0;i<employers.size();i++)
		{
			Employer t=employers.get(i);
			if(t.getSEmail().equals(email)){
				employers.set(i, employer);
				return;
			}
		}
	}
	
	@Override
	public void deleteEmployer(String email) {
		employers.removeIf(t->t.getSEmail().equals(email));
		}
	
	@Override
	public Employer getEmployer(String email){
		return employers.stream().filter(t->t.getSEmail().equals(email)).findFirst().get();
	}
	
	@Override
	public String validatepw(String email,String pw){
		Employer emp=employers.stream().filter(t->t.getSEmail().equals(email)).findFirst().get();
		
		if(emp.getSEmail().equals(email)  && emp.getSPassword().equals(pw))
			return "Login Success";
		else
			return "Login Failure";
		
	}
}