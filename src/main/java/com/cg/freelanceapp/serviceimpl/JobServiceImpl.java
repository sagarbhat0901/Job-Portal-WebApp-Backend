package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IJobDao;
import com.cg.freelanceapp.dao.IJobTypeDao;
import com.cg.freelanceapp.dao.IQualificationRequiredDao;
import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dao.IWorkTypeDao;
import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.dto.QualificationRequiredDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.JobType;
import com.cg.freelanceapp.entities.QualificationRequired;
import com.cg.freelanceapp.entities.WorkType;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.service.IJobService;

// This is a service implementation class for Job Entity
@Service
public class JobServiceImpl implements IJobService {

	@Autowired
	IJobDao jobdao;

	@Autowired
	ISkillDao skillDao;

	@Autowired
	IFreelancerDao freelancerDao;

	@Autowired
	IRecruiterDao recruiterDao;
	
	@Autowired
	IWorkTypeDao workTypeDao;
	
	@Autowired
	IJobTypeDao jobTypeDao;
	
	@Autowired
	IQualificationRequiredDao qualificationRequiredDao;

	public void close(Long id) {
		if (jobdao.existsById(id)) {
			Job job = jobdao.findById(id).get();
			job.setActive(false);
			jobdao.save(job);
		} else {
			throw new InvalidJobException();
		}
	}

	//This method is used to find a job by job id
	@Override
	public Job findById(Long id) {

		if (jobdao.existsById(id)) {
			return jobdao.findById(id).get();
		} else
			throw new InvalidJobException();

	}

	//This method is used find job based on skill by skillname
	@Override
	public List<Object> findJobsBySkillName(String name) {
		if (skillDao.existsByName(name)) {
			return jobdao.findBySkill(name);
		} else {
			throw new InvalidJobException();
		}

	}

	//This method is used to post a new job
	@Override
	public Job postJob(JobDTO jobdto) {
		Job job = new Job();
		if (recruiterDao.existsById(jobdto.getRecruiterId()) && freelancerDao.existsById(jobdto.getFreelancerid())
				&& skillDao.existsById(jobdto.getSkillId())) {
			job.setPostedBy(recruiterDao.findById(jobdto.getRecruiterId()).get());
			job.setAwardedTo(freelancerDao.findById(2L).get());
			job.setSkill(skillDao.findById(jobdto.getSkillId()).get());
			job.setActive(true);
			job.setJobTitle(jobdto.getJobTitle());
			job.setJobDescription(jobdto.getJobDescription());
			WorkType workType = new WorkType(jobdto.getWork_id(),workTypeDao.findWorkTypeById(jobdto.getWork_id()));
			job.setWorkType(workType);
			JobType jobType = new JobType(jobdto.getType_id(),jobTypeDao.findJobTypeById(jobdto.getType_id()));
			job.setJobType(jobType);
			QualificationRequired qualificationRequired = new QualificationRequired(jobdto.getQualification_id(),qualificationRequiredDao.findQualificationRequiredById(jobdto.getQualification_id()));
			job.setQualificationRequired(qualificationRequired);
			return jobdao.save(job);
		}  
		else
			throw new InvalidJobException();
	}
	
	//this method is used to find the list of all jobs
	@Override
	public List<Object> findAll() {
		return jobdao.findAllDTO();
	}

	//This method is used to award a job by a recruiter to a freelancer
	@Override
	public void awardJob(Long jobId, Long freelancerId) {
		Job job = jobdao.findById(jobId).get();
		Freelancer freelancer = freelancerDao.findById(freelancerId).get();
		job.setAwardedTo(freelancer);
		jobdao.saveAndFlush(job);
		
	}

	
	//This method is used to find all Active Jobs
	@Override
	public List<Object> findAllActiveJobs() {
		return jobdao.findAllActiveDTO();
	}

	@Override
	public List<Object> filterJobs(String filterName, String filterValue) {
		switch(filterName) {
		case "skillName":
			return jobdao.findBySkill(filterValue);
		case "jobTypeName":
			return jobdao.findByJobType(filterValue);
		case "workTypeName":
			return jobdao.findByWorkType(filterValue);
		case "qualificationRequiredName":
			return jobdao.findByQualificationRequired(filterValue);
		}
		return null;
		
	}

}