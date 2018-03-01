package com.BeanInheritance1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringsBeanInheritance1.xml");
		Employee emp = (Employee)context.getBean("employeebean");
		System.out.println(emp);
	}

}
