package com;

import java.util.Scanner;

abstract class Emp
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
	abstract void raiseSalary();
}
class Clerk  extends Emp
{
	Clerk(){	
		 salary =25000.0;
		 desig="CLERK";
	}

	@Override
	void raiseSalary() {
	salary= salary+ 5000;
		
	}
}
class Developer extends Emp
{ 	
	Developer(){
		 salary =50000.0;
		 desig="Developer";
	}

	@Override
	void raiseSalary() {
	salary = salary+ 20000;
		
	}
}
class Tester extends Emp
{
	Tester(){
		 salary =40000.0;
		 desig="Tester";
	}

	@Override
	void raiseSalary() {
		salary= salary + 10000;
		
	}
}
class Manager extends Emp
{
	Manager(){
		 salary =80000.0;
		 desig="Manager";
	}

	@Override
	void raiseSalary() {
		salary = salary+ 30000;
		
	}
}
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1,ch2,ch3,ch4=0;
		Clerk c = null;
		Developer d = null;
		Manager m = null;
		Tester t = null;
		do {
			System.out.println("1 ) Create ");
			System.out.println("2 ) display");
			System.out.println("3 ) Raise Salary ");
			System.out.println("4 ) Exit");
			ch1=sc.nextInt();
			if(ch1==1)
			{
					do {
						System.out.println("1 ) CLERK  ");
						System.out.println("2 ) developer");
						System.out.println("3 ) tester  ");
						System.out.println("4 ) Manager");
						System.out.println("5 ) Exit");
						ch2=sc.nextInt();
						if(ch2==1) {  c= new Clerk();}
						if(ch2==2) {  d = new Developer();}
						if(ch2==3) {  t = new Tester();}
						if(ch2==4) {  m = new Manager();}
					} while (ch2!=5);
			}
			if(ch1==2)
			{
				do {
					System.out.println("1 ) CLERK  ");
					System.out.println("2 ) developer");
					System.out.println("3 ) tester  ");
					System.out.println("4 ) Manager");
					System.out.println("5 ) Exit");
					ch3=sc.nextInt();
					if(ch3==1) {
						if(c!=null) {
							 c.display();
						}
						else {
							System.out.println("No Clerk are in the company ");
						}
					}
					if(ch3==2) { d.display();}
					if(ch3==3) { t.display();}
					if(ch3==4) { m.display();}
				} while (ch3!=5);
			}
			if(ch1==3)
			{
				System.out.println("TO Whom u want to Raise  sALARY ");
				do {
					System.out.println("1 ) CLERK  ");
					System.out.println("2 ) developer");
					System.out.println("3 ) tester  ");
					System.out.println("4 ) Manager");
					System.out.println("5 ) Exit");
					ch4=sc.nextInt();
					if(ch4==1) { 
						c.raiseSalary();
						System.out.println("Clerk Salary Raised ....!");
					}
					if(ch4==2) { 
						d.raiseSalary();
					System.out.println("Developer  Salary Raised ....!");}
					
					if(ch4==3) { t.raiseSalary();}
					if(ch4==4) { m.raiseSalary();}
				} while (ch4!=5);
			}
			if(ch1==4)
			{
				System.out.println("Thank You ");
				System.exit(0);
			}	
		} while (ch1!=3);
	}
}
