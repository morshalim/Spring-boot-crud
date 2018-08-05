package com.example.Springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Springbootcrud.model.Student;
import com.example.Springbootcrud.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;

	@Transactional(readOnly = true)
	public Student getStudent(Integer studnetId) {
		return repo.getOne(studnetId);
	}

	@Transactional
	public Student createStudent(Student objStudent) {
		return repo.save(objStudent);
	}

	@Transactional
	public String deleteStudent(Integer studentId) {
		repo.deleteById(studentId);
		return "Successfully deleted for id=" + studentId;
	}

	@Transactional
	public Student updateStudent(Student objStudent) {
		return repo.save(objStudent);

	}

	@Transactional
	public int deleteSecondHigheestStudent() {
		return repo.deleteSecondHighestId();
	}

	public List<Student> getAllStudents() {

		return repo.findAll();
	}

}
