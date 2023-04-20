package com.cg.freelanceapp.exceptions;

//Invalid Job Exception class
public class InvalidJobException extends RuntimeException {

	private static final long serialVersionUID = -6180346175284964931L;

	public InvalidJobException() {
		super();
	}

	public InvalidJobException(String message) {
		super(message);
	}

}
