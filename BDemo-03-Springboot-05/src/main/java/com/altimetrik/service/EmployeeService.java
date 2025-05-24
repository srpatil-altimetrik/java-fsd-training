package com.altimetrik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.model.Employee;
import com.altimetrik.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	// Get all employees
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
 
    // Get employee by ID
    public Employee getEmployeeById(int id) {
        Optional<Employee> emp = repo.findById(id);
        return emp.orElse(null); // Return null if employee not found
    }
 
    // Add a new employee
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
 
    // Delete employee by ID
    public boolean deleteEmployeeById(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
 
    // Update employee
    public boolean updateEmployee(int id, Employee updatedEmployee) {
        if (repo.existsById(id)) {
            updatedEmployee.setId(id); // ensure the ID is set
            repo.save(updatedEmployee);
            return true;
        }
        return false;
    }
}
