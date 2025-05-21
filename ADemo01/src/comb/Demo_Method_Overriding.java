package comb;

class Bank {
	void rate_Of_Interest() {
		System.out.println("Standar Rate of Interest is 10 %");
	}
}

class Axis extends Bank {
	@Override
	void rate_Of_Interest() {
		System.out.println("Standar Rate of Interest is 12 % for Axis Bank only");
	}
}

class SBI extends Bank {

}

public class Demo_Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		s.rate_Of_Interest();
		Axis a = new Axis();
		a.rate_Of_Interest();
	}

}
