package JavaBasics;

public class Demo_Method {
	static int s = 78;
	
	public static void main(String[] args) {
		Demo_Method object = new Demo_Method();
		System.out.println("Hello WORLD");
		object.dedarBhai();
		ashikBhai();

		System.out.println("this is static variable " +s);
		Variables_Java ob = new Variables_Java();
		ob.y=89;	
	} 
	public  void dedarBhai() {
		String s = "he is learnig selenium";
		System.out.println(s);
		System.out.println("he is learnig API Testing");	
	}
	static void ashikBhai() {
		System.out.println(" He is the boss");	
	}
	void addition (int a, int b) {
		a=5;
		b=6;
		int c = a+b;
	}
	
	public Demo_Method() {
		
		System.out.println("This is came from constractor");
	}
	
	
	

}
