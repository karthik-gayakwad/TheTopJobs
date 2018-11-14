package com.topjobs.service;

import java.util.List;

import com.topjobs.model.Employer;
import com.topjobs.model.Qualification;

public interface QualificationService {


	void addQualification(Qualification qualification);

	List<Qualification> getAllQualification();
	

}
