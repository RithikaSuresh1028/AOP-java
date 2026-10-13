package com.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
private static ApplicationContext aop;

public static void main(String[] args) {
		
		aop = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService obj = aop.getBean(EmployeeService.class);
		obj.t1();
		obj.t2();
		obj.addEmp();
		obj.t2();
		obj.delEmp();
		obj.t3();
		obj.t4();
	}
	
}