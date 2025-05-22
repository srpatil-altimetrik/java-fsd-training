package com.JunitTest;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(300, 400));
		System.out.println(cal.sub(500, 200));
	}
}
