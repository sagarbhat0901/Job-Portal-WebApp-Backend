package com.cg.freelanceapp.exceptions;

//Invalid Recruiter Exception class. 
public class InvalidRecruiterException extends RuntimeException {
	
	private static final long serialVersionUID = -1319886001655231121L;

	public InvalidRecruiterException() {
		super();
	}

	public InvalidRecruiterException(String msg) {
		super(msg);
	}
}
