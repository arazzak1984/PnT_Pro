package JavaBasics;

public class Use_This {
	
	int a=50;
	int b= 60;
	
	
	public int sum() {
		int c=this.a+this.b;
		System.out.println(c);
		return c;
		
	}

	public static void main(String[] args) {
		Use_This ob = new Use_This();
		ob.sum();
		
		

	}

}
