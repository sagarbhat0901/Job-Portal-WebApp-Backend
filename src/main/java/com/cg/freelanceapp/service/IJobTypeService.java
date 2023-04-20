package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.JobType;


@Service
public interface IJobTypeService {
	
    Long getCurrentId();
	
	JobType getJobType(Long type_id);
	
	List<JobType> getAllJobTypes();

}
