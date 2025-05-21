package comd;

class A {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Demo_Encapsulation {

	public static void main(String[] args) {
		A a = new A();
		a.setId(63);
		a.setName("Shubham");
		System.out.println("Employee ID : "+a.getId()+ " Employee Name : "+ a.getName());
	}
}
