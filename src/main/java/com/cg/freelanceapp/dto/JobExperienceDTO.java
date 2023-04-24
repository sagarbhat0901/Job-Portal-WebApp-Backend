package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

public class JobExperienceDTO {
	@NotEmpty(message = "Job Experience cannot be blank")
	private String job_exp;

	public JobExperienceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobExperienceDTO(@NotEmpty(message = "Job Experience cannot be blank") String job_exp) {
		super();
		this.job_exp = job_exp;
	}

	public String getJob_exp() {
		return job_exp;
	}

	public void setJob_exp(String job_exp) {
		this.job_exp = job_exp;
	}

}
