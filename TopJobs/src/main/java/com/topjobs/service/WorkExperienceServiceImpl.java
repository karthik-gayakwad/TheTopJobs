package com.topjobs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.topjobs.model.Qualification;
import com.topjobs.model.WorkExperience;
import com.topjobs.repository.WorkExperienceRepository;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService {
	
	@Autowired
	 private WorkExperienceRepository workExperienceRepository;
	
	@Bean
	@Override
	public List<WorkExperience> getAllWorkExperience() {
		List<WorkExperience> result = new ArrayList<WorkExperience>();
        List<WorkExperience> workExperiences = (List<WorkExperience>) workExperienceRepository.findAll();
        for (WorkExperience workExperience : workExperiences) {
            result.add(workExperience);
        }
        return result;
	}
	
	@Override
	public void addWorkExperience(WorkExperience workExperience) {
		workExperienceRepository.save(workExperience);
	}

	@Override
	public ResponseEntity<Object> updateWorkExperience(String id, WorkExperience workExperience) {
		Optional<WorkExperience> workExperienceOptional = workExperienceRepository.findById(Long.parseLong(id));

		if (!workExperienceOptional.isPresent())
			return ResponseEntity.notFound().build();

		workExperienceRepository.deleteById(Long.parseLong(id));
		workExperienceRepository.save(workExperience);

		return ResponseEntity.noContent().build();


	}

	@Override
	public void deleteWorkExperience(Long id) {
		workExperienceRepository.deleteById(id);
	}

	@Override
	public Optional<WorkExperience> getWorkExperience(Long id) {
		return workExperienceRepository.findById(id);
	}
	
}
