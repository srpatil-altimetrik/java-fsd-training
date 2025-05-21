package com_task;

import java.util.Scanner;

class Emp {
	int id, age;
	String name;
	double salary;
	String desig;

	Emp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID :  ");
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

class Clerk extends Emp {
	Clerk() {
		salary = 25000.0;
		desig = "Clerk";
	}
}

class Developer extends Emp {
	Developer() {
		salary = 50000.0;
		desig = "Developer";
	}
}

class Tester extends Emp {
	Tester() {
		salary = 40000.0;
		desig = "Tester";
	}
}

class Manager extends Emp {
	Manager() {
		salary = 80000.0;
		desig = "Manager";
	}
}

public class Demo_Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1 = 0, ch2 = 0, ch3=0;
		Clerk c = null;
		Developer d = null;
		Tester t = null;
		Manager m = null;
		do {
			System.out.println("1) Create ");
			System.out.println("2) Display ");
			System.out.println("3) Exit ");
			ch1 = sc.nextInt();
			if (ch1 == 1) {
				do {
					System.out.println("1) Clerk ");
					System.out.println("2) Developer ");
					System.out.println("3) Tester ");
					System.out.println("4) Manager ");
					System.out.println("5) Exit ");
					ch2 = sc.nextInt();

					if (ch2 == 1) {
						c = new Clerk();
					}
					if (ch2 == 2) {
						d = new Developer();
					}
					if (ch2 == 3) {
						t = new Tester();
					}
					if (ch2 == 4) {
						m = new Manager();
					}
				} while (ch2 != 5);
			}
			if (ch1 == 2) {
				do {
					
					System.out.println("1) Clerk Details");
					System.out.println("2) Developer Details");
					System.out.println("3) Tester Details ");
					System.out.println("4) Manager Details");
					System.out.println("5) Exit");
					ch3 = sc.nextInt();
					if(ch3 == 1) {
						c.display();
					}
					if(ch3==2) {
						d.display();
					}
					if(ch3== 3) {
						t.display();
					}
					if(ch3==4) {
						m.display();
					}
					
				} while (ch3 !=5);
			}
			
			if (ch1 == 3) {
				System.out.println("Thank you");
				System.exit(0);
			}
			
		} while (ch1 != 3);
	}

}
