package com.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class LoginAspect {

	@Before("execution(* com.Aop.*.*(..))")
	public void log() {
		System.out.println("Loggin: Adding Employee");
	}
	

	
	@After("execution(* com.Aop.*.*(..))")
	public void log2() {
		System.out.println("Logging: Displaying employee");
	}
	public void log3() {
		System.out.println("Employee ID: 101");
		System.out.println("Employee Name: Sathya");
	}
	public void log5() {
		System.out.println("Logging: Calculating salary");
		System.out.println("Employee Salary: 25000.0");
	}
	
}