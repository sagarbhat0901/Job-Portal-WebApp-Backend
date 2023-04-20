package com.cg.freelanceapp.exceptions;

//Invalid Skill Experience Exception class
public class InvalidSkillExperienceException extends RuntimeException {

	private static final long serialVersionUID = 6148287575513172164L;

	public InvalidSkillExperienceException() {
		super();
	}

	public InvalidSkillExperienceException(String message) {
		super(message);
	}

}
