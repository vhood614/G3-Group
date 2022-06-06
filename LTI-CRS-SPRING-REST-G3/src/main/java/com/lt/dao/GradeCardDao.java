package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.lt.bean.Student;

public class GradeCardDao implements GradeCardDaoInterface{

	@Override
	public void showReportCard() {
		// TODO Auto-generated method stub
		List<Student> stu= new ArrayList<Student>();
		Student st1= new Student(101, "Amit", 56);
//		st1.setStudentId(101);
//		st1.setStudentName("Amit");
//		st1.setStudentGrades(56);
		Student st2= new Student(102, "Anil",66);
//		st2.setStudentId(102);
//		st2.setStudentName("Anil");
//		st2.setStudentGrades(66);
		Student st3= new Student(103, "Ankit", 76);
//		st3.setStudentId(103);
//		st3.setStudentName("Ankit");
//		st3.setStudentGrades(76);
		stu.add(st1);
		stu.add(st2);
		stu.add(st3);
//		ListIterator listItr =(ListIterator)stu.listIterator();
//		while(listItr.hasNext()){
//		Student stud =(Student)listItr.next();
//		System.out.print(" "+stud.getStudentId());
//		System.out.print(" "+stud.getStudentName());
//		System.out.println(" "+stud.getStudentGrades());
		System.out.println("----------------");
		Iterator<Student> i = stu.iterator();
		while (i.hasNext()) {
			Student test = i.next();
			System.out.println(" " + test);
		}
		
	}

}
