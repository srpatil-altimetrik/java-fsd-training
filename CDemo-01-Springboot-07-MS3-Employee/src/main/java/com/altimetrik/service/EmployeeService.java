package com.altimetrik.service;

import com.altimetrik.dto.Employee;

public interface EmployeeService {
	public Employee updateEmployeeById(int empId, Employee employee);

	public Employee addEmployee(int empId, Employee employee);
}
