package com.altimetrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.dto.Employee;
import com.altimetrik.service.EmployeeService;

@RestController
@RequestMapping("/ms2")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee.getEmpId(), employee);
	}

	@PutMapping("/updateEmployeeById/{empId}")
	public Employee updateEmployeeById(@PathVariable int empId ,@RequestBody Employee employee) {
		return employeeService.updateEmployeeById(empId, employee);
	}
}
