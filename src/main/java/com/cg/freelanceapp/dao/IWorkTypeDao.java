package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.WorkType;

@Repository
public interface IWorkTypeDao extends JpaRepository<WorkType, Long> {
	
	@Query("SELECT work_type from WorkType WHERE work_id =?1")
	public String findWorkTypeById(@Param("work_id") long work_id);

	@Query(value = "select work_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();
}
