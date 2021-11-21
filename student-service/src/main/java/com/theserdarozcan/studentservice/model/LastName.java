package com.theserdarozcan.studentservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("lastnames")
public class LastName {
	private String lastname;

	public LastName() {
	}

	public LastName(String lastname) {
		super();
		this.lastname = lastname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
}
