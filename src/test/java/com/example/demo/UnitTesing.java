package com.example.demo;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.controller.StudentController;
import com.example.demo.model.Student;
import com.example.demo.service.StudentOperation;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= PostgresIntegrationApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
public class UnitTesing {
	@Autowired
	private MockMvc mock;
	
	@MockBean
	private StudentOperation operation;
	
	@MockBean
	private StudentController controller;
	
	@Test
	public void getStudentsTest() throws Exception
	{
		List<Student> studentlist= getValue();
		when(controller.getStudents()).thenReturn(studentlist);
		this.mock
		.perform(MockMvcRequestBuilders.get("/students")
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)))
		.andExpect(MockMvcResultMatchers.jsonPath("$[0].name", Matchers.equalTo("DummyName")))
		.andExpect(MockMvcResultMatchers.jsonPath("$[1].name", Matchers.equalTo("DummyName1")));
	}
	
	@Test
	public void testPostStudents() {
		Student student= new Student("DummyName",44,4,2014);
		controller.addStudent(student);
		assertNotNull(controller.getStudents());
	}

	
	private List<Student> getValue(){
		List<Student> studentlist= new ArrayList<>();
		Student s1= new Student("DummyName",45,4,2014);
		Student s2= new Student("DummyName1",46,5,2013);
		studentlist.add(s1);
		studentlist.add(s2);
		return studentlist;
		
	}
}
