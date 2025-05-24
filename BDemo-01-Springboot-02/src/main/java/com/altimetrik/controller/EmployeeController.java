package com.altimetrik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.entity.Employee;
import com.altimetrik.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee added successfully.";
	}

	@GetMapping("getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("getEmployeeById/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return employeeRepository.findById(empId).orElse(null);
	}

	@DeleteMapping("deleteEmployeeById/{empId}")
	public String deleteEmployeeById(@PathVariable int empId) {
		employeeRepository.deleteById(empId);
		return "Employee with ID " + empId + " deleted successfully.";
	}

	@DeleteMapping("deleteAllEmployees")
	public String deleteAllEmployees() {
		employeeRepository.deleteAll();
		return "All employees deleted successfully.";
	}

	@PutMapping("updateEmployeeById/{empId}")
	public String updateEmployeeById(@PathVariable int empId, @RequestBody Employee employee) {
		Employee existingEmployee = employeeRepository.findById(empId).orElse(null);
		if (existingEmployee != null) {
			existingEmployee.setEmpName(employee.getEmpName());
			existingEmployee.setEmpAge(employee.getEmpAge());
			existingEmployee.setEmpSalary(employee.getEmpSalary());
			existingEmployee.setEmpDesignation(employee.getEmpDesignation());
			employeeRepository.save(existingEmployee);
			return "Employee with ID " + empId + " updated successfully.";
		} else {
			return "Employee with ID " + empId + " not found.";
		}
	}
}
