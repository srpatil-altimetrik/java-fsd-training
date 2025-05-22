package comc;

import java.util.Scanner;

public class Demo_Exception {
	static void m1() {
		m2();
		System.out.println("M1 Method.............");
	}

	static void m2() {
		m3();
		System.out.println("M2 Method.............");
	}

	static void m3() {
		try {
			System.out.println("M3 Method..........");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A : ");
			int a = sc.nextInt();

			System.out.println("Enter B : ");
			int b = sc.nextInt();

			int c = a / b;

			System.out.println("Result " + c);
		} catch (ArithmeticException ae) {
			System.out.println("Hi boss we can't devide anything by zero....");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
