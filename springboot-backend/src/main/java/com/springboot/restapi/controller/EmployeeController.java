package com.springboot.restapi.controller;


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
import org.springframework.web.client.HttpStatusCodeException;

import com.springboot.restapi.model.Employee;
import com.springboot.restapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

//	public EmployeeController(EmployeeService employeeService) {
//		super();
//		this.employeeService = employeeService;
//	}
	//build create employee REST API
	@PostMapping(value="/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		System.out.println(employee);
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//build get all employees REST API
	@GetMapping(value="/employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	@GetMapping(value="/employee/{id}")
	public ResponseEntity<Employee>getEmployeeById(@PathVariable("id")long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
	}
	@PutMapping(value="/employee/{id}")
	public ResponseEntity<Employee>updateEmployee(@PathVariable("id")long id,
			                                       @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),HttpStatus.OK);
		
	}
	@DeleteMapping(value="/employee/{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id")long id){
		//delete employee from DB
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted successfully!.",HttpStatus.OK);
	}

}
