package OOPs;

public class Execution_Abstract {

	public static void main(String[] args) {
		// Here i have created child class object and getting all the properties from both class		
		AbstractClass_Dedar obj = new AbstractClass_Dedar();
		obj.aShik();
		obj.babulBhai();
		obj.seleniUm();
		obj.uft();
		
		System.out.println("==========================================");
		// Here i have created parent class object where i am only getting parent class properties.	
		AbstractClass_Ashik obj2 = new AbstractClass_Dedar(); // Top casting
		obj2.aShik();
		obj2.babulBhai();
		obj2.uft();
		//obj2.

	}

}
