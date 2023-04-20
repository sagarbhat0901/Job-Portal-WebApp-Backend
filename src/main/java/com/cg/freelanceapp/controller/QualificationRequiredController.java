package com.cg.freelanceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.QualificationRequired;
import com.cg.freelanceapp.service.IQualificationRequiredService;

@RestController
@RequestMapping("/qualificationrequired")
@CrossOrigin(origins = "*")
public class QualificationRequiredController {
	
	@Autowired
	IQualificationRequiredService qualificationrequiredservice;
	
	@GetMapping(value = "/getAll")
	public List<QualificationRequired> getAllQualificationRequireds() {
		return qualificationrequiredservice.getAllQualificationRequireds();
	}

}
