package com.topjobs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.topjobs.model.Employer;
import com.topjobs.model.Qualification;
import com.topjobs.repository.EmployerRepository;
import com.topjobs.repository.QualificationRepository;

@Service
public class QualificationServiceImpl implements QualificationService {
	
	@Autowired
	 private QualificationRepository qualificationRepository;
	
	@Bean
	@Override
	public List<Qualification> getAllQualification() {
		List<Qualification> result = new ArrayList<Qualification>();
        List<Qualification> qualifications = (List<Qualification>) qualificationRepository.findAll();
        for (Qualification qualification : qualifications) {
            result.add(qualification);
        }
        return result;
	}
	
	@Override
	public void addQualification(Qualification qualification) {
		
		qualificationRepository.save(qualification);
	}

}
