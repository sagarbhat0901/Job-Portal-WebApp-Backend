package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Job;

//This is the DAO Interface for Job module.
@Repository
public interface IJobDao extends JpaRepository<Job, Long> {
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.id")
	public List<Object> findAllDTO();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id,CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j where j.active = true order by j.id")
	public List<Object> findAllActiveDTO();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id,CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j where j.skill.name=:skill order by j.id")
	public List<Object> findBySkill(@Param("skill") String skill);

	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id,CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j where j.jobType.job_type=:jobType order by j.id")
	public List<Object> findByJobType(@Param("jobType") String filterValue);

	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id,CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j where j.workType.work_type=:workType order by j.id")
	public List<Object> findByWorkType(@Param("workType") String filterValue);

	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id,CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j where j.qualificationRequired.qualification_type=:qualificationRequired order by j.id")
	public List<Object> findByQualificationRequired(@Param("qualificationRequired") String filterValue);

	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.id Desc")
	public List<Object> sortByIdDesc();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.id")
	public List<Object> sortById();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.jobTitle")
	public List <Object> sortByTitle();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.jobTitle Desc")
	public List <Object> sortByTitleDesc();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.jobExperience.job_exp")
	public List <Object> sortByExp();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.jobExperience.job_exp Desc")
	public List <Object> sortByExpDesc();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.jobSalary")
	public List <Object> sortBySalary();
	
	@Query("SELECT new com.cg.freelanceapp.dto.JobListDTO(j.id, j.awardedTo.id, CONCAT(j.awardedTo.firstName,' ',j.awardedTo.lastName) as freelancerName, j.skill.id, j.skill.name, j.postedBy.id, CONCAT(j.postedBy.firstName,' ',j.postedBy.lastName) as recruiterName, j.jobTitle, j.jobDescription, j.jobSalary, j.active, j.workType.work_id, j.workType.work_type, j.jobType.type_id, j.jobType.job_type, j.qualificationRequired.qualification_id, j.qualificationRequired.qualification_type, j.jobExperience.exp_id, j.jobExperience.job_exp) from Job j order by j.jobSalary Desc")
	public List <Object> sortBySalaryDesc();
}
