package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.JobType;

@Repository
public interface IJobTypeDao extends JpaRepository<JobType, Long> {
	
	@Query("SELECT job_type from JobType WHERE type_id =?1")
	public String findJobTypeById(@Param("type_id") long type_id);
	
	@Query(value = "select work_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();
}
