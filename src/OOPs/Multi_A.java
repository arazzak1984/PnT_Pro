package OOPs;
public class Multi_A {
   void sumA() {
	   int a=5;
	   int b=6;
	  System.out.println("Reuslt of summation: "+(a+b));
  }
   void subTract() {
	   int a=7;
	   int b=6;
	  System.out.println("Reuslt of subtraction: "+(a-b));
   }
}
class Multi_B extends Multi_A {
	
	void dividation() {
		int a=72;
		   int b=6;
		  System.out.println("Reuslt of dividation: "+(a/b));
	}
}
class Multi_C extends Multi_B {
	void multiplication() {
		System.out.println("Result of Multiplication");
	}
	public static void main(String args []) {
		
		Multi_C obj = new Multi_C();
		obj.dividation();
		obj.multiplication();
		obj.subTract();
		obj.sumA();
		
	}
}



