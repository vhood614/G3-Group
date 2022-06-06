package com.lt.service;

import java.util.Iterator;
import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.dao.CourseDao;

public class CourseService implements CourseServiceInterface{
	CourseDao courseDao = new CourseDao();
	public List listCourses()  {
		CourseDao courseDao = new CourseDao();
//		Iterator<String> i2 = courseDao.returnCoursesList().iterator();
//		while (i2.hasNext()) {
//
//			String test = i2.next();
//			System.out.println(test);
//		}
		return courseDao.returnCoursesList();
		
	}
	
	public void addCourses() {
	}

}
