package com.theserdarozcan.studentservice.service;

import org.springframework.stereotype.Service;

import com.theserdarozcan.studentservice.model.Student;
import com.theserdarozcan.studentservice.repository.FirstNameRepository;
import com.theserdarozcan.studentservice.repository.LastNameRepository;

@Service
public class StudentService {
	FirstNameRepository firstNameRepository;
	LastNameRepository lastNameRepository;

	public StudentService(FirstNameRepository firstNameRepository, LastNameRepository lastNameRepository) {
		this.firstNameRepository = firstNameRepository;
		this.lastNameRepository = lastNameRepository;
	}

	public Student getRandomStudent() {
		Student student = new Student();
		student.setFirstName(firstNameRepository.getRandomFirstName().getFirstName());
		student.setLastName(lastNameRepository.getRandomLastName().getLastName());
		return student;
	}
}
