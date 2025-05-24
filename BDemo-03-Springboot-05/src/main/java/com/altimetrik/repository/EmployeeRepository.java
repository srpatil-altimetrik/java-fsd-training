package com.altimetrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository< Employee, Integer> {
	// This interface will automatically provide CRUD operations for the Employee entity
	// No need to implement any methods, Spring Data JPA will handle it
	// You can add custom query methods if needed
}
