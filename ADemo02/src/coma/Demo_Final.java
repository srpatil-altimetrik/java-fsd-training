package coma;

class Car

{

	final int speed = 200;

	public final void gare() {

		System.out.println("5 gare.. car !");

	}

}

class Bmw extends Car { // we can't inherit
	/*
	 * @Override public void gare() { // we can't override
	 * System.out.println("Auto gare car...! !"); }
	 */

}

class Benz extends Car {

}

public class Demo_Final {

	public static void main(String[] args) {

		Bmw b = new Bmw();

		System.out.println(b.speed);

//		b.speed = 2000; // we cant re assign

		System.out.println(b.speed);

	}

}

// var : we cant re assign 

// methods : we cant over ride 

// class we can inherite
