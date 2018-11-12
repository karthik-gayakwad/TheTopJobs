package com.topjobs.recruitment.TopJobs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.topjobs.controller","com.topjobs.model","com.topjobs.service"})
@EnableJpaRepositories("com.topjobs.repository")
@EntityScan(basePackages="com.topjobs.usermangement")
public class TopJobsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TopJobsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
