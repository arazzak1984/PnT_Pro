package OOPs;

public class Poly_Runtime_B extends Poly_Runtime_A {  // Dynamic or runtime polymorphism.
	// Method override will happen within 2 class where method name and parameter will be the same
	// When we crete the class object  we have to do topcasting/upcasting
	//Preference will go to the sub class/ child class
	
	
	void khaledBhai() {
		System.out.println("He is genious 2");
	}

	public static void main(String[] args) {
		Poly_Runtime_A obj = new Poly_Runtime_B();   // TopCasting
		obj.khaledBhai();
	}

}
