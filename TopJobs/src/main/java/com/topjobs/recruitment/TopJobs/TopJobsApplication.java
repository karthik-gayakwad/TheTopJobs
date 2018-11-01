package com.topjobs.recruitment.TopJobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.topjobs.TopJobs.controller","com.topjobs.TopJobs"})
public class TopJobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopJobsApplication.class, args);
	}
}
