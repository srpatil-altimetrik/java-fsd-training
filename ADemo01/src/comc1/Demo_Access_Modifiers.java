package comc1;

public class Demo_Access_Modifiers {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

class B extends Demo_Access_Modifiers {
	void display() {
		System.out.println(a);
//		System.out.println(b); Only for class
		System.out.println(c);
		System.out.println(d);
	}
}

class C {
	Demo_Access_Modifiers dam = new Demo_Access_Modifiers();

	void display() {
		System.out.println(dam.a);
//		System.out.println(dam.b); Only for the class
		System.out.println(dam.c);
		System.out.println(dam.d);
	}
}