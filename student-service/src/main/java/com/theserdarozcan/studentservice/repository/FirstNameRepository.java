package com.theserdarozcan.studentservice.repository;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.theserdarozcan.studentservice.model.FirstName;

public interface FirstNameRepository extends MongoRepository<FirstName, Object> {
	@Aggregation("{ $sample: { size: 1 } }")
	FirstName getRandomFirstName();
}
