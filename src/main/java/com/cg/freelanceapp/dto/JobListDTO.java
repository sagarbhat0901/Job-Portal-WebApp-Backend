package com.cg.freelanceapp.dto;


//This is the DTO class for JobList module.
public class JobListDTO {

	private Long jobId;
	private Long freelancerId;
	private String freelancerName;
	private Long skillId;
	private String skillName;
	private Long recruiterId;
	private String recruiterName;
	private String jobTitle;
	private String jobDescription;
	private Long jobSalary;
	private boolean jobStatus;
	private Long workTypeId;
	private String workTypeName;
	private Long jobTypeId;
	private String jobTypeName;
	private Long qualificationRequiredId;
	private String qualificationRequiredName;
	private Long jobExperienceId;
	private String jobExperienceName;
	
	public JobListDTO(Long jobId, Long freelancerId, String freelancerName, Long skillId, String skillName,
			Long recruiterId, String recruiterName, String jobTitle, String jobDescription, Long jobSalary, boolean jobStatus,
			Long workTypeId, String workTypeName, Long jobTypeId, String jobTypeName, Long qualificationRequiredId, String qualificationRequiredName, Long jobExperienceId, String jobExperienceName) {
		super();
		this.jobId = jobId;
		this.freelancerId = freelancerId;
		this.freelancerName = freelancerName;
		this.skillId = skillId;
		this.skillName = skillName;
		this.recruiterId = recruiterId;
		this.recruiterName = recruiterName;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobSalary = jobSalary;
		this.jobStatus = jobStatus;
		this.workTypeId = workTypeId;
		this.workTypeName = workTypeName;
		this.jobTypeId = jobTypeId;
		this.jobTypeName = jobTypeName;
		this.qualificationRequiredId = qualificationRequiredId;
		this.qualificationRequiredName = qualificationRequiredName;
		this.jobExperienceId = jobExperienceId;
		this.jobExperienceName = jobExperienceName;
	}
	
	public JobListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public Long getFreelancerId() {
		return freelancerId;
	}
	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}
	public String getFreelancerName() {
		return freelancerName;
	}
	public void setFreelancerName(String freelancerName) {
		this.freelancerName = freelancerName;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Long getRecruiterId() {
		return recruiterId;
	}
	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
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
	public boolean isJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(boolean jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Long getWorkTypeId() {
		return workTypeId;
	}

	public void setWorkTypeId(Long workTypeId) {
		this.workTypeId = workTypeId;
	}

	public String getWorkTypeName() {
		return workTypeName;
	}

	public void setWorkTypeName(String workTypeName) {
		this.workTypeName = workTypeName;
	}

	public Long getJobTypeId() {
		return jobTypeId;
	}

	public void setJobTypeId(Long jobTypeId) {
		this.jobTypeId = jobTypeId;
	}

	public String getJobTypeName() {
		return jobTypeName;
	}

	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}

	public Long getQualificationRequiredId() {
		return qualificationRequiredId;
	}

	public void setQualificationRequiredId(Long qualificationRequiredId) {
		this.qualificationRequiredId = qualificationRequiredId;
	}

	public String getQualificationRequiredName() {
		return qualificationRequiredName;
	}

	public void setQualificationRequiredName(String qualificationRequiredName) {
		this.qualificationRequiredName = qualificationRequiredName;
	}

	public Long getJobExperienceId() {
		return jobExperienceId;
	}

	public void setJobExperienceId(Long jobExperienceId) {
		this.jobExperienceId = jobExperienceId;
	}

	public String getJobExperienceName() {
		return jobExperienceName;
	}

	public void setJobExperienceName(String jobExperienceName) {
		this.jobExperienceName = jobExperienceName;
	}

	public Long getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(Long jobSalary) {
		this.jobSalary = jobSalary;
	}

}
