package com.cg.freelanceapp.exceptions;

//Invalid Skill Exception class 
public class DuplicateSkillException extends RuntimeException {

	private static final long serialVersionUID = -8415532512576546747L;

	public DuplicateSkillException() {
		super();
	}

	public DuplicateSkillException(String message) {
		super(message);
	}

}
