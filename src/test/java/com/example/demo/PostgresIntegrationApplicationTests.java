package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;

@SpringBootTest
class PostgresIntegrationApplicationTests {

	@Autowired
	private StudentRepository repo;
	@Test
	public void testPostStudent() {
		Student student = new Student("Dummy",150,8,2015);
		Student savedStudent= repo.save(student);
		assertNotNull(savedStudent);
	}
	
	@Test
	public void testGetStudents() {
		List<Student> students= repo.findAll();
		assertThat(students).size().isGreaterThan(0);
	} 
	
//	@Test
//	public void dataIntegrity() {
//		Student student = new Student("Dummy",178,4,2015);
//		student.setRollNo(178);
//		repo.save(student);
//		Student dbStudent=repo.findById(178).get();
//		boolean bool=student.getName()==dbStudent.getName();
//		assertTrue(bool);
//		
//	}
}
	

