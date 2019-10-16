package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Optional<Department> getDepartmentById(Integer id) {
		return departmentRepository.findById(id);
	}

	/*
	 * @Override public void deleteEmployeeById(Integer id) {
	 * departmentRepository.deleteById(id); }
	 */

	
	@Override
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	
	
	

}
