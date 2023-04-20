package com.cg.freelanceapp.exceptions;

//Invalid Admin Exception class
public class InvalidAdminException extends RuntimeException {

	private static final long serialVersionUID = -1441549585631024871L;

	public InvalidAdminException() {
		super();
	}

	public InvalidAdminException(String message) {
		super(message);
	}

}
