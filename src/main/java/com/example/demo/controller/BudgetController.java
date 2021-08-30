package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Budget;
import com.example.demo.service.BudgetOperation;

@RestController
public class BudgetController {
	@Autowired
	BudgetOperation operation;
	
	@CrossOrigin
	@RequestMapping("/budget")
	public List<Budget> getBudget(){
		return operation.getBudget();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/budget")
	public void addStudent(@RequestBody Budget budget) {
		operation.setBudget(budget);
	}
}
