package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.QualificationRequired;

@Service
public interface IQualificationRequiredService {
   
	
	Long getCurrentId();
	
	QualificationRequired getQualificationRequired(Long qualification_id);
	
	List<QualificationRequired> getAllQualificationRequireds();

}
