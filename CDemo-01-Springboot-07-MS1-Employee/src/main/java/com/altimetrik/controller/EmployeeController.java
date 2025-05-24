package com.altimetrik.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.model.Employee;
import com.altimetrik.service.EmployeeService;

@RestController
@RequestMapping("/ms1")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/getEmployeeById/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable int empId) {
		return employeeService.getEmployeeById(empId);
	}

	@PutMapping("/updateEmployeeById/{empId}")
	public void updateEmployeeById(@RequestBody Employee employee) {
		employeeService.updateEmployeById(employee);
	}

	@DeleteMapping("/deleteEmployeeById/{empId}")
	public void deleteEmployeeById(@PathVariable int empId) {
		employeeService.deleteEmployeeById(empId);
	}

	@DeleteMapping("/deleteAllEmployees")
	public void deleteAllEmployees() {
		employeeService.deleteAllEmployees();
	}

}
