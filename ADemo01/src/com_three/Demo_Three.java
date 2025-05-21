package com_three;

import java.util.Scanner;
class Emp
{
	int id ,age;
	String name ; 
	double salary;
	String desig; 
	Emp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter ID :  "); id =sc.nextInt();
		System.out.println("ENter Name :  "); name =sc.next();
		System.out.println("ENter Age :  "); age =sc.nextInt();
	}
	void display() {
		System.out.println("================");
		System.out.println("My ID  is  : "+ id );
		System.out.println("My Name is  : "+ name );
		System.out.println("My Age :"+ age );
		System.out.println("My Salary is : "+salary);
		System.out.println("My Desig is : "+desig);
	}
}
class Clerk  extends Emp
{
	Clerk(){	
		 salary =25000.0;
		 desig="CLERK";
	}
}
class Developer extends Emp
{ 	
	Developer(){
		 salary =50000.0;
		 desig="Developer";
	}
}
class Tester extends Emp
{
	Tester(){
		 salary =40000.0;
		 desig="Tester";
	}
}
class Manager extends Emp
{
	Manager(){
		 salary =80000.0;
		 desig="Manager";
	}
}
public class Demo_Three {
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
