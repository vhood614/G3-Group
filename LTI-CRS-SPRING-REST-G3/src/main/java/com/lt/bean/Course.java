package com.lt.bean;

public class Course {
	private String courseName;
	private Long courseId;
	private int courseFees;
	
	public Course() {
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(long l) {
		this.courseId = l;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public Course(String courseName, long i, int courseFees) {
		super();
		this.courseName = courseName;
		this.courseId = i;
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseFees=" + courseFees + "]";
	}

}
