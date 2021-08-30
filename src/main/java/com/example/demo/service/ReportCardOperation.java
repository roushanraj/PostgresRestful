package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ReportCard;
import com.example.demo.repositories.ResultRepository;

@Service
@Transactional
public class ReportCardOperation {
	@Autowired
	private ResultRepository resultRepo;

	public List<ReportCard> getResults() {
		return resultRepo.findAll();
	}

	public void setResults(ReportCard reportCard) {
		resultRepo.save(reportCard);
	}
}
