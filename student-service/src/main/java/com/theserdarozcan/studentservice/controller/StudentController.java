package com.theserdarozcan.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.theserdarozcan.studentservice.model.Student;
import com.theserdarozcan.studentservice.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/randomstudent")
	public Student getRandom() {
		return studentService.getRandomStudent();
	}
}
