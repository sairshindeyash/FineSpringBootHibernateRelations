package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Salary;
import com.example.service.SalaryService;

@RestController
public class SalaryController {

	@Autowired
	private SalaryService salaryService;
	
	@GetMapping("/salary/{id}")
	public Salary getsalary(@PathVariable Integer id) {
		return salaryService.getSalary(id).get();
	}
	
	@GetMapping("/salarees")
	public List<Salary> getSalaries() {
		return salaryService.getAllSalaries();
	}
	
	@PostMapping("/salary/add")
	public Salary saveSalary(@RequestBody Salary salary) {
		return salaryService.saveSalary(salary);
	}
	
	@DeleteMapping("/salary/del/{id}")
	public String deleteSalary(@PathVariable Integer id) {
		salaryService.deleteSalary(id);
		return "salary deleted" + id;
	}
	
	
	@PutMapping("/salary/update/{id}")
	public Salary updateSalary(@RequestBody Salary salary,@PathVariable Integer id) {
		Salary salary2=salaryService.getSalary(id).get();
		salary.setSalaryId(salary2.getSalaryId());
		Salary sal=salaryService.saveSalary(salary);
		return sal;
	}
}
