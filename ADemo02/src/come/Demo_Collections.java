package come;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

interface Compnay {
	public abstract void pf();
}

abstract class Emp {
	int id, age;
	String name;
	double salary;
	String desig;

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

final class Developer extends Emp {
	Developer() {
		salary = 50000.0;
		desig = "Developer";
	}

	@Override
	void raiseSalary() {
		salary = salary + 20000;

	}
}

final class Tester extends Emp {
	Tester() {
		salary = 40000.0;
		desig = "Tester";
	}

	@Override
	void raiseSalary() {
		salary = salary + 10000;

	}
}

final class Manager extends Emp {
	Manager() {
		salary = 80000.0;
		desig = "Manager";
	}

	@Override
	void raiseSalary() {
		salary = salary + 30000;

	}
}

public class Demo_Collections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1, ch2, ch3, ch4 = 0;
		ArrayList<Emp> emp = new ArrayList<Emp>();
		do {
			System.out.println("1 ) Create ");
			System.out.println("2 ) display");
			System.out.println("3 ) Raise Salary ");
			System.out.println("4 ) Exit");
			ch1 = sc.nextInt();
			if (ch1 == 1) {
				do {
					System.out.println("1 ) CLERK  ");
					System.out.println("2 ) developer");
					System.out.println("3 ) tester  ");
					System.out.println("4 ) Manager");
					System.out.println("5 ) Exit");
					ch2 = sc.nextInt();
					if (ch2 == 1) {
						emp.add(new Clerk());
					}
					if (ch2 == 2) {
						emp.add(new Developer());
					}
					if (ch2 == 3) {
						emp.add(new Tester());
					}
					if (ch2 == 4) {
						emp.add(new Manager());
					}
				} while (ch2 != 5);
			}
			if (ch1 == 2) {
				Iterator<Emp> i = emp.iterator();
				while (i.hasNext()) {
					Emp e = (Emp) i.next();
					e.display();
				}
			}
			if (ch1 == 3) {
				Iterator<Emp> i = emp.iterator();
				while (i.hasNext()) {
					Emp e = (Emp) i.next();
					e.raiseSalary();
					System.out.println("Salary Raised....!");
				}
			}
			if (ch1 == 4) {
				System.out.println("Thank You ");
				System.exit(0);
			}
		} while (ch1 != 4);
	}
}