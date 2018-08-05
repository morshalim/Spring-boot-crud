package com.example.Springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Springbootcrud.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Transactional
	@Modifying
	@Query("delete from Student where id in" + "(select max(id) from Student where "
			+ "id not in(select max(id) from Student))")
	public int deleteSecondHighestId();
}
