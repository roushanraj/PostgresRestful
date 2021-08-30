package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ReportCard;

public interface ResultRepository extends JpaRepository<ReportCard, Integer>{

}
