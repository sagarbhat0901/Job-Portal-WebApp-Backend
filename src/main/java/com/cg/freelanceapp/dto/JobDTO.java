package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

//This is the DTO class for Job module.
public class JobDTO {
	private long freelancerid = 2L;
	@NotNull(message = "skillId cant be null")
	private long skillId;
	@NotNull(message = "recruiterid cant be null")
	private long recruiterId;

	private String jobTitle;
	private String jobDescription;
	private long work_id;
	private long type_id;
	private long qualification_id;
	public JobDTO() {
		super();
	}
	public long getFreelancerid() {
		return freelancerid;
	}
	public void setFreelancerid(long freelancerid) {
		this.freelancerid = freelancerid;
	}
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public long getRecruiterId() {
		return recruiterId;
	}
	public void setRecruiterId(long recruiterId) {
		this.recruiterId = recruiterId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public long getWork_id() {
		return work_id;
	}
	public void setWork_id(long work_id) {
		this.work_id = work_id;
	}
	public long getType_id() {
		return type_id;
	}
	public void setType_id(long type_id) {
		this.type_id = type_id;
	}
	
	public JobDTO(long freelancerid, @NotNull(message = "skillId cant be null") long skillId,
			@NotNull(message = "recruiterid cant be null") long recruiterId, String jobTitle, String jobDescription, long type_id, long work_id, long qualification_id) {
		super();
		this.freelancerid = freelancerid;
		this.skillId = skillId;
		this.recruiterId = recruiterId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.type_id = type_id;
		this.work_id = work_id;
		this.qualification_id=qualification_id;
}
	public long getQualification_id() {
		return qualification_id;
	}
	public void setQualification_id(long qualification_id) {
		this.qualification_id = qualification_id;
	}}