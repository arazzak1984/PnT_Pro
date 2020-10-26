package JavaBasics;

public class Constructor_Concept {
	
// Default constructor:---->>
	public Constructor_Concept() {
		System.out.println("This is default constructor");	
	}
	
	public Constructor_Concept(int a) {
		System.out.println("This is single parameter constructor");	
	}
	
	public Constructor_Concept(String a) {
		System.out.println("This is second single parameter constructor");	
	}
	
	public static void main(String[] args) {

		Constructor_Concept sohag = new Constructor_Concept();  // Default
		Constructor_Concept dada = new Constructor_Concept(23);
		Constructor_Concept ashik = new Constructor_Concept("Java for selenium");
		

	}

}
