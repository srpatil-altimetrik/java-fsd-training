package com.altimetrik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.model.Employee;
import com.altimetrik.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int empId) {
		return employeeRepository.findById(empId).orElse(null);
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(int empId, Employee employee) {
		if (employeeRepository.existsById(empId)) {
			employee.setEmpId(empId);
			return employeeRepository.save(employee);
		}
		return null;
	}

	public void deleteEmployeeById(int empId) {
		employeeRepository.deleteById(empId);
	}

	public void deleteAllEmployees() {
		employeeRepository.deleteAll();
	}
}
