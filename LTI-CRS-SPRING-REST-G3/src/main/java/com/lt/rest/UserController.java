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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.User;
import com.lt.dao.AdminDao;
import com.lt.dao.UserDao;

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
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);
	
	@Autowired
	public UserDao userDao;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/user/userslist")
	@ResponseBody
	public List showUsersList() {
//		logger.debug("Showing the list of users " + userDao.loginUsers());
		logger.info("Showing the list of users");
		logger.error("This is logger error");
		return userDao.loginUsers();
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/user/registeruser")
	@ResponseBody
	public ResponseEntity registerUser(@RequestBody User user) {
		
		logger.debug("Registering new user " + userDao.loginUsers());
		logger.info("Registering new user");
		logger.error("This is logger error");
		
		userDao.createRegistrationScreen(user);
		return new ResponseEntity(user,  HttpStatus.OK);		
	}
	
//	public ResponseEntity loginUser(@RequestBody User user) {
//		UserDao.loginUser(user);
		
//	}

	
}
