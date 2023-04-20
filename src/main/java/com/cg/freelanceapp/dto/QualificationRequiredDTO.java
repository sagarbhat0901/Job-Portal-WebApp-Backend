package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

public class QualificationRequiredDTO {

	@NotEmpty(message = "Qualification required cannot be blank")
	private String qualification_type;

	public String getQualification_type() {
		return qualification_type;
	}

	

	public QualificationRequiredDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setQualification_type(String qualification_type) {
		this.qualification_type = qualification_type;
	}



	public QualificationRequiredDTO(String qualification_type) {
			super();
			this.qualification_type = qualification_type;
		}
}
