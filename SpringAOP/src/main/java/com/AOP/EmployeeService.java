package com.AOP;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


	public void t1() {
		System.out.println("Logging: Adding employee");
	
	}
	public void t2() {
		System.out.println("Logging: Displaying employee");
	
	}
	public void t3() {
		System.out.println("Logging: Calculating salary");
	
	}
	public void addEmp() {
		System.out.println("Employee added: Sathya");
	}
	
	public void delEmp() {
		System.out.println("Employee ID: 101 ");
	
	}
	public void t4() {
		System.out.println("Employee Salary: 25000.0 ");
	
	}
	
}