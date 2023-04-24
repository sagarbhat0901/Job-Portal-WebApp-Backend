package com.cg.freelanceapp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "exp_id")
@Table(name="job_experience_table")
public class JobExperience implements Serializable {

	private static final long serialVersionUID = 4266419932815132058L;
	
	@Id
	@Column(name = "exp_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "exp_seq")
	@SequenceGenerator(name = "exp_seq", sequenceName = "exp_seq", allocationSize = 1)
	private Long exp_id;
	
	@Column(unique = true, nullable = false)
	private String job_exp;

	public Long getExp_id() {
		return exp_id;
	}

	public void setExp_id(Long exp_id) {
		this.exp_id = exp_id;
	}

	public String getJob_exp() {
		return job_exp;
	}

	public void setJob_exp(String job_exp) {
		this.job_exp = job_exp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JobExperience(Long exp_id, String job_exp) {
		super();
		this.exp_id = exp_id;
		this.job_exp = job_exp;
	}

	public JobExperience() {
		super();
		// TODO Auto-generated constructor stub
	}

}	
