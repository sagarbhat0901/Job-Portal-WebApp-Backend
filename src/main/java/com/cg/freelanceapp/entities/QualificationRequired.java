package com.cg.freelanceapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "qualification_id")
@Table(name="qualification_required_table")
public class QualificationRequired implements Serializable  {

	private static final long serialVersionUID = 3586576326052639447L;
	

	@Id
	@Column(name = "qualification_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "qualification_seq")
	@SequenceGenerator(name = "qualification_seq", sequenceName = "qualification_seq", allocationSize = 1)
	private Long qualification_id;
	
	
	@Column(unique = true, nullable = false)
	private String qualification_type;


	public Long getQualification_id() {
		return qualification_id;
	}


	public void setQualification_id(Long qualification_id) {
		this.qualification_id = qualification_id;
	}


	public String getQualification_type() {
		return qualification_type;
	}


	public void setQualification_type(String qualification_type) {
		this.qualification_type = qualification_type;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public QualificationRequired(Long qualification_id, String qualification_type) {
		super();
		this.qualification_id = qualification_id;
		this.qualification_type = qualification_type;
	}


	public QualificationRequired() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
