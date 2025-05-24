package com.altimetrik.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@NotNull(message = "ID cannot be null")
	private int id;
	@NotNull(message = "Name cannot be null")
	@Min(message = "Name should have at least 3 characters", value = 3)
	@Max(message = "Name should have at most 20 characters", value = 20)
	private String name;
	
	@NotNull(message = "Age cannot be null")
	@Min(message = "Age should be at least 18", value = 18)
	@Max(message = "Age should be at most 60", value = 60)
	private int age;
	
	@NotNull(message = "Salary cannot be null")
	@Min(message = "Salary should be at least 10000", value = 10000)
	private double salary;
	
	@NotNull(message = "Designation cannot be null")
	@Size(min = 3, max = 20, message = "Designation should be between 3 and 20 characters")
	private String designation;
}
