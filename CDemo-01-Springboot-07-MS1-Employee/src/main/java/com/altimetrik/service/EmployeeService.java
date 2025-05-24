package com.altimetrik.service;

import java.util.List;
import java.util.Optional;

import com.altimetrik.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployeeById(int empId);
	public void deleteAllEmployees();
	public Optional<Employee> getEmployeeById(int empId);
	void updateEmployeById(Employee employee);
	

}
