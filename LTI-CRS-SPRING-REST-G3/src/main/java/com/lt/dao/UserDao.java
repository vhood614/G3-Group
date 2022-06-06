package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lt.bean.Student;
import com.lt.bean.User;

/**
 * 
 * UserDao class implementing the UserDaoInterface to get the unimplemented
 * methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */

@Repository
public class UserDao implements UserDaoInterface {
	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);
	Scanner sc = new Scanner(System.in);
	List<User> userDetails = new ArrayList<User>();

	/**
	 * 
	 * Here is a loginUsers method, which will be used to get the list of all login
	 * users.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public List<User> loginUsers() {
		// TODO Auto-generated method stub

//		List<User> userDetails= new ArrayList<User>();
		User u1 = new User(10001L, "Praveen", "praveen11", "@praveen", "Professor");
		User u2 = new User(10002L, "Naveen", "naveen11", "@naveen", "Professor");
		User u3 = new User(1000L, "Mridul", "mridul1", "@mridul", "Student");
		User u4 = new User(10004L, "Raj", "raj11", "@raj", "Professor");
		User u5 = new User(10005L, "admin", "admin11", "@admin", "Admin");

		userDetails.add(u1);
		userDetails.add(u2);
		userDetails.add(u3);
		userDetails.add(u4);
		userDetails.add(u5);

		logger.debug("List of lofin in users " + userDetails);
		logger.info("Listing login users");
		logger.error("This is logger error");
		return userDetails;

	}

	/**
	 * 
	 * Here is a createRegistrationScreen method, which will be used to create the
	 * Registration screen from the welcome menu
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public List createRegistrationScreen(User user) {

//		System.out.println("Enter required details for registration: ");
//		System.out.println("Enter id: ");
//		String id = sc.nextLine();
//		
//		System.out.println("Enter Name: ");
//		String name = sc.nextLine();
//		
//		System.out.println("Enter Password: ");
//		String password = sc.nextLine();
//		
//		System.out.println("Enter Username: ");
//		String username = sc.nextLine();
//		
//		System.out.println("Enter Role: ");
//		String role = sc.nextLine();
//		
//		System.out.println("New user created.."+"\n");
//		User u6 = new User(id, name, password, username, role);
//		
//		List afterAddingNewUserList = loginUsers();
//		afterAddingNewUserList.add(u6);
//		Iterator<User> i=afterAddingNewUserList.iterator();
//        while(i.hasNext()){
//      	  
//      	  User test=i.next();
//      	  System.out.println(test);
//        }
//		System.out.println(afterAddingNewUserList);

//		CourseDao newCourseDao = new CourseDao();
		user.setId(System.currentTimeMillis());
		userDetails.add(user);

		logger.debug("regitering with new users " + userDetails);
		logger.info("Listing login users");
		logger.error("This is logger error");

		return userDetails;

	}

//	public void loginUser(User user) {
//		// TODO Auto-generated method stub
//		boolean flag = false;
//		userDetails.forEach(user1 -> {
//			if (user1.getUsername().equals(user1.getUsername()) && user.getPassword().equals(user1.getPassword())) {
//				flag = true;
//				LoggedInuser = user1;
//			}
//		});

//	}

}
