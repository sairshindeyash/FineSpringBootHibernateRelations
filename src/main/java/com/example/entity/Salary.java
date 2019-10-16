package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "salaryId")
	private Integer salaryId;

	@Column(name = "da")
	private double da;

	@Column(name = "ta")
	private double ta;

	@Column(name = "hra")
	private double hra;

	@Column(name = "basic")
	private double basic;

	

	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	

	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", da=" + da + ", ta=" + ta + ", hra=" + hra + ", basic=" + basic + "]";
	}

}
