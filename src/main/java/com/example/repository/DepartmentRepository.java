package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Department;
import com.example.entity.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	
}
