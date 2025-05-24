package com.altimetrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// No need to write any code here, JpaRepository provides all the CRUD operations
	// and other methods like findAll, findById, save, deleteById, etc.
	// You can also define custom query methods if needed.
}
