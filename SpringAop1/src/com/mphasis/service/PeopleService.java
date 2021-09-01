package com.mphasis.service;

import com.mphasis.model.Customer;
import com.mphasis.model.Employee;

public class PeopleService {

	private Customer customer;
	private Employee employee;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
