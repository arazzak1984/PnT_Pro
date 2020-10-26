package JavaBasics;

public class This_Keyword {
	
	public static int asik=50;   // Global variable
	String a ="Dada is experieced Tester";
	
	public void getAshik() {
		int asik=30;  // Local variable
		
		System.out.println(this.asik);
		
	}
	public void getA() {
		String a = "Dada is the best";
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		This_Keyword obj = new This_Keyword(); // Constructor
		obj.getAshik();
		System.out.println("=======================");
		obj.getA();
		
		
		
		
		
		
		
		

	}

}
