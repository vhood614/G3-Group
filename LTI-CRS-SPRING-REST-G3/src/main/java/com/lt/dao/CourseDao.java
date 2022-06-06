package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.lt.bean.Course;

public class CourseDao implements CourseDaoInterface {
	
	/**
	 * Returns the list of all the courses.
	 */

	@Override
	public List returnCoursesList() {
		// TODO Auto-generated method stub
		List courseList = new ArrayList<>();
		Course course1 = new Course("Computer SCience", 11L, 500);
		Course course2 = new Course("Data Mining", 12L, 500);
		Course course3 = new Course("Data Science", 13L, 500);
		Course course4 = new Course("Data Architect", 14L, 500);
		
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		return courseList;

	}
	
	public List returnAllCoursesList() {
		List allCoursesList = new ArrayList<>();
		allCoursesList.add("Computer Science");
		allCoursesList.add("Data Mining");
		allCoursesList.add("Data Science");
		allCoursesList.add("Data Architect");
		allCoursesList.add("Data Scientist");
		return allCoursesList;
		
		
	}
	
		

}
