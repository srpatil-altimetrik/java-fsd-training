package comc;

import java.util.Scanner;
class A{
	void display(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age= sc.nextInt();
		if(age > 60 ) {
			throw new InvalidAgeException("More the 60 is not alowed ,,,!");
		}
		else if(age < 18 ) {
			throw new InvalidAgeException("less the 18 is not alowed ,,,!");
		}
		else {
			System.out.println("Age is okkay ");
		}
	}
}

public class Demo_Throw {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.display();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

class InvalidAgeException  extends RuntimeException{
	InvalidAgeException(String msg){
		super(msg);
	}
}
