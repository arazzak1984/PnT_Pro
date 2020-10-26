package JavaBasics;
public class Variables_Java {

	 static int y=800;
	 
	 public static int p= 15;
	 public static int q=9;
	
	 private int r = 20;
	 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		System.out.println(y);
		System.out.println(p+q);
		
		Variables_Java obj = new Variables_Java();
		System.out.println(obj.local());
		
		Variables_Java ox = Variables_Java.class.newInstance();
		
	}
	
	public int local(){
		 int a = 10;
		 int d=a+y+r;
		 return d; 
		
	}
	 public static int z=5;
 
}
