package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lt.bean.Professor;
import com.lt.service.CourseService;
import com.lt.service.StudentService;

/**
 * 
 * ProfessorDao class implementing the ProfessorDaoInterface to get the unimplemented methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */
@Repository
public class ProfessorDao implements ProfessorDaoInterface{
	List<Professor> professorList =getProfessorList();

	
	/**
	 * 
	 * Here is a getProfessorList method, which will be used to return the list of professors.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	
	
	public List<Professor> getProfessorList(){
		List<Professor> professors = new ArrayList<>();
		professors.add(new Professor(1, "Hood", "vhood", "123"));
		professors.add(new Professor(2, "UTK", "utk", "123"));
		professors.add(new Professor(3, "Atharva", "AD", "123"));
		
		return professors;
	}
	
	/**
	 * 
	 * Here is a getTeachingCourses method, which will be used to display the list
	 * of courses the professor is teaching.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public List getTeachingCourses() {
		CourseService courseService = new CourseService();
		List coursesList = courseService.listCourses();
		return coursesList;
	}

	/**
	 * 
	 * Here is a getEnrollesStudentDetails method, which will be used to display the list
	 * of students enrolled for the courses.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public List getEnrollesStudentDetails() {
		StudentService studentService = new StudentService();
		List enrolledStudentsList = studentService.viewStudentDetails();
		return enrolledStudentsList;
	}
	
	
	
	
	
	
	
	

	@Override
	public void viewReportCard() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void viewCourse() {
		// TODO Auto-generated method stub
		
	}

}
