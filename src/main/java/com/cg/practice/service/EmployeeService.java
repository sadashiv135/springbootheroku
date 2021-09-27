package com.cg.practice.service;

import java.util.List;
import java.util.Optional;

import com.cg.practice.entity.Employee;

public interface EmployeeService {

public Employee saveEmployee(Employee emp);
	
	public void deleteEmployee(int empid);
	
	public void modifyEmployee(Employee emp);
	
	//public Optional<Employee> fetchEmployeeById(int empid);
	
	public List<Employee> fetchAllEmployees();
}
