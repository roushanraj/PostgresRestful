package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Budget;
import com.example.demo.repositories.BudgetRepository;

@Service
@Transactional
public class BudgetOperation {
	
	@Autowired
	private BudgetRepository budgetRepo;
	
	public List<Budget> getBudget(){
		return budgetRepo.findAll();
	}
	
	public void setBudget(Budget budget) {
		budgetRepo.save(budget);
	}
	

}
