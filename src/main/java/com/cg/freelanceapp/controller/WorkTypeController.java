package com.cg.freelanceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.WorkType;
import com.cg.freelanceapp.service.IWorkTypeService;

@RestController
@RequestMapping("/worktypes")
@CrossOrigin(origins = "*")
public class WorkTypeController {
	
	@Autowired
	IWorkTypeService worktypeservice;
	
	@GetMapping(value = "/getAll")
	public List<WorkType> getAllWorkTypes() {
		return worktypeservice.getAllWorkTypes();
	}

}
