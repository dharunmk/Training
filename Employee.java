package com.cognizant.training;

public class Employee {
       private String Employeeid;
       private String EmployeeName;
       private double salary;
       private Address address;
	public String getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(String employeeid) {
		Employeeid = employeeid;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
