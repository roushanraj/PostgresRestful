package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ReportCard;
import com.example.demo.service.ReportCardOperation;

@RestController
public class ReportCardController {
	@Autowired
	ReportCardOperation operation;
	
	@CrossOrigin
	@RequestMapping("/result")
	public List<ReportCard> getResult(){
		return operation.getResults();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/result")
	public void addStudent(@RequestBody ReportCard result) {
		operation.setResults(result);
	}
}
