package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
import com.example.entity.Salary;
import com.example.entity.Technology;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e  left outer join Department d on d.deptId = e.department.deptId where d.deptId=:id")
	public List<Employee> findByDepartmentId(@Param(value = "id") Integer id);

//	@Query("select s from Salary s left outer join Employee e on s.salaryId=e.salary.salaryId where e.empId=:id")
//	public Salary findSalaryById(@Param(value = "id") Integer id);

	@Query("select s from Salary s left outer join Employee e on s.salaryId=e.salary.salaryId where e.empId=:id")
	public Salary findSalaryById(@Param(value = "id") Integer id);
	
//	select * from technology left outer join employee on technology.emp_id=employee.emp_id where employee.emp_id=2;
	
	@Query("select t from Technology t left outer join Employee e on t.employee.empId=e.empId where e.empId=:id")
	public List<Technology> getAllTechnologiesOfAnEmployee(@Param(value = "id")Integer id);
	
}
