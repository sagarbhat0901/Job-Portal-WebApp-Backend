package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.QualificationRequired;

@Repository
public interface IQualificationRequiredDao extends JpaRepository<QualificationRequired, Long> {

	@Query(value = "select work_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();
	
	@Query("SELECT qualification_type from QualificationRequired WHERE qualification_id =?1")
	public String findQualificationRequiredById(@Param("qualification_id") long qualificaton_id);
}
