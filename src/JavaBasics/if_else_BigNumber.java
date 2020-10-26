package JavaBasics;

public class if_else_BigNumber {

	public static void main(String[] args) {
		
		int a = 500;
		int d = 300;
		int r =800;
		int n = 900;
		
		if(a>d & a>r & a>n) {
			System.out.println("A is makes more money");
		}else if (d>a & d>r &d>n) {
			System.out.println("Dedar makes more money");
		}else if(r>a & r>d & r> n) {
			System.out.println("Babul bhai makes more money");
		}else {
			System.out.println("Nasrin is the Boss");
		}
		

	}

}
