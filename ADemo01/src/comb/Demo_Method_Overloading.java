package comb;

class AreaCal {
	
	void area(){
		System.out.println("Default Area");
	}
	void area(int r) {
		System.out.println("Area of Circle : " + (2 * 3.17 * r * r));
	}

	void area(int l, int b) {
		System.out.println("Area of Rectangle : " + (l * b));
	}
	
}

public class Demo_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCal ac = new AreaCal();
		ac.area();
		ac.area(13);
		ac.area(12, 10);
	}

}
