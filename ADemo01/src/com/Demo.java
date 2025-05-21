package com;

import java.util.Scanner;

class A {
	int id;
	String name;
	int age;
	float salary;
	String desig;

	A() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter ID :  ");
		id = sc.nextInt();

		System.out.println("ENter Name :  ");
		name = sc.next();

		System.out.println("ENter Age :  ");
		age = sc.nextInt();

		System.out.println("ENter Salary :  ");
		salary = sc.nextFloat();

		System.out.println("ENter Desig :  ");
		desig = sc.next();
	}

	void display() {
		System.out.println("================");

		System.out.println("My ID  is  : " + id);

		System.out.println("My Name is  : " + name);

		System.out.println("My Age :" + age);

		System.out.println("My Salary is : " + salary);

		System.out.println("My Desig is : " + desig);
	}
}

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello, Welcome to Java ");

		A a = new A();
		a.display();
		a.display();
	}
}
