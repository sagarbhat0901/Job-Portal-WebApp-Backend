package com.cg.freelanceapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.exceptions.InvalidFreelancerException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.IFreelancerService;


//Rest controller class for Freelancer module. 
@RestController
@RequestMapping("/freelancer")
@CrossOrigin(origins = "*")
public class FreelancerController {

	@Autowired
	IFreelancerService freelancerService;
	
	// This method adds a new freelancer.
	@PostMapping("/add")
	public ResponseEntity<Object> createFreelancer(@Valid @RequestBody FreelancerDTO freelancerDto,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new JobPortalValidationException(errMessages);
		}
		try {
			freelancerService.save(freelancerDto);
		} catch (InvalidFreelancerException exception) {
			throw new InvalidFreelancerException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
	}
	
	//This method fetches a freelancer based on the unique id.
	@GetMapping("/get/id/{id}")
	public Freelancer getById(@PathVariable Long id) {
		try {
			return freelancerService.findById(id);
		}
		catch(InvalidFreelancerException exception){
			throw new InvalidFreelancerException("Freelancer with given id not found.");
		}
	}
	
    // This method fetches a freelancer based on the username
	@GetMapping("/get/name/{userName}")
	public Freelancer getByUserName(@PathVariable String userName) {
		try {
			return freelancerService.findByUserName(userName);
		}
		catch(InvalidFreelancerException exception){
			throw new InvalidFreelancerException("Freelancer with userName not found.");
		}
	}
	
	//This method updates a freelancer based on the unique id
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateFreelancer(@Valid @PathVariable Long id,
			@RequestBody FreelancerDTO freelancerDto) {
		try {
			freelancerService.update(id, freelancerDto);
		} catch (InvalidFreelancerException exception) {
			throw new InvalidFreelancerException("Freelancer with given id not found");
		}
		return new ResponseEntity<>("Updated Freelancer Successfully", HttpStatus.OK);
	}
	
	
	//This method fetches a list of all freelancers 
	@GetMapping("/listAll")
	public ResponseEntity<Object> listAll(){
		return new ResponseEntity<>(freelancerService.listFreelancers(), HttpStatus.OK);
	}
}