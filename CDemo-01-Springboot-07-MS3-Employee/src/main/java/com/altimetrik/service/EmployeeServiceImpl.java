package com.altimetrik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.altimetrik.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	WebClient webClient;

	final String URL_UPDATE = "http://localhost:8081/ms1/updateEmployeeById/{empId}";
	final String URL_ADD = "http://localhost:8081/ms1/addEmployee";

	@Override
	public Employee updateEmployeeById(int empId, Employee employee) {
		// TODO Auto-generated method stub
		webClient.put().uri(URL_UPDATE, empId).bodyValue(employee).retrieve().bodyToMono(Employee.class).block();
		return employee;
	}

	@Override
	public Employee addEmployee(int empId, Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = webClient.post().uri(URL_ADD).bodyValue(employee).retrieve().bodyToMono(Employee.class).block();
		return emp;
	}

}
