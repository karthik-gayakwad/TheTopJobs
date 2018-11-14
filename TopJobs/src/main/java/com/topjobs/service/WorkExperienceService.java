package com.topjobs.service;

import java.util.List;

import com.topjobs.model.Qualification;
import com.topjobs.model.WorkExperience;

public interface WorkExperienceService {
	
	void addWorkExperience(WorkExperience workExperience);

	List<WorkExperience> getAllWorkExperience();
}
