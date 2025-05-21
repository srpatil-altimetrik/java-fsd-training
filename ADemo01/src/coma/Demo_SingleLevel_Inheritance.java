package coma;

// super - base - parent
class Parent {
	int site = 5;
	String car = "Farari";
	float money = 5000000.0f;
	void use () {
		System.out.println("SITE : "+ site);
		System.out.println("CAR : "+car);
		System.out.println("MONEY : "+money);
	}
}
// sub - derived - child
class Child extends Parent{
	float money = 200000.0f;
	void use () {
		System.out.println("SITE : "+ site);
		System.out.println("CAR : "+car);
		System.out.println("MONEY : "+ money);
		System.out.println("MONEY FROM PARENT : "+ super.money);
		System.out.println("TOTAL MONEY CHILD HAVE : "+ (super.money + money));
	}
}
public class Demo_SingleLevel_Inheritance {

	public static void main(String[] args) {
		System.out.println("-----------Parent Class------------");
		Parent p = new Parent();
		p.use();
		
		System.out.println("----------Child Class---------------");
		Child c = new Child();
		c.use();

	}

}
