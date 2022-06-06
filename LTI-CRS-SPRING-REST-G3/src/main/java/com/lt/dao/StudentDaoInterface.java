package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lt.bean.Catalog;

public interface StudentDaoInterface {
	
	public List viewStudentDetails();
	public void registerCourse(String studentName);	
    public ArrayList<String> viewreportcard(int id);  
    public Map<String, String> viewCatalog();
    public void addCourse();
    public void dropCourse();
	void payFee();
    
}
