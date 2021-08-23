package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	private String name;
	private int rollNo;
	private int standard;
	private int admYear;
	
	public Student() {
		
	}
	
	
	
	public Student(String name, int rollNo, int standard, int admYear) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.standard = standard;
		this.admYear = admYear;
	}


	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rollNo")
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	@Column(name = "standard")
	public int getStandard() {
		return standard;
	}



	public void setStandard(int standard) {
		this.standard = standard;
	}


	@Column(name = "admYear", nullable = false)
	public int getAdmYear() {
		return admYear;
	}



	public void setAdmYear(int admYear) {
		this.admYear = admYear;
	}
	

}
