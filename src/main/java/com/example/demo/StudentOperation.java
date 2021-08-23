package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentOperation {
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	public void setStudent(Student student) {
		studentRepo.save(student);
	}
	
	
	
	/*
	 * @Autowired private JdbcTemplate postgres;
	 * 
	 * public void createTable() { //SERIAL datatype for dynamic sizing String
	 * create=
	 * "CREATE TABLE IF NOT EXISTS student (name varchar(80) NOT NULL,rollNo SERIAL PRIMARY KEY,standard integer(2),admYear integer(4))"
	 * ; this.postgres.update(create); }
	 * 
	 * public void insertStudent(String name,int roll, int standard, int
	 * admission_year) { String insert= "INSERT INTO student VALUES (?,?,?,?)";
	 * this.postgres.update(insert,name,roll,standard,admission_year); }
	 * 
	 */
}
