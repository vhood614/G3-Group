/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.dao.AdminDao;
import com.lt.exception.CourseNotFoundException;

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
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);

	@Autowired
	public AdminDao adminDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/admin/listcourse")
	@ResponseBody
	public List getCourseList() {
		logger.debug("Showing the list of course " + adminDao.showList());
		logger.info("Showing the list of course");
		logger.error("This is logger error");
		return adminDao.showList();
	}

	@ExceptionHandler
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/admin/addnewcourse")
	@ResponseBody
	public ResponseEntity addNewCourse(@RequestBody Course course) {
		logger.debug("Adding  a new course " + adminDao.addCourse());
		logger.info("adding a new course");
		logger.error("This is logger error");
		adminDao.addCourse(course);
		return new ResponseEntity(course, HttpStatus.OK);
	}

	@ExceptionHandler
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/admin/deletecourse/{id}")
	@ResponseBody
	public ResponseEntity removeCourse(@PathVariable Long id) throws CourseNotFoundException {
		if (null == adminDao.removeCourse(id)) {
			return new ResponseEntity("No course found with id" + id, HttpStatus.NOT_FOUND);
		}
		logger.debug("removing an existing course " + adminDao.showList());
		logger.info("removing the course");
		logger.error("This is logger error");
		return new ResponseEntity(id, HttpStatus.OK);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/admin/addprofessor")
	@ResponseBody
	public ResponseEntity addNewProfessor(@RequestBody Professor professor) {
		adminDao.addProfessor(professor);
		logger.debug("Adding a new professor to a " + adminDao.showList());
		logger.info("adding a new professor");
		logger.error("This is logger error");
		return new ResponseEntity(professor, HttpStatus.OK);
	}

}
