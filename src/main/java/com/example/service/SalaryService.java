package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Salary;

public interface SalaryService {
	public Optional<Salary> getSalary(Integer id);

	public List<Salary> getAllSalaries();

	public Salary saveSalary(Salary salary);

	public void deleteSalary(Integer id);
//public Salary upadteSalary(Salary salary);
}
