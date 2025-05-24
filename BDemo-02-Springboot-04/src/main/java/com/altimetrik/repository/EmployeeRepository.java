package com.altimetrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// This interface will automatically provide CRUD operations for Employee entity
	// using Spring Data JPA

}
