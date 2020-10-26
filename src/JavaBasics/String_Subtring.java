package JavaBasics;

public class String_Subtring {

	public static void main(String[] args) {
		// Find password of Ashik bhai 3456
		// Babul bhai password 3678
		//user1user2

		String str ="user1 is ashik bhai and his is password 3456 and user2 is babul bhai and password 3678";
	
		int ind = str.indexOf("3456");
		System.out.println("Index of character 3 is: "+ind);
		
		String passashik=str.substring(40, 44);
		System.out.println("This is ashik bhai password: "+passashik);
		
		int ind2 = str.indexOf("3678");
		System.out.println("Index of Babul Bhai: "+ind2);
	
		String passbabul=str.substring(82, 86);
		System.out.println("This is password of Babul Bhai: "+passbabul);
		
		/*String pass =str.substring(28, 32);
		System.out.println(pass);*/
		
		System.out.println(passashik+passbabul);
		
		
		
		
		/*
		char s=str.charAt(28);
		System.out.println("Character of index 28 is: "+s);
		*/
		

	}

}
