package com.BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringsBeanInheritance.xml");
		Customer cust = (Customer)context.getBean("specialCust");
		System.out.println(cust);
	}

}
