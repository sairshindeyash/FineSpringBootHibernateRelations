package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Employee;
import com.example.entity.Salary;
import com.example.entity.Technology;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	
	public Optional<Employee> getEmployeeById(Integer id);

	public Employee saveEmployee(Employee employee);

	public void deleteEmployee(Integer id);
	
	public List<Employee>  getAllEmployeesInADepartment(Integer id);

	public Salary getSalary(Integer id);
	
	public List<Technology> getAllTechnologiesOfAnEmployee(Integer id);
	
	
}
