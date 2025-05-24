package com.altimetrik.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Employee {
	@Id
	private int empId;
	
	private String empName;
	
	private int empAge;
	
	private int empSalary;
	
	private String empDesignation;
}
