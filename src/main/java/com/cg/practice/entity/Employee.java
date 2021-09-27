package com.cg.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "sampleemp")
public class Employee {

	@Id
	private int empid;
	private String empname;
	private String empdomain;

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdomain() {
		return empdomain;
	}
	public void setEmpdomain(String empdomain) {
		this.empdomain = empdomain;
	}
		
}
