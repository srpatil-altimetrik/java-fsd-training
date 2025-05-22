package come;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Company1 {
	public abstract void pf();
}

abstract class Emp1 {
	public int id, age;
	public String name;
	public double salary;
	public String desig;

	Emp1() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter ID: ");
			id = sc.nextInt();
			System.out.print("Enter Name: ");
			name = sc.next();
			System.out.print("Enter Age: ");
			age = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data types.");
			id = 0;
			name = "Unknown";
			age = 0;
			sc.nextLine(); // clear buffer
		}
	}

	void display() {
		System.out.println("================");
		System.out.println("My ID      : " + id);
		System.out.println("My Name    : " + name);
		System.out.println("My Age     : " + age);
		System.out.println("My Salary  : " + salary);
		System.out.println("My Desig   : " + desig);
	}

	abstract void raiseSalary();
}

final class Clerk1 extends Emp1 implements Company1 {
	Clerk1() {
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
		System.out.println("Your Total Salary: " + salary);
		double pfAmount = salary * 0.10;
		salary = salary - pfAmount;
		System.out.println("Deducted PF Amount: " + pfAmount);
		System.out.println("Remaining Salary: " + salary);
	}
}

final class Developer1 extends Emp1 {
	Developer1() {
		salary = 50000.0;
		desig = "Developer";
	}

	@Override
	void raiseSalary() {
		salary = salary + 20000;
	}
}

final class Tester1 extends Emp1 {
	Tester1() {
		salary = 40000.0;
		desig = "Tester";
	}

	@Override
	void raiseSalary() {
		salary = salary + 10000;
	}
}

final class Manager1 extends Emp1 {
	Manager1() {
		salary = 80000.0;
		desig = "Manager";
	}

	@Override
	void raiseSalary() {
		salary = salary + 30000;
	}
}

public class Demo_Coll_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1 = 0, ch2;

		ArrayList<Emp1> emp = new ArrayList<>();

		while (true) {
			try {
				System.out.println("======== MENU ========");
				System.out.println("1 ) Create");
				System.out.println("2 ) Display");
				System.out.println("3 ) Raise Salary");
				System.out.println("4 ) Exit");
				System.out.print("Enter your choice: ");
				ch1 = sc.nextInt();

				switch (ch1) {
				case 1:
					do {
						System.out.println("\nSelect Role:");
						System.out.println("1 ) Clerk");
						System.out.println("2 ) Developer");
						System.out.println("3 ) Tester");
						System.out.println("4 ) Manager");
						System.out.println("5 ) Back to Main Menu");
						System.out.print("Enter your choice: ");
						ch2 = sc.nextInt();

						switch (ch2) {
						case 1:
							emp.add(new Clerk1());
							break;
						case 2:
							emp.add(new Developer1());
							break;
						case 3:
							emp.add(new Tester1());
							break;
						case 4:
							emp.add(new Manager1());
							break;
						case 5:
							break;
						default:
							System.out.println("Invalid role selection. Try again.");
						}
					} while (ch2 != 5);
					break;

				case 2:
					if (emp.isEmpty()) {
						System.out.println("No employees to display.");
					} else {
						for (Emp1 e : emp) {
							e.display();
						}
					}
					break;

				case 3:
					if (emp.isEmpty()) {
						System.out.println("No employees to update salary.");
					} else {
						for (Emp1 e : emp) {
							e.raiseSalary();
							System.out.println("Salary Raised for " + e.name + "!");
						}
					}
					break;

				case 4:
					System.out.println("Thank You!");
					sc.close();
					System.exit(0);
					break;

				default:
					System.out.println("Invalid main menu choice. Please try again.");
				}
			} catch (InputMismatchException e) {
				System.out.println("⚠️ Invalid input! Please enter numeric values only.");
				sc.nextLine(); // Clear the invalid input
			} catch (Exception e) {
				System.out.println("⚠️ Unexpected error occurred: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}