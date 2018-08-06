package com.example.Springbootcrud.repository;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Springbootcrud.model.Student;
@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentRepoTest {
	@Autowired
	StudentRepo repository;
	@Test
	public void findByUsernameShouldReturnUser() {
		Student entity=new Student();
		entity.setId(1);
		entity.setName("Morshalim");
		this.repository.save(entity);
		Optional<Student> user=this.repository.findById(1);
		
		assertTrue(user.isPresent());
		
		if(user.isPresent()) {
			System.out.println(user.get().getName());
		}
		
	}

}
