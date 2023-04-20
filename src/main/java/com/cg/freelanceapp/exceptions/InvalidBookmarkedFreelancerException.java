package com.cg.freelanceapp.exceptions;

//Invalid Bookmarked Freelancer Exception class. 
 
public class InvalidBookmarkedFreelancerException extends RuntimeException {

	private static final long serialVersionUID = -397062827051951364L;

	public InvalidBookmarkedFreelancerException() {
		super();
	}

	public InvalidBookmarkedFreelancerException(String message) {
		super(message);
	}

}
