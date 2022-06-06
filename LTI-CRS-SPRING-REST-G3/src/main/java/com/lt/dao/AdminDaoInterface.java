package com.lt.dao;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;

public interface AdminDaoInterface {
	
	public void adminLogin();

	public List addCourse();

	public void removeCourse();

	public void addProfessor();

	public void approveStudentRegistration();

	/**
	 * 
	 * Here is a addCourse method, which will be used to add a new course in the catalog.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	List addCourse(Course course);

	/**
	 * 
	 * Here is a removeCourse method, which will be used to remove course from the catalog.
	 * 
	 * @author Group3
	 * @param id 
	 * @return Nothing
	 *
	 */
	List<Course> removeCourse(Long id);

	/**
	 * 
	 * Here is a addProfessor method, which will be used to add a new professor.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	List addProfessor(Professor professor);

}
