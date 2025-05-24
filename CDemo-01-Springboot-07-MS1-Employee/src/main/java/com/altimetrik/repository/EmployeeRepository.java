package com.altimetrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// This interface will automatically provide CRUD operations for Employee entity
	// No need to write any implementation code
	// Spring Data JPA will generate the implementation at runtime
	// You can also define custom query methods here if needed

}
