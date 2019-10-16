package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable Integer id) {
		return departmentService.getDepartmentById(id).get();
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments() {
		return departmentService.getDepartments();
	}
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	
}
