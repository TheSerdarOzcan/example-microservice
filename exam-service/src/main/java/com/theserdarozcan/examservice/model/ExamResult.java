package com.theserdarozcan.examservice.model;

public class ExamResult {
	private String firstName;
	private String lastName;
	private String course;
	private int score;

	public ExamResult() {
	}

	public ExamResult(String firstName, String lastName, String course, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.score = score;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
