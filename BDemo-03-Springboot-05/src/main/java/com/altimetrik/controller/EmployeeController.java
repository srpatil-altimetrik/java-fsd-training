package com.altimetrik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.exception.EmployeeNotFoundException;
import com.altimetrik.model.Employee;
import com.altimetrik.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("getAllEmployee")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
 
    @GetMapping("/getEmployee/{id}")
    public String getEmployeeById(@PathVariable int id) {
        Employee emp = employeeService.getEmployeeById(id);
        if (emp != null) {
            return "Employee Found: " + emp.toString();
        } else {
            throw new EmployeeNotFoundException("Employee ID (" + id + ") is not present!");
        }
    }
 
    @PostMapping("addEmployee")
    public ResponseEntity<String> addEmployee(@Valid @RequestBody Employee employee) {
        try {
            Employee savedEmployee = employeeService.addEmployee(employee);
            return new ResponseEntity<String>(
                    "Employee added successfully with ID: " + savedEmployee.getId(),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(
                    "Error occurred while adding employee: " + e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        if (employeeService.deleteEmployeeById(id)) {
            return "Employee with ID " + id + " deleted successfully!";
        } else {
            throw new EmployeeNotFoundException("Employee ID (" + id + ") is not present!");
        }
    }
 
    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        if (employeeService.updateEmployee(id, updatedEmployee)) {
            return "Employee with ID " + id + " updated successfully!";
        } else {
            throw new EmployeeNotFoundException("Employee ID (" + id + ") is not present!");
        }
    }

}
