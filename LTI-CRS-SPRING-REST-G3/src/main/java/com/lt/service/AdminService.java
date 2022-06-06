package com.lt.service;

import com.lt.dao.AdminDao;
import com.lt.dao.AdminDaoInterface;

public class AdminService implements AdminServiceInterface {

	public void addCourse() {
		AdminDao adminDao = new AdminDao();
		adminDao.addCourse();

	}

	public void removeCourse() {
		AdminDao adminDao = new AdminDao();
		adminDao.removeCourse();
	}

	public void addProfessor() {
		AdminDao adminDao = new AdminDao();
		adminDao.addProfessor();

	}

	@Override
	public void approveStudentRegistration() {
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDao();
		adminDao.approveStudentRegistration();

	}

}
