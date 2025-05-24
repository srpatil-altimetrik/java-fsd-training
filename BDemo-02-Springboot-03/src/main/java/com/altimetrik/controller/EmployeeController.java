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

import com.altimetrik.model.Employee;
import com.altimetrik.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee added successfully.";
	}

	@GetMapping("getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("getEmployeeById/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return employeeService.getEmployeeById(empId);
	}

	@PutMapping("updateEmployeeById/{empId}")
	public String updateEmployeeById(@PathVariable int empId, @RequestBody Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(empId, employee);
		if (updatedEmployee != null) {
			return "Employee with ID " + empId + " updated successfully.";
		} else {
			return "Employee with ID " + empId + " not found.";
		}
	}

	@DeleteMapping("deleteEmployeeById/{empId}")
	public String deleteEmployeeById(@PathVariable int empId) {
		employeeService.deleteEmployeeById(empId);
		return "Employee with ID " + empId + " deleted successfully.";
	}

	@DeleteMapping("deleteAllEmployees")
	public String deleteAllEmployees() {
		employeeService.deleteAllEmployees();
		return "All employees deleted successfully.";
	}
}
