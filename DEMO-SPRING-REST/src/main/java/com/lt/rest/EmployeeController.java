/**
 * 
 */
package com.lt.rest;

import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Employee;
import com.lt.dao.EmployeeDAO;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 91988
 *
 */

//NOTE:  Inject a class referrence object and autowired on top of it.
// NOTE: REST controller ---->  Service ------>  DAO
//REST controller will look upto the service and service will look up to DAO
@RestController // this will web enable this class as request will come in the form of URL and
				// URI
@CrossOrigin // this annotation will enable the cross platform request which comes from any
				// browser
public class EmployeeController {
	// using the autowired we need to add the injection inside the REST controller
	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/employees")
	@ResponseBody
	public List getEmloyees() {

		return employeeDAO.list();
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/employees/{id}")
	@ResponseBody
	public ResponseEntity getEmployee(@PathVariable("id") Long id) {

		Employee employee = employeeDAO.get(id);
		if (employee == null) {
			return new ResponseEntity("No employee found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(employee, HttpStatus.OK);
	}

//	@PostMapping(value = "/post/employees")
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/employees")
	@ResponseBody
	public ResponseEntity createEmployee(@RequestBody Employee employee) {

		employeeDAO.create(employee);

		return new ResponseEntity(employee, HttpStatus.OK);
	}

//	@DeleteMapping("/delete/employees/{id}")
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/employees/{id}")
	@ResponseBody
	public ResponseEntity deleteEmployee(@PathVariable Long id) {

		if (null == employeeDAO.delete(id)) {
			return new ResponseEntity("No Employee found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}

//	@PutMapping("/put/employees/{id}")
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.PUT, value = "/put/employees/{id}")
	@ResponseBody
	public ResponseEntity updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {

		employee = employeeDAO.update(id, employee);

		if (null == employee) {
			return new ResponseEntity("No employee found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(employee, HttpStatus.OK);
	}

}
