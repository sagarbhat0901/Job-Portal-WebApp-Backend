package com.cg.freelanceapp.exceptions;

//Invalid Skill Exception class 
public class InvalidSkillException extends RuntimeException {

	private static final long serialVersionUID = -1840953501707991093L;

	public InvalidSkillException() {
		super();
	}

	public InvalidSkillException(String message) {
		super(message);
	}

}
