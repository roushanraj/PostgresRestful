package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "budget")
public class Budget {
	private int id;
	private int expense;
	private String aspect;

	
	
	public Budget() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "expense")
	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	@Column(name = "apects")
	public String getAspect() {
		return aspect;
	}

	public void setAspect(String aspect) {
		this.aspect = aspect;
	}

	public Budget(int id, int expense, String aspect) {
		this.id = id; 
		this.expense = expense;
		this.aspect = aspect;
	}

}