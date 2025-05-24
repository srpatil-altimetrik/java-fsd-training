package com.altimetrik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		Resource r = new ClassPathResource("ApplicationContext.xml");
//		BeanFactory bf = new XmlBeanFactory(r);
//		Employee emp = (Employee) bf.getBean("empBean");

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = (Employee) context.getBean("empBean");

		System.out.println(emp);
		emp.display();

		System.out.println("=============Array============");
		String hb[] = emp.getHobies();
		for (String hobies : hb) {
			System.out.print("Employee Hobies : " + hobies);
		}

		System.out.println();

		System.out.println("=============ArrayList=============");
		ArrayList al = emp.getCourses();
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.print("Employee Tech : " + i.next() + " ");
		}

		System.out.println();

		System.out.println("=============HashSet=============");
		HashSet hs = emp.getEmails();
		Iterator i1 = hs.iterator();
		while (i1.hasNext()) {
			System.out.print("Employee Emails : " + i1.next() + " ");
		}

	}
}
