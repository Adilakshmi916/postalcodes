package com.springboot.restapi.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.springboot.restapi.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
     Employee getEmployeeById(long id);
     Employee updateEmployee(Employee employee,long id);
     void deleteEmployee(long id);

}
