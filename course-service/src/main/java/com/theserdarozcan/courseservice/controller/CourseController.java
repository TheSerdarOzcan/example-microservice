package com.theserdarozcan.courseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.theserdarozcan.courseservice.model.Course;
import com.theserdarozcan.courseservice.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping("/randomcourse")
	public Course getRandomCourse() {
		return courseService.getRandomCourse();
	}
}
