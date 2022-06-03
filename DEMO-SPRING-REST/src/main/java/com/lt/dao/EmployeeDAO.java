package com.lt.dao;

import java.util.ArrayList;import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lt.bean.Employee;





@Repository
public class EmployeeDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<Employee> employees;
	{
		employees = new ArrayList();
		employees.add(new Employee(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		employees.add(new Employee(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		employees.add(new Employee(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
		employees.add(new Employee(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
	}

	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List list() {
		return employees;
	}

	/**
	 * Return customer object for given id from dummy database. If customer is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            customer id
	 * @return customer object for given id
	 */
	public Employee get(Long id) {

		for (Employee c : employees) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Create new customer in dummy database. Updates the id and insert new
	 * customer in list.
	 * 
	 * @param customer
	 *            Customer object
	 * @return customer object with updated id
	 */
	public Employee create(Employee employee) {
		employee.setId(System.currentTimeMillis());
		employees.add(employee);
		return employee;
	}

	/**
	 * Delete the customer object from dummy database. If customer not found for
	 * given id, returns null.
	 * 
	 * @param id
	 *            the customer id
	 * @return id of deleted customer object
	 */
	public Long delete(Long id) {

		for (Employee c : employees) {
			if (c.getId().equals(id)) {
				employees.remove(c);
				return id;
			}
		}

		return null;
	}

	/**
	 * Update the customer object for given id in dummy database. If customer
	 * not exists, returns null
	 * 
	 * @param id
	 * @param customer
	 * @return customer object with id
	 */
	public Employee update(Long id, Employee employee) {

		for (Employee c : employees) {
			if (c.getId().equals(id)) {
				employee.setId(c.getId());
				employees.remove(c);
				employees.add(employee);
				return employee;
			}
		}

		return null;
	}


}