package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.FeedbackDTO;
import com.cg.freelanceapp.exceptions.InvalidFeedbackException;
import com.cg.freelanceapp.service.IFeedbackService;


//This is the rest controller class for feedbacks module.
@RestController
@RequestMapping("/feedbacks")
@CrossOrigin(origins = "*")
public class FeedbackController {

	@Autowired
	IFeedbackService feedbackService;

	//add feedback
	@PostMapping("/add")
	public ResponseEntity<Object> addFeedback(@RequestBody FeedbackDTO feedbackDto) {
		feedbackService.addFeedback(feedbackDto);
		return new ResponseEntity<>("Feedback Added Successfully", HttpStatus.OK);
	}

	//to get the feedback of a freelancer by recruiter
	@GetMapping("/get/freelancer/{freelancerUId}/recruiter/{recruiterId}")
	public ResponseEntity<Object> getFeedbackForFreelancerByRecruiter(@PathVariable String freelancerUId, @PathVariable String recruiterId) {
		try {
			return new ResponseEntity<>(feedbackService.findFeedbacksForFreelancerByRecruiter(freelancerUId, recruiterId), HttpStatus.OK);
		} catch (InvalidFeedbackException exception) {
			throw new InvalidFeedbackException("Freelancer with given Id not found");
		}
	}

	
	//rating of a freelancer by freelancer id
	@GetMapping("/get/avgRatingsFor/{id}")
	public ResponseEntity<Object> getAverageRatings(@PathVariable String id) {
		try {
			return new ResponseEntity<>(feedbackService.averageRating(id), HttpStatus.OK);
		} catch (InvalidFeedbackException exception) {
			throw new InvalidFeedbackException("Freelancer with given Id not found");
		}
	}
}
