package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.JobExperience;

@Repository
public interface IJobExperienceDao extends JpaRepository<JobExperience, Long>{
	
	@Query("SELECT job_exp from JobExperience WHERE exp_id =?1")
	public String findJobExperienceById(@Param("exp_id") long exp_id);
	
	@Query(value = "select work_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

}
