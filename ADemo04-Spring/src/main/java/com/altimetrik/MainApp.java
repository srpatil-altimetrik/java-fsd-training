package com.altimetrik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		Resource r = new ClassPathResource("ApplicationContext.xml");
//		BeanFactory bf = new XmlBeanFactory(r);
//
//		Employee emp = (Employee) bf.getBean("empBean");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp=(Employee)context.getBean("empBean");
		
		System.out.println(emp);
		emp.display();
	}
}
