package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId")
	private Integer empId;

	@Column(name = "empName")
	private String empName;

	@Column(name = "mobile")
	private String mobile;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptId")
	private Department department;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "techId")
	private List<Technology> technologies;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="salaryId")
	private Salary salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, String mobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobile = mobile;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	
	
}
