package com.cg.freelanceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.JobType;
import com.cg.freelanceapp.service.IJobTypeService;

@RestController
@RequestMapping("/jobtypes")
@CrossOrigin(origins = "*")
public class JobTypeController {
	
	@Autowired
	IJobTypeService jobtypeservice;
	
	@GetMapping(value = "/getAll")
	public List<JobType> getAllJobTypes() {
		return jobtypeservice.getAllJobTypes();
	}

}
