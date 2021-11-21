package com.theserdarozcan.examservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.theserdarozcan.examservice.model.Course;
import com.theserdarozcan.examservice.model.ExamResult;
import com.theserdarozcan.examservice.model.Student;

@Service
public class ExamService {
	
	@Autowired
	RestTemplate restTemplate;
	Random random = new Random();
	
	public ExamResult getRandomExamResult() {
		Student student = restTemplate.getForObject("http://student-service/randomstudent", Student.class);
		Course course = restTemplate.getForObject("http://course-service/randomcourse", Course.class);
		ExamResult examResult = new ExamResult();
		examResult.setFirstName(student.getFirstName());
		examResult.setLastName(student.getLastName());
		examResult.setCourse(course.getName());
		examResult.setScore(random.nextInt(101));
		return examResult;
	}
}
