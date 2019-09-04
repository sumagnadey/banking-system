package com.employee;

public class Employee {
	private String name;
	private String designation;
	private double exp;
	private double salary;
	public Employee(String name, String designation, double exp, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.exp = exp;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getExp() {
		return exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
