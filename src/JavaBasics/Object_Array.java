package JavaBasics;

public class Object_Array {

	public static void main(String[] args) {
		
		
		Object ob[][] = new Object[2][2];
		
		ob[0][0]= "Ashik Boss";
		ob[0][1]= 234;
		ob[1][0]= '@';
		ob[1][1]= 12.67;
		
		for(int i = ob.length-1; i>=0;i--) {
			for(int j = ob.length-1; j>=0;j--) {
				System.out.println(ob[i][j]);
			}
			
		}

	}
	

}
