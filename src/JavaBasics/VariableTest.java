package JavaBasics;

public class VariableTest {

	public static void main(String[] args) {
			
		Var_1 testin = new Var_1();
		
		int z = testin.a+testin.b;
		System.out.println("Calling global variable into another class & addition "+z);
		
		
		tryingVar();

	}
	
	public static void tryingVar() {
		Var_1 testin = new Var_1();
		int o = testin.a+testin.b;
		System.out.println(o);
	}

}
