package com.altimetrik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.altimetrik.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	RestTemplate restTemplate;
	
	final String URL_UPDATE = "http://localhost:8081/ms1/updateEmployeeById/{empId}";
	final String URL_ADD = "http://localhost:8081/ms1/addEmployee";
	
	@Override
	public Employee updateEmployeeById(int empId, Employee employee) {
		// TODO Auto-generated method stub
		restTemplate.put(URL_UPDATE, employee, Employee.class, empId);
		return employee;
	}

	@Override
	public Employee addEmployee(int empId, Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = restTemplate.postForObject(URL_ADD, employee, Employee.class);
		return emp;
	}

}
