package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IJobTypeDao;
import com.cg.freelanceapp.entities.JobType;
import com.cg.freelanceapp.service.IJobTypeService;

@Service
@Transactional
public class JobTypeServiceImpl implements IJobTypeService {
	
	@Autowired
	IJobTypeDao jobTypeDao;

	@Override
	public Long getCurrentId() {
		return jobTypeDao.getCurrentSeriesId();	
	}

	@Override
	public JobType getJobType(Long type_id) {
		return jobTypeDao.getOne(type_id);
		
	}
	
	@Override
	public List<JobType> getAllJobTypes() {
		return jobTypeDao.findAll();
	}

}
