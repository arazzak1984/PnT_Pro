package JavaBasics;

import java.util.Scanner;

public class if_else_Grading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a students number: ");
		 int mark = sc.nextInt();
		//int mark = 76;
		 
		 if(mark<100 & mark>=89) {
			 System.out.println("Student got grade A");
		 }else if (mark<=88 & mark >=79) {
			 System.out.println("Student got B+");
		 }else if(mark <=78 & mark>=69) {
			 System.out.println("Student got B");
		 }else if(mark<=68 & mark >=60) {
			 System.out.println("Student got C");
		 }else {
			 System.out.println("Student got F");
		 }
		
		

	}

}
