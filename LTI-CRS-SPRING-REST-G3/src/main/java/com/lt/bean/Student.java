package com.lt.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentGender;
	private int studentAge;
	private String studentUserName;
	private int userPassword;
	private int studentSemister;
	private int studentGrades;
	private Course studentCourse;
	
	
	
public Student() {
		super();
	}
public Course getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(Course studentCourse) {
		this.studentCourse = studentCourse;
	}
	//	public Student(int studentId, String studentName, String studentAddress, String studentGender, int studentAge,
//			String studentUserName, int userPassword, int studentSemister, int studentGrades) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.studentAddress = studentAddress;
//		this.studentGender = studentGender;
//		this.studentAge = studentAge;
//		this.studentUserName = studentUserName;
//		this.userPassword = userPassword;
//		this.studentSemister = studentSemister;
//		this.studentGrades = studentGrades;
//	}
	public int getStudentGrades() {
		return studentGrades;
	}
	public void setStudentGrades(int studentGrades) {
		this.studentGrades = studentGrades;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentUserName() {
		return studentUserName;
	}
	public void setStudentUserName(String studentUserName) {
		this.studentUserName = studentUserName;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	public int getStudentSemister() {
		return studentSemister;
	}
	public void setStudentSemister(int studentSemister) {
		this.studentSemister = studentSemister;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGrades=" + studentGrades
				+ "]";
	}
	
	
	
	
	public Student(int studentId, String studentName, int studentGrades) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGrades = studentGrades;
	}
	
	

}
