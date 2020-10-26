package OOPs;

public class Poly_Comp {   // Compiletime polymorphism,  Static polymorphism, Method overloading.
	// Same class , same method name with different parameter/args.
	void sum() {
		
		// driver.
		// driver.pas
		System.out.println("This is zero param");
	}
	
	
	
	
	void sum(String a) {
		System.out.println("This single param:"+a);
	}
	void sum(int a, int b) {
		System.out.println("This single param:"+(a+b));
	}

	public static void main(String[] args) {
		Poly_Comp obj = new Poly_Comp();
		obj.sum();
		obj.sum("Dada");
		obj.sum(6, 7);
		
	}

}
