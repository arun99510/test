package com.nit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class EmpModel {

	@Id
	@GeneratedValue
	private Integer regNo;
	private String  empName;
	private String empCity;
	private Double empSal;
	public Integer getRegNo() {
		return regNo;
	}
	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public EmpModel(Integer regNo, String empName, String empCity, Double empSal) {
		super();
		this.regNo = regNo;
		this.empName = empName;
		this.empCity = empCity;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "EmpModel [regNo=" + regNo + ", empName=" + empName + ", empCity=" + empCity + ", empSal=" + empSal
				+ "]";
	}
	public EmpModel() {
		super();
	}
	
}
