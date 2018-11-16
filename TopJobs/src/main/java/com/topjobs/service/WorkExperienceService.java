package com.topjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.topjobs.model.Post;
import com.topjobs.model.Qualification;
import com.topjobs.model.WorkExperience;

public interface WorkExperienceService {

	void addWorkExperience(WorkExperience workExperience);

	List<WorkExperience> getAllWorkExperience();

	public ResponseEntity<Object> updateWorkExperience(String id, WorkExperience workExperience);

	public void deleteWorkExperience(Long id);

	public Optional<WorkExperience> getWorkExperience(Long id);
}
