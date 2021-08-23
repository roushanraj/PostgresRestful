package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentOperation;

@RestController
public class StudentController {

	@Autowired
	StudentOperation operation;
	@RequestMapping("/students")
	public List<Student> getStudents(){
		return operation.getStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student) {
		operation.setStudent(student);
	}
	
}
