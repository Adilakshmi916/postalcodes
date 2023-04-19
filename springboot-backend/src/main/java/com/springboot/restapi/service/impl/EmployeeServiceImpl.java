package com.springboot.restapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.exception.ResourceNotFoundException;
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

	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
//		Optional<Employee> employee=employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//			}
//		else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		
//	using lamda expression simply we can write below logic also 	
		return employeeRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee","Id","id"));
		
			}


	@Override
	public Employee updateEmployee(Employee employee,long id) {
		//we need to check whether employee with given id is exist in DB or not
		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Employee","Id",id));
		existingEmployee.setFirstName(employee.getFirstname());
		existingEmployee.setLastname(employee.getLastname());
		existingEmployee.setEmail(employee.getEmail());
		//save existing employee to DB
		employeeRepository.save(existingEmployee);
		return existingEmployee;
		
		}


	@Override
	//return should not be used with void class type as the program
	public void deleteEmployee(long id) {
		//check whether a employee exist in a DB or not
		employeeRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee","Id",id));
		employeeRepository.deleteById(id);
	}
	}
