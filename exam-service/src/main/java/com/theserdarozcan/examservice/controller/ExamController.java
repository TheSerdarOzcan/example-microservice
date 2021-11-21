package com.theserdarozcan.examservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theserdarozcan.examservice.model.ExamResult;
import com.theserdarozcan.examservice.service.ExamService;

@RestController
public class ExamController {
	@Autowired
	ExamService examService;
	
	@GetMapping("/")
	ExamResult getRandomExamResult() {
		return examService.getRandomExamResult();
	}
}
