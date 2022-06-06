package com.lt.bean;

public class GradeCard {
	private int semester;
	private int studentId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public GradeCard(int semester) {
		super();
		this.semester = semester;
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "GradeCard [semester=" + semester + "]";
	}
	
	
	
	
	

}
