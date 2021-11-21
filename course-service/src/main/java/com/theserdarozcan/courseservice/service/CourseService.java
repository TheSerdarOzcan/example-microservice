package com.theserdarozcan.courseservice.service;

import org.springframework.stereotype.Service;
import com.theserdarozcan.courseservice.model.Course;
import com.theserdarozcan.courseservice.repository.CourseRepository;

@Service
public class CourseService {
	CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public Course getRandomCourse() {
		return courseRepository.getRandomCourse();
	}
}
