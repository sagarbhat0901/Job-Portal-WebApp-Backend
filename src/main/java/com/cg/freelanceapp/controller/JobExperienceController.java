package com.cg.freelanceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.JobExperience;
import com.cg.freelanceapp.service.IJobExperienceService;

@RestController
@RequestMapping("/jobexperience")
@CrossOrigin(origins = "*")
public class JobExperienceController {
	
	@Autowired
	IJobExperienceService jobexperienceservice;
	
	@GetMapping(value = "/getAll")
	public List<JobExperience> getAllJobExperiences() {
		return jobexperienceservice.getAllJobExperiences();
	}

}
