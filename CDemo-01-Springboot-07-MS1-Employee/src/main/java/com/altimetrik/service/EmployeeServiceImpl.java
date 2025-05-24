package com.altimetrik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.altimetrik.model.Employee;
import com.altimetrik.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpId(employee.getEmpId());
		emp.setEmpName(employee.getEmpName());
		emp.setEmpSalary(employee.getEmpSalary());
		emp.setEmpDesignation(employee.getEmpDesignation());
		employeeRepository.save(emp);
	}

	@Override
	public Optional<Employee> getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(empId);
		if (emp.isPresent()) {
			return emp;
		} else {
			return Optional.empty();
		}
	}

	@Override
	public void updateEmployeById(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.findById(employee.getEmpId()).orElse(null);
		System.out.println("emp: " + emp);
		if (emp != null) {
			emp.setEmpName(employee.getEmpName());
			emp.setEmpSalary(employee.getEmpSalary());
			emp.setEmpDesignation(employee.getEmpDesignation());
			employeeRepository.save(emp);
		}
	}

	@Override
	public void deleteEmployeeById(@PathVariable int empId) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.findById(empId).orElse(null);
		if (emp != null) {
			employeeRepository.delete(emp);
		}
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = employeeRepository.findAll();
		if (empList != null) {
			employeeRepository.deleteAll(empList);
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub>
		List<Employee> empList = employeeRepository.findAll();
		if (empList.isEmpty()) {
			return null;
		} else {
			return empList;
		}
	}

}
