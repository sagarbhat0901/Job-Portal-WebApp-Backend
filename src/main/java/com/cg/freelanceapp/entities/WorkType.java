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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "work_id")
@Table(name="work_type_table")
public class WorkType implements Serializable {
	

	private static final long serialVersionUID = -8647490021701932174L;


	@Id
	@Column(name = "work_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "work_seq")
	@SequenceGenerator(name = "work_seq", sequenceName = "work_seq", allocationSize = 1)
	private Long work_id;
	
	
	@Column(unique = true, nullable = false)
	private String work_type;

	public Long getWork_id() {
		return work_id;
	}

	public void setWork_id(Long work_id) {
		this.work_id = work_id;
	}

	public String getWork_type() {
		return work_type;
	}

	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}

	public WorkType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkType(Long work_id, String work_type) {
		super();
		this.work_id = work_id;
		this.work_type = work_type;
	}
	

}
