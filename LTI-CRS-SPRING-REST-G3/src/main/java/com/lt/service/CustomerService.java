package com.lt.service;

import com.lt.bean.Customer;

public class CustomerService implements CustomerServiceInterface{
	
	Customer customer = new Customer();
	
	public void createCustomer() {
		System.out.println("customer created");
	}
	
	public void deleteCustomer() {
		System.out.println("customer deleted");
	}
	
	public void listCustomer() {
		System.out.println("customer listed");
	}
	
	public void updateCustomer() {
		System.out.println("customer updated");
	}

}
