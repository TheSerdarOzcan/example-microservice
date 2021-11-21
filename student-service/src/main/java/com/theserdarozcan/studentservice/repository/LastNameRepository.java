package com.theserdarozcan.studentservice.repository;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.theserdarozcan.studentservice.model.LastName;

public interface LastNameRepository extends MongoRepository<LastName, Object> {
	@Aggregation("{ $sample: { size: 1 } }")
	LastName getRandomLastName();
}
