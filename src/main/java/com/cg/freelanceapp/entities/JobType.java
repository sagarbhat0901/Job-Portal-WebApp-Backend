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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "type_id")
@Table(name="job_type_table")
public class JobType implements Serializable  {
	private static final long serialVersionUID = -8300534524164650071L;

	@Id
	@Column(name = "type_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "type_seq")
	@SequenceGenerator(name = "type_seq", sequenceName = "type_seq", allocationSize = 1)
	private Long type_id;
	
	@Column(unique = true, nullable = false)
	private String job_type;

	public Long getType_id() {
		return type_id;
	}

	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JobType(Long type_id, String job_type) {
		super();
		this.type_id = type_id;
		this.job_type = job_type;
	}

	public JobType() {
		super();
		// TODO Auto-generated constructor stub
	}

}
