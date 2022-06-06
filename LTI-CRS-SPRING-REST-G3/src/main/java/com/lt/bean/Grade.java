package com.lt.bean;

public class Grade {
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Grade [grade=" + grade + "]";
	}

	public Grade(int grade) {
		super();
		this.grade = grade;
	}
	
	
	

}
