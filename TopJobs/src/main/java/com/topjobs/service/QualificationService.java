package com.topjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.topjobs.model.Employer;
import com.topjobs.model.Qualification;

public interface QualificationService {


	void addQualification(Qualification qualification);

	List<Qualification> getAllQualification();
	
	public ResponseEntity<Object> updateQualification(String id, Qualification qualification);
	
	public void deleteQualification(Long id);
			
	public Optional<Qualification> getQualification(Long id);

}
