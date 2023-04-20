package com.cg.freelanceapp.exceptions;

import java.util.ArrayList;
import java.util.List;

//Job Portal Validation Exception class
public class JobPortalValidationException extends RuntimeException {

	private static final long serialVersionUID = -5970913799468930325L;
	List<String> messages = new ArrayList<>();

	public JobPortalValidationException() {
		super();
	}

	public JobPortalValidationException(List<String> messages) {
		super();
		this.messages = messages;
	}

	public List<String> getMessages() {
		return messages;
	}

}
