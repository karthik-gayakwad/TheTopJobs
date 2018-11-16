package com.topjobs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.topjobs.model.Employer;
import com.topjobs.model.Post;
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

	@Override
	public ResponseEntity<Object> updateQualification(String id, Qualification qualification) {
		Optional<Qualification> qualificationOptional = qualificationRepository.findById(Long.parseLong(id));

		if (!qualificationOptional.isPresent())
			return ResponseEntity.notFound().build();

		qualificationRepository.deleteById(Long.parseLong(id));
		qualificationRepository.save(qualification);

		return ResponseEntity.noContent().build();

	}

	@Override
	public void deleteQualification(Long id) {
		qualificationRepository.deleteById(id);
	}

	@Override
	public Optional<Qualification> getQualification(Long id) {
		return qualificationRepository.findById(id);
	}

}
