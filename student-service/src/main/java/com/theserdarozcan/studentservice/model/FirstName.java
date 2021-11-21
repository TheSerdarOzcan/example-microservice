package com.theserdarozcan.studentservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("firstnames")
public class FirstName {
	private String firstname;

	public FirstName() {
	}

	public FirstName(String firstname) {
		super();
		this.firstname = firstname;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
}
