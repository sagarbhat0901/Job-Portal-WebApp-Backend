package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

public class JobTypeDTO {
	@NotEmpty(message = "Job Type cannot be blank")
	private String job_type;

	public JobTypeDTO(String job_type) {
		super();
		this.job_type = job_type;
	}

	public JobTypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

}
