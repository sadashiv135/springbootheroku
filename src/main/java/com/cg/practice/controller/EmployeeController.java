package com.cg.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.practice.entity.Employee;
import com.cg.practice.service.EmployeeService;


@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService; 
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees(){
    List<Employee> employees = employeeService.fetchAllEmployees();
	return employees;
	}
	
	@PostMapping("/save")
	public  Employee saveEmployee(@RequestBody Employee employee){
		
		Employee newEmp = employeeService.saveEmployee(employee);
	    System.out.println("Employee Saved Successfully");
		//ResponseEntity<Employee> response = new ResponseEntity<Employee>(newEmp,HttpStatus.CREATED);
		return newEmp;
		
	}
	
	@DeleteMapping("/{empid}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("empid") int empid) {
		employeeService.deleteEmployee(empid);		
		return new ResponseEntity<>("Employee Deleted Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateTrainee(@RequestBody Employee employee) {		
		employeeService.modifyEmployee(employee);	
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}	
	
	
}
