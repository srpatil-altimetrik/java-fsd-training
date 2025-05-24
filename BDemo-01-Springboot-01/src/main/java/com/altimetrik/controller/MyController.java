package com.altimetrik.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.entity.Employee;

@RestController
public class MyController {

	ArrayList<Employee> emp = new ArrayList<>();

	public MyController() {
		emp.add(new Employee(1, "Shubham", 40000, "Java-FSD"));
		emp.add(new Employee(2, "Shashank", 30000, "Python-FSD"));
		emp.add(new Employee(3, "Mayur", 20000, "Node-FSD"));
		emp.add(new Employee(4, "Mehak", 15000, "PHP-FSD"));
	}

	@GetMapping("getAllEmployees")
	public List<Employee> getAllEmployees() {
		return emp;
	}

	@GetMapping("getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		for (Employee e : emp) {
			if (e.getEmpId() == id) {
				return e;
			}
		}
		return null;
	}

	/*
	 * @GetMapping("deleteEmployeeById/{id}") public Employee
	 * deleteEmployeeById(@PathVariable int id) { Iterator<Employee> i =
	 * emp.iterator(); while (i.hasNext()) { Employee e = i.next(); if (e.getEmpId()
	 * == id) { i.remove(); return e; } } return null; }
	 */

	@DeleteMapping("deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		Iterator<Employee> i = emp.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (e.getEmpId() == id) {
				i.remove();
				return "Employee with ID " + id + " is deleted";
			}
		}
		return "Employee with ID " + id + " is not found";
	}

	@PostMapping("addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		emp.add(employee);
		return "Employee Details Added Succesfully...";
	}

	@PutMapping("updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmp) {
		for (Employee e : emp) {
			if (e.getEmpId() == id) {
				e.setEmpName(updatedEmp.getEmpName());
				e.setEmpSalary(updatedEmp.getEmpSalary());
				e.setEmpDesig(updatedEmp.getEmpDesig());
				return "Employee updated successfully";
			}
		}
		return "Employee not found";
	}

}
