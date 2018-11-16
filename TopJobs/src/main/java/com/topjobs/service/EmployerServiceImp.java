package com.topjobs.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.topjobs.model.Employer;
import com.topjobs.repository.EmployerRepository;

@Service
public class EmployerServiceImp implements EmployerService {
	
	 @Autowired
	 private EmployerRepository employerRepository;
	 
	private List<Employer> employers = new ArrayList<>( );
	
	
	
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
	}

	@Override 
	public ResponseEntity<Object> updateEmployer(String id, Employer employer) {
		
		
		Optional<Employer> employerOptional = employerRepository.findById(Long.parseLong(id));

		if (!employerOptional.isPresent())
			return ResponseEntity.notFound().build();

		employerRepository.deleteById(Long.parseLong(id));
		employerRepository.save(employer);

		return ResponseEntity.noContent().build();
	}
	
	@Override
	public void deleteEmployer(Long id) {
		employerRepository.deleteById(id);
	}

		
	@Override
	public Optional<Employer> getEmployer(Long id){
		return employerRepository.findById(id);
	}
	
	@Override
	public String validatepw(String email,String pw){
		Employer emp=employers.stream().filter(t->t.getsEmail().equals(email)).findAny().orElse(null);
		if(emp!=null) {
		if(emp.getsEmail().equals(email)  && emp.getsPassword().equals(pw))
			return "{\"login\":\"Success\"}";
		}
		
			return "{\"login\":\"Failure\"}";
		
	}
}