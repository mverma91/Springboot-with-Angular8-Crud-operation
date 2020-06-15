package com.employeDetails.application.model;

import java.io.Serializable;

public class EmployeePojo implements Serializable {
	
     public String	ID;
	public String Name;
	public String Salary;
	public String Department;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
