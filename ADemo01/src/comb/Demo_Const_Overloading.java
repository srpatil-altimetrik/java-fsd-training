package comb;

class Emp {
	Emp(){
		System.out.println("Default Constuctor.......");
	}
	Emp(int a){
		System.out.println("Param Constructor........"+ a);
	}
	Emp(int a, String b){
		System.out.println("2Param Constuctor........"+ a + b);
	}
}
public class Demo_Const_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		Emp e1 = new Emp(10);
		Emp e2 = new Emp(10, "Employee");
	}

}
