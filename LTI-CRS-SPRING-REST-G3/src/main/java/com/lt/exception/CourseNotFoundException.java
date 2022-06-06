package com.lt.exception;

public class CourseNotFoundException  extends Exception{
	
	public  CourseNotFoundException(String errorMessage) {
		super (errorMessage);
	}

}
