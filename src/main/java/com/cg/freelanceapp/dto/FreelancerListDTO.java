package com.cg.freelanceapp.dto;


//This is the DTO class for FreelancerList module.
public class FreelancerListDTO {
	private Long id;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;

	public FreelancerListDTO(Long id, String userName, String firstName, String lastName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FreelancerListDTO [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + "]";
	}

}
