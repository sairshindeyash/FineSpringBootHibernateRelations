package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="techId")
	private Integer techId;
	
	@Column(name="techName")
	private String techName;
	
		
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empId")
	@JsonIgnore
	private Employee employee;
	
	public Technology() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + "]";
	}
	
	
}
