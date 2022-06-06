package com.lt.service;

import java.util.List;

import com.lt.bean.Student;

public interface StudentServiceInterface {
	public List viewStudentDetails();

	public void registerCourse(String student);

	public void viewReportcard(int id);

	public void viewCatalog();

	public void payFee();

	public void addCourse();

	public void dropCourse();

}
