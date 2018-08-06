package com.example.Springbootcrud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Springbootcrud.model.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class SpringBootCrudApplicationTests {

	TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}
	@Test
	public void createStatement() {
		Student obj=new Student();
		obj.setId(2);
		obj.setName("Morshalim");
		ResponseEntity<Student> response=this.restTemplate.postForEntity("/api", obj, Student.class);
		System.out.println("body="+response.getBody().getName());
		Student res=this.restTemplate.getForObject("/api/2", Student.class);
		System.out.println("obj.getName="+res.getName());


	}

}
