package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Compnay {
	public abstract void pf();
	// public abstract void attandence();
}

abstract class Emp {
	public int id, age;
	public String name;
	public double salary;
	public String desig;

	Emp() {
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

	abstract void raiseSalary();
}

final class Clerk extends Emp implements Compnay {
	Clerk() {
		salary = 25000.0;
		desig = "CLERK";
	}

	@Override
	void raiseSalary() {
		salary = salary + 5000;
	}

	@Override
	public void pf() {
		System.out.println("PF deduction successful.");
		System.out.println("Your TOtal  Salary " + salary);
		double pfAmount = salary * 0.10; // Calculate 10% PF
		salary = salary - pfAmount; // Deduct PF from salary
		System.out.println("Deducted PF Amount: " + pfAmount);
		System.out.println("Remaining Salary: " + salary);
	}

}

final class Developer extends Emp implements Compnay {
	Developer() {
		salary = 50000.0;
		desig = "Developer";
	}

	@Override
	void raiseSalary() {
		salary = salary + 20000;
	}

	@Override
	public void pf() {
		System.out.println("PF deduction successful.");
		System.out.println("Your TOtal  Salary " + salary);
		double pfAmount = salary * 0.12; // Calculate 10% PF
		salary = salary - pfAmount; // Deduct PF from salary
		System.out.println("Deducted PF Amount: " + pfAmount);
		System.out.println("Remaining Salary: " + salary);
	}
}

final class Tester extends Emp implements Compnay {
	Tester() {
		salary = 40000.0;
		desig = "Tester";
	}

	@Override
	void raiseSalary() {
		salary = salary + 10000;
	}

	@Override
	public void pf() {
		System.out.println("PF deduction successful.");
		System.out.println("Your TOtal  Salary " + salary);
		double pfAmount = salary * 0.14; // Calculate 10% PF
		salary = salary - pfAmount; // Deduct PF from salary
		System.out.println("Deducted PF Amount: " + pfAmount);
		System.out.println("Remaining Salary: " + salary);
	}
}

final class Manager extends Emp implements Compnay {
	Manager() {
		salary = 80000.0;
		desig = "Manager";
	}

	@Override
	void raiseSalary() {
		salary = salary + 30000;
	}

	@Override
	public void pf() {
		System.out.println("PF deduction successful.");
		System.out.println("Your TOtal  Salary " + salary);
		double pfAmount = salary * 0.14; // Calculate 10% PF
		salary = salary - pfAmount; // Deduct PF from salary
		System.out.println("Deducted PF Amount: " + pfAmount);
		System.out.println("Remaining Salary: " + salary);
	}
}

public class Emp_P {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1, ch2;
		HashMap<Integer, Emp> emp = new HashMap<>();

		do {
			System.out.println("\n1 ) Create ");
			System.out.println("2 ) Display");
			System.out.println("3 ) Raise Salary ");
			System.out.println("4 ) Exit");
			ch1 = sc.nextInt();

			if (ch1 == 1) {
				do {
					System.out.println("1 ) CLERK");
					System.out.println("2 ) DEVELOPER");
					System.out.println("3 ) TESTER");
					System.out.println("4 ) MANAGER");
					System.out.println("5 ) Exit");
					ch2 = sc.nextInt();

					Emp e = null;
					if (ch2 == 1)
						e = new Clerk();
					if (ch2 == 2)
						e = new Developer();
					if (ch2 == 3)
						e = new Tester();
					if (ch2 == 4)
						e = new Manager();

					if (e != null) {
						emp.put(e.id, e);
						System.out.println("Employee Added with ID: " + e.id);
					}

				} while (ch2 != 5);
			}

			if (ch1 == 2) {
				for (Map.Entry<Integer, Emp> entry : emp.entrySet()) {
					entry.getValue().display();
				}
			}

			if (ch1 == 3) {
				for (Map.Entry<Integer, Emp> entry : emp.entrySet()) {
					entry.getValue().raiseSalary();
					System.out.println("Salary Raised for ID: " + entry.getKey());
				}
			}

			if (ch1 == 4) {
				System.out.println("Thank You ");
				System.exit(0);
			}
		} while (ch1 != 4);
	}
}
