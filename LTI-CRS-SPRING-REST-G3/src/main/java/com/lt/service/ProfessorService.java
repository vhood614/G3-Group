package com.lt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorService implements ProfessorServiceInterface {

	public void viewReportCard() {
		
		
	}

	public List viewCourse() {

		List courses = new ArrayList<>();
		courses.add("Computer Science");
		courses.add("Data Mining");
		courses.add("Power BI");

		return courses;
	}

	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		
		List studentList = new ArrayList<>();
		studentList.add("Vaibhav");
		studentList.add("Akhil");
		studentList.add("Akshay");
		studentList.add("Hitler");
		
		System.out.println(studentList);
		

	}

	@Override
	public void assignGraddes() {
		// TODO Auto-generated method stub
		
	}

}
