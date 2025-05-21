package com;

import java.util.Scanner;

class Clerk {
	int id, age;
	String name;
	double salary = 25000.0;
	String desig = "CLERK";

	Clerk() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter ID :  ");
		id = sc.nextInt();
		System.out.println("ENter Name :  ");
		name = sc.next();
		System.out.println("ENter Age :  ");
		age = sc.nextInt();
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

class Developer {
	int id, age;
	String name;
	double salary = 50000.0;
	String desig = "Developer";

	Developer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter ID :  ");
		id = sc.nextInt();
		System.out.println("ENter Name :  ");
		name = sc.next();
		System.out.println("ENter Age :  ");
		age = sc.nextInt();
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

class Tester {
	int id, age;
	String name;
	double salary = 40000.0;
	String desig = "Tester";

	Tester() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter ID :  ");
		id = sc.nextInt();
		System.out.println("ENter Name :  ");
		name = sc.next();
		System.out.println("ENter Age :  ");
		age = sc.nextInt();
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

class Manager {
	int id, age;
	String name;
	double salary = 80000.0;
	String desig = "Manager";

	Manager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter ID :  ");
		id = sc.nextInt();
		System.out.println("ENter Name :  ");
		name = sc.next();
		System.out.println("ENter Age :  ");
		age = sc.nextInt();
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

public class Demo_Two {
	public static void main(String[] args) {
		System.out.println("========Clerk Dertails =====");
		Clerk c = new Clerk();
		c.display();
		System.out.println("========Developer Dertails =====");
		Developer d = new Developer();
		d.display();
		System.out.println("=======Tester Dertails =====");
		Tester t = new Tester();
		t.display();
		System.out.println("=======manager  Dertails =====");
		Manager m = new Manager();
		m.display();
	}
}