package com.topjobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.model.WorkExperience;
import com.topjobs.service.WorkExperienceService;

@RestController
public class WorkExperienceController {
	@Autowired
	private WorkExperienceService workExperienceService;
	
	@RequestMapping("/api/experiences")
	public List<WorkExperience> getAllWorkExperience(){
		return workExperienceService.getAllWorkExperience();
	}
}
