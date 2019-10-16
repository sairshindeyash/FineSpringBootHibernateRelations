package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Salary;
import com.example.repository.SalaryRepository;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	private SalaryRepository salaryRepository;
	
	@Override
	public Optional<Salary> getSalary(Integer id) {
		return salaryRepository.findById(id);
	}

	@Override
	public List<Salary> getAllSalaries() {
		return salaryRepository.findAll();
	}

	@Override
	public Salary saveSalary(Salary salary) {
		return salaryRepository.save(salary);
	}

	@Override
	public void deleteSalary(Integer id) {
		salaryRepository.deleteById(id);
		
	}

	/*
	 * @Override public Salary upadteSalary(Salary salary) { return
	 * salaryRepository.save(salary); }
	 */
}
