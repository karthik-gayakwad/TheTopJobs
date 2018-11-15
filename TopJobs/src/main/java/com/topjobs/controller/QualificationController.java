package com.topjobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.topjobs.model.Qualification;
import com.topjobs.service.QualificationService;

@RestController
public class QualificationController {
	
	@Autowired
	private QualificationService qualificationService;
	
	@RequestMapping("/api/qualifications")
	public List<Qualification> getAllQualification(){
		return qualificationService.getAllQualification();
	}
}
