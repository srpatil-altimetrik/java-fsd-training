package coma;

class A {
	int a = 1000;
}

class B extends A {
	int a = 100;

	void display(int a) {
		System.out.println("Method passed variable " + a);
		System.out.println("Current class varible " + this.a);
		System.out.println("Super class variable " + super.a);
	}
}

public class Demo_This {
	public static void main(String[] args) {
		B b = new B();
		b.display(10);
	}
}
