package com.lt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lt.bean.Catalog;
import com.lt.bean.Student;
import com.lt.dao.StudentDao;


@Service
public class StudentService implements StudentServiceInterface {

	static private StudentDao studentDao = new StudentDao();

	public List viewStudentDetails() {
		return studentDao.viewStudentDetails();
	}

	@Override
	public void registerCourse(String studentName) {
		studentDao.registerCourse(studentName);
	}

	public void viewReportcard(int id) {
		int i = id;
		studentDao.viewreportcard(i);

	}

	public void viewCatalog() {
		ArrayList<Catalog> resultlist = (ArrayList<Catalog>) studentDao.viewCatalog();

		System.out.println(" Courses:");
		resultlist.stream().peek(System.out::println);

	}

	@Override
	public void payFee() {
		// TODO Auto-generated method stub
		studentDao.payFee();
	}

	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		studentDao.addCourse();

	}

	@Override
	public void dropCourse() {
		// TODO Auto-generated method stub
		studentDao.dropCourse();

	}

}
