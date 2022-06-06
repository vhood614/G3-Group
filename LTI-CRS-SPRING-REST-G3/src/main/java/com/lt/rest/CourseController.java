package com.lt.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

//NOTE:  Inject a class referrence object and autowired on top of it.
//NOTE: REST controller ---->  Service ------>  DAO
//REST controller will look upto the service and service will look up to DAO
@RestController // this will web enable this class as request will come in the form of URL and
				// URI
@CrossOrigin // this annotation will enable the cross platform request which comes from any
				// browser
public class CourseController {

}
