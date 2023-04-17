package com.springboot.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.model.Employee;
import com.springboot.restapi.repository.EmployeeRepository;
import com.springboot.restapi.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService  {
//we need to inject dependencies
	//1.setter-based dependency injection
	//2.constructor-based dependency injection
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//	super();
//	this.employeeRepository = employeeRepository;
//}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
