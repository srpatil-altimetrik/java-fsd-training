package coma;

class A {
	static int x = 100;

	static void abc() {
		System.out.println("Static Method");
	}
}

public class Demo_Static {
	public static void main(String[] args) {
//		A a = new A();
		A.abc();
		System.out.println(A.x);
		System.out.println("Hi Welcome to Java");
	}
}