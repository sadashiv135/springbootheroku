package com.cg.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.practice.entity.Employee;
import com.cg.practice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
	
		
		return employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployee(int empid) {
		
		employeeRepository.deleteById(empid);
		
	}

	@Override
	public void modifyEmployee(Employee emp) {
		 
		employeeRepository.save(emp);
	}
	

	@Override
	public List<Employee> fetchAllEmployees() {
		
		return employeeRepository.findAll();
	}

	
}
