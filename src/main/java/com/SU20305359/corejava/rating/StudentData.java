package com.SU20305359.corejava.rating;



public class StudentData {
	
	private String name;
	private String subject;
	private String assignment_category;
	private String date_Of_Submission;
	private int points;
	
	public StudentData() {
		super();
	}

	public StudentData(String name, String subject, String assignment_category, String date_Of_Submission, int points) {
		super();
		this.name = name;
		this.subject = subject;
		this.assignment_category = assignment_category;
		this.date_Of_Submission = date_Of_Submission;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignment_category() {
		return assignment_category;
	}

	public void setAssignment_category(String assignment_category) {
		this.assignment_category = assignment_category;
	}

	public String getDate_Of_Submission() {
		return date_Of_Submission;
	}

	public void setDate_Of_Submission(String date_Of_Submission) {
		this.date_Of_Submission = date_Of_Submission;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Studentdata [name=" + name + ", subject=" + subject + ", assignment_category=" + assignment_category
				+ ", date_Of_Submission=" + date_Of_Submission + ", points=" + points + "]";
	}
	
	

}

