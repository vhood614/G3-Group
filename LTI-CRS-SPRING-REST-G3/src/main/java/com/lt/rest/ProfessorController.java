/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.dao.ProfessorDao;

/**
 * @author 91988
 *
 */

//NOTE:  Inject a class referrence object and autowired on top of it.
//NOTE: REST controller ---->  Service ------>  DAO
//REST controller will look upto the service and service will look up to DAO
@RestController // this will web enable this class as request will come in the form of URL and
				// URI
@CrossOrigin // this annotation will enable the cross platform request which comes from any
				// browser
public class ProfessorController {

	@Autowired
	public ProfessorDao professorDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/professors")
	@ResponseBody
	public List readProfessorList() {
		return professorDao.getProfessorList();

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/professors/teachingcourses")
	@ResponseBody
	public List readTeachingCoursesList() {
		return professorDao.getTeachingCourses();
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/professors/enrolledStudents")
	@ResponseBody
	public List readEnrolledStudentsList() {
		return professorDao.getEnrollesStudentDetails();

	}

}
