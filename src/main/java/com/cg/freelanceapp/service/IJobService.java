package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;

//This is the Service Interface for Job module.
@Service
public interface IJobService {

	void close(Long id);

	Job findById(Long id);
	
	List<Object> findJobsBySkillName(String name);
	
	List<Object> findAll();
	
	List<Object> findAllActiveJobs();
	
	Job postJob(JobDTO jobDto);
	
	void awardJob(Long jobId, Long freelancerId);

	List<Object> filterJobs(String filterName, String filterValue);

	List<Object> sortingByIdDesc();
	List<Object> sortingById();
	List <Object> sortingByTitle();
	List <Object> sortingByTitleDesc();
	List <Object> sortingByExp();
	List <Object> sortingByExpDesc();
	List <Object> sortingBySalary();
	List <Object> sortingBySalaryDesc();
}
