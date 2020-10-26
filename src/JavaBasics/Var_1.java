package JavaBasics;

public class Var_1 {

	public static int a =5;
	public static int b =6;
	
	private static int d=3;
	private static int e=4;
	
	protected static int g=5;
	protected static int h=8;
	
	int k =11;
	int m =12;
	
	
	public static void main(String[] args) {
		
     int c =a+b;
     System.out.println("This is Use of public modifier & Global_Var addtion: "+c);
     System.out.println("==============================");
     
     int f = d+e;
     System.out.println("This is Use of private modifier & Global_Var addtion: "+f);
     System.out.println("==============================");
     
     int j= g+h;
     System.out.println("This is Use of protected modifier & Global_Var addtion: "+j);
     
	}

}
