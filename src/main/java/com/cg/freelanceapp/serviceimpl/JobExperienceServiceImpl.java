package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IJobExperienceDao;
import com.cg.freelanceapp.entities.JobExperience;
import com.cg.freelanceapp.service.IJobExperienceService;

@Service
@Transactional
public class JobExperienceServiceImpl implements IJobExperienceService{

	@Autowired
	IJobExperienceDao jobExperienceDao;
	
	@Override
	public Long getCurrentId() {
		return jobExperienceDao.getCurrentSeriesId();
	}

	@Override
	public JobExperience getJobExperience(Long exp_id) {
		return jobExperienceDao.getOne(exp_id);
	}

	@Override
	public List<JobExperience> getAllJobExperiences() {
		return jobExperienceDao.findAll();
	}

}
