package com.example.Springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springbootcrud.model.Student;
import com.example.Springbootcrud.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping
	public void createStudent(Student obj) {
		
	}
	
	@GetMapping
	public Student getStudent(Integer studnetId) {
		return service.getStudent(5);
	}

}
