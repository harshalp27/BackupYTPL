package com.dinesh.onjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Springs.xml");
		
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		
		System.err.println(hw.getMessage());
			
		
	}

}
