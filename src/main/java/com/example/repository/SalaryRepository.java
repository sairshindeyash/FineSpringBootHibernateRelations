package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer>{

}
