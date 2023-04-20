package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

public class WorkTypeDTO {
	@NotEmpty(message = "Work Type cannot be blank")
	private String work_type;

	public WorkTypeDTO(String work_type) {
		super();
		this.work_type = work_type;
	}

	public WorkTypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWork_type() {
		return work_type;
	}

	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}

}
