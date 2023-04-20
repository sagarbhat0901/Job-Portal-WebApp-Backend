package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

//This is the DTO class for BookmarkedFreelancer module. 
public class BookmarkedFreelancerDTO {
	
	@NotNull(message = "recruiterId cant be null")
	private Long recruiterId;
	@NotNull(message = "freelancerId cant be null")
	private Long freelancerId;

	public BookmarkedFreelancerDTO() {
		super();
	}

	public BookmarkedFreelancerDTO(Long recruiterId, Long freelancerId) {
		super();
		this.recruiterId = recruiterId;
		this.freelancerId = freelancerId;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

}
