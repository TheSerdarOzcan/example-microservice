package com.theserdarozcan.courseservice.repository;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.theserdarozcan.courseservice.model.Course;

public interface CourseRepository extends MongoRepository<Course, Object> {
	@Aggregation("{ $sample: { size: 1 } }")
	Course getRandomCourse();
}
