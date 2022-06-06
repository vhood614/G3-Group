package com.lt.service;

import com.lt.dao.GradeCardDao;

public class GradeCardService implements GradeCardInterface{
	
	public void returnGradeCard() {
	GradeCardDao gradeCardDao = new GradeCardDao();
	gradeCardDao.showReportCard();
	}
	

}
