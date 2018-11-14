package com.topjobs.recruitment.TopJobs;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.topjobs.service.EmployerService;

@SpringBootApplication(scanBasePackages={"com.topjobs.controller","com.topjobs.model","com.topjobs.service",
		"com.topjobs.respository"})
@EnableJpaRepositories("com.topjobs.repository")
@ManagedBean("com.topjobs.model.Employer")
@EntityScan(basePackages="com.topjobs.model")
public class TopJobsApplication implements CommandLineRunner {
	
	@Autowired
	EmployerService employerService;
	public static void main(String[] args) {
		SpringApplication.run(TopJobsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
