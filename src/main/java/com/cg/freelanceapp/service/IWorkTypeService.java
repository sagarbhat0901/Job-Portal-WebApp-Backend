package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.WorkType;

@Service
public interface IWorkTypeService {
	
	Long getCurrentId();
	
	WorkType getWorkType(Long work_id);

	List<WorkType> getAllWorkTypes();
}
