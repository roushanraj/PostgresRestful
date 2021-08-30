package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "result")
public class ReportCard {
	private String name;
	private int rollNo;
	private int standard;
	private int percentage;

	
	
	public ReportCard() {
	}
	public ReportCard(String name, int rollNo, int standard, int percentage) {
		this.name = name;
		this.rollNo = rollNo;
		this.standard = standard;
		this.percentage = percentage;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Id
	@Column(name = "roll")
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

	@Column(name = "percentage")
	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}