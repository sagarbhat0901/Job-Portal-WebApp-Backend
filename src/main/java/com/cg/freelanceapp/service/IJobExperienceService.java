package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.JobExperience;

@Service
public interface IJobExperienceService {

	Long getCurrentId();
	
	JobExperience getJobExperience(Long exp_id);
	
	List<JobExperience> getAllJobExperiences();

}
