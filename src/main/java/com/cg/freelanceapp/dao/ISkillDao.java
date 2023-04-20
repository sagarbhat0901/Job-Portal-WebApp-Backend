package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Skill;

//This is the DAO Interface for Skill module. 
@Repository
public interface ISkillDao extends JpaRepository<Skill, Long> {

	//This method checks if a skill exists by the given unique name.
	boolean existsByName(String name);

	//This method returns a skill by the given unique name.
	Skill findByName(String name);
	
	//This method returns the current value of primary key from the sequence.
	@Query(value = "select skill_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

}
