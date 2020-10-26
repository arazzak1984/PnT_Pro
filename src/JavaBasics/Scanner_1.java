package JavaBasics;

import java.util.Scanner;

public class Scanner_1 {
	
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		int c =a+b;
		System.out.println("Previous addition "+c);
		
		System.out.println("====================================================");
		
		Scanner pnt = new Scanner(System.in);
		
		System.out.println("This is x number:  ");
		int x =pnt.nextInt();
		
		System.out.println("This is y number: ");
		int y = pnt.nextInt();
		
		int z = x+y;
		
		System.out.println("Addition of x and y "+z);
		
		System.out.println("================================");
		
		System.out.println("Enter a double number ");
		double dbb = pnt.nextDouble();
		
		System.out.println("enter a statement ");
		String s = pnt.next();
	
		
		
		

	}

}
