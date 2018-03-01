package com.hashal.dinesh;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class Client {

	public static void main(String[] args) {

		//Spring Way | IOC (Inversion of Control)
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = (Employee)context.getBean("emp2", Employee.class);
	
		System.out.println("Employee Details: \n" +  e1);
		System.out.println("Employee Details: \n" +  e2);
	}

}
