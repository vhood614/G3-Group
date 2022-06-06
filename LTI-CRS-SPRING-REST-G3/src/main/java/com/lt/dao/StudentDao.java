package com.lt.dao;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lt.bean.Catalog;
import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;

/**
 * 
 * StudentDao class implementing the StudentDaoInterface to get the
 * unimplemented methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */

@Repository
public class StudentDao implements StudentDaoInterface {
	private static final Logger logger = LoggerFactory.getLogger(StudentDao.class);

	Scanner sc = new Scanner(System.in);
	static Map<String, String> catalog = new HashMap<>();
	static List studentCourseList = new ArrayList<>();
	static Student student = new Student();

	/**
	 * 
	 * Here is a viewStudentDetails method, which will be used to display the list
	 * of students.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public List viewStudentDetails() {
		
		List<Student> studentDetails= new ArrayList<Student>();
		Student s1= new Student(101, "Mansi", 24);
		Student s2= new Student(101, "Parul", 28);
		Student s3= new Student(101, "Vaibhav", 26);
		Student s4= new Student(101, "Akshay", 22);
		Student s5= new Student(101, "Akhil", 29);
		
		studentDetails.add(s1);
		studentDetails.add(s2);
		studentDetails.add(s3);
		studentDetails.add(s4);
		studentDetails.add(s5);
		
		
		
		return studentDetails;
	}

	/**
	 * 
	 * Here is a registerCourse method, which will be used by students to register
	 * for any offered courses..
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */

	@Override
	public void registerCourse(String studentName) {

		Student student = new Student(1, studentName, 0);
		System.out.println("-------------------------------------------");
		System.out.println("Select Course to Register:");
		List course = new CourseDao().returnCoursesList();
		course.stream().peek(System.out::println);
		System.out.println("Select Course:");
		Scanner sc = new Scanner(System.in);
		String studentCourseChoice = sc.nextLine();

		if (course.stream().anyMatch(p -> p.equals(studentCourseChoice))) {
			student.setStudentCourse(new Course(studentCourseChoice, 1, 1));
			System.out.println("-----------------------------------------------------------------------------");
			System.out.printf("%10s %20s %15s", "STUDENT NAME", "GRADE", "COURSE NAME");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");

			System.out.format("%10s %20s %15s", student.getStudentName(), student.getStudentGrades(),
					student.getStudentCourse().getCourseName());
			System.out.println();

			System.out.println("-----------------------------------------------------------------------------");
//			System.out.println("Student [studentName=" + student.getStudentName() + ", studentGrades="
//					+ student.getStudentGrades() + ", CourseName=" + student.getStudentCourse().getCourseName() + "]");
			System.out.println("Successfully registered for the course!");
		} else {
			System.out.println("course not found!!");
		}

	}

	/**
	 * 
	 * Here is a viewReportCardMethod method, which will be used to display the
	 * report card.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */

	@Override
	public ArrayList<String> viewreportcard(int i) {
		// TODO Auto-generated method stub
		ArrayList<String> datalist = new ArrayList<String>();

		if (i == 10) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 1) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 2) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 3) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 4) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		}
		Iterator<String> i6 = datalist.iterator();
		while (i6.hasNext()) {

			String test = i6.next();
			System.out.println(test);
		}
		return datalist;
	}

	/**
	 * 
	 * Here is a ViewCatalog method, which will be used to show the offered courses.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public Map<String, String> viewCatalog() {
		System.out.println("-------------------------------------------");
		Map<String, String> courseMap = new HashMap<String, String>();
		courseMap.put("1", "Computer Science");
		courseMap.put("2", "Data Mining");
		courseMap.put("3", "Data Science");
		courseMap.put("4", "Data Architect");

		for (var entry : courseMap.entrySet()) {
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}
		System.out.println("-------------------------------------------");
		return courseMap;
	}

	@Override
	public void payFee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the course name to pay fees for : ");
		String courseName = sc.nextLine();
		System.out.println("Fees paid successfuly!");

	}

	/**
	 * 
	 * Here is an addCourse method, which will be used to add courses from the
	 * offered courses.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public void addCourse() {
//		System.out.println("-------------------------------------------");
//		// TODO Auto-generated method stub
//		System.out.println("Below are the offered courses: ");
//		System.out.println(viewCatalog());
//		Map studentCourseMap = viewCatalog();
//		System.out.println("-------------------------------------------");
//		System.out.println("Add a course from catalog: ");
//		Scanner sc = new Scanner(System.in);
//		String studentCourseChoice = sc.nextLine();
//
//		switch (studentCourseChoice) {
//		case "1":
//			studentCourseList.add(studentCourseMap.get(studentCourseChoice));
//			System.out.println("-------------------------------------------");
//
//			System.out.println("Student Course list after adding : ");
//			Iterator<Professor> i2 = studentCourseList.iterator();
//			while (i2.hasNext()) {
//
//				Professor test = i2.next();
//				System.out.println(test);
//			}
//			System.out.println("-------------------------------------------");
//
//		}
		
		

	}

	/**
	 * 
	 * Here is a dropCourse method, which will be used to drop the course from the
	 * Students added courses list.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public void dropCourse() {
		System.out.println("-------------------------------------------");
		// TODO Auto-generated method stub
		System.out.println("Below are the offered courses: ");
		System.out.println(viewCatalog());
		Map studentCourseMap = viewCatalog();
		System.out.println("-------------------------------------------");
		System.out.println("Drop a course from Student Course List: ");
		Scanner sc = new Scanner(System.in);
		String studentCourseChoice = sc.nextLine();

		switch (studentCourseChoice) {
		case "1":
			viewCatalog().remove(studentCourseMap.get(studentCourseChoice));
			System.out.println("Student Course list after removing : " + "\n" + viewCatalog());
			Iterator<Professor> i2 = ((List) viewCatalog()).iterator();
			while (i2.hasNext()) {

				Professor test = i2.next();
				System.out.println(test);
				System.out.println("-------------------------------------------");
			}

		}

	}

}