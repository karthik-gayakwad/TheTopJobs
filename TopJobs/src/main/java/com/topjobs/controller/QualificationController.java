package com.topjobs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.topjobs.model.Post;
import com.topjobs.model.Qualification;
import com.topjobs.service.QualificationService;

@RestController
public class QualificationController {

	@Autowired
	private QualificationService qualificationService;

	// List All
	@RequestMapping("/api/qualifications")
	public List<Qualification> getAllQualification() {
		return qualificationService.getAllQualification();
	}

	// Update
	@RequestMapping(method = RequestMethod.PUT, value = "/api/qualification_update/{id}")
	public void update(@PathVariable String id, @RequestBody Qualification qualification) {
		qualificationService.updateQualification(id, qualification);
	}

	// Delete
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/qualification_delete/{id}")
	public void delete(@PathVariable String id) {
		qualificationService.deleteQualification(Long.parseLong(id));
	}

	// Get by ID
	@RequestMapping(method = RequestMethod.GET, value = "/getqualification/{id}")
	public Optional<Qualification> getQualification(@PathVariable Long id) {
		return qualificationService.getQualification(id);
	}

	// Add
	@RequestMapping(method = RequestMethod.POST, value = "/api/addqualification")
	public Qualification addQualification(@RequestBody Qualification qualification) {
		System.out.println(qualification);
		qualificationService.addQualification(qualification);
		return qualification;
	}

}
