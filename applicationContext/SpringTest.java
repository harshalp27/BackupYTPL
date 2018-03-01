package com.applicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Springs_ApplicationContext.xml");
		
		Triangle hw = (Triangle)context.getBean("triang");
		
		hw.draw();
			
		
	}

}
