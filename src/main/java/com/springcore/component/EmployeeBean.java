package com.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// EmployeeBean is a Spring-managed component
@Component
public class EmployeeBean {
	// Property for employee name
	private String employeeName = "Ajeet Raj";

	// Dependency injection of DepartmentBean
	@Autowired
	private DepartmentBean department;

	// Method to display employee and department details
	public void displayEmployeeDetails() {
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Department: " + department.getDepartmentName());
	}
}