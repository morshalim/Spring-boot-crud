package com.example.Springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springbootcrud.model.Student;
import com.example.Springbootcrud.service.StudentService;
import com.google.common.net.MediaType;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public Student createStudent(@RequestBody Student obj) {

		System.out.println("obj=" + obj.getName());
		return service.createStudent(obj);
	}

	@GetMapping("/{studentid}")
	public Student getStudentById(@PathVariable("studentid") Integer sid) {
		System.out.println("studentid=" + sid);
		return service.getStudent(sid);
	}

	@PutMapping(consumes = "application/json")
	public Student updateStudent(@RequestBody Student obj) {

		System.out.println("obj=" + obj.getName());
		return service.updateStudent(obj);

	}

	@DeleteMapping("/{studentid}")
	public String deleteStudentById(@PathVariable("studentid") Integer sid) {
		return service.deleteStudent(sid);

	}

	@DeleteMapping(produces = "application/json")
	public int deleteSecondHighest() {
		return service.deleteSecondHigheestStudent();
	}

	@GetMapping(produces = "application/json")
	public List<Student> getAllStudents() {

		return service.getAllStudents();
	}

	

}
