package JavaBasics;

public class Super_2 extends Super_1 {
	
	String a ="Atlantic city";
	
	void getString() {
		super.getString();
		System.out.println(super.a+ a);
		System.out.println(a);
	}
	
	public Super_2() {
		super();                              // super keyword will be at first line of the constructor
		System.out.println("This is child class constructor");
	}
	
	public Super_2(int a) {
		super(10);                              // super keyword will be at first line of the constructor
		System.out.println("This is child class constructor with parameter");
	}

	public static void main(String[] args) {
		Super_2 ob =new Super_2();
		ob.getString();
		
		Super_2 ob2 =new Super_2(10);

	}

}
