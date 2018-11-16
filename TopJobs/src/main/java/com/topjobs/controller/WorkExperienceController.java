package com.topjobs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.model.Qualification;
import com.topjobs.model.WorkExperience;
import com.topjobs.service.WorkExperienceService;

@RestController
public class WorkExperienceController {
	@Autowired
	private WorkExperienceService workExperienceService;

	// List All
	@RequestMapping("/api/experiences")
	public List<WorkExperience> getAllWorkExperience() {
		return workExperienceService.getAllWorkExperience();
	}

	// Update
	@RequestMapping(method = RequestMethod.PUT, value = "/api/experience_update/{id}")
	public void update(@PathVariable String id, @RequestBody WorkExperience workExperience) {
		workExperienceService.updateWorkExperience(id, workExperience);
	}

	// Delete
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/workExperience_delete/{id}")
	public void delete(@PathVariable String id) {
		workExperienceService.deleteWorkExperience(Long.parseLong(id));
	}

	// Get by ID
	@RequestMapping(method = RequestMethod.GET, value = "/workExperience/{id}")
	public Optional<WorkExperience> getworkExperience(@PathVariable Long id) {
		return workExperienceService.getWorkExperience(id);
	}

	// Add
	@RequestMapping(method = RequestMethod.POST, value = "/api/addworkexperience")
	public WorkExperience addWorkExperience(@RequestBody WorkExperience workExperience) {
		System.out.println(workExperience);
		workExperienceService.addWorkExperience(workExperience);
		return workExperience;
	}

}
