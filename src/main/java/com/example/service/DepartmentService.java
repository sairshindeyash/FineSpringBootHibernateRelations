package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Department;
import com.example.entity.Employee;

public interface DepartmentService {
	
	public Optional<Department> getDepartmentById(Integer id);

//	public void deleteEmployeeById(Integer id);

	public List<Department> getDepartments();

	public Department saveDepartment(Department department);
	
	
	

}
