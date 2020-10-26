package JavaBasics;

public class String_Prog_1 {

	public static void main(String[] args) {
		
		String str = "  abc@yahoo.com,     23456";
		
		String dedar[] = str.split(",");
		
		String username = dedar[0].trim();
		System.out.println(username);
		
		System.out.println(str.length());
		
	
		
		System.out.println(str.replaceAll("\\s", ""));
		System.out.println("===================================================================");
		
		String s1  = "AshikBhai is a BNP Leader";
		String s2 ="BNP";
		
		String s3 =s1+s2;
		System.out.println(s3);
		
		System.out.println("Using concat Method: "+s1.concat(s2));
		
		System.out.println("This string"+s1);
		
		// Reversing String:------------------>>
		String reversestring = new StringBuffer(s1).reverse().toString();
		System.out.println("Reversing String: "+reversestring);
		
	// Converting string to Integer::--------------------->>>
		
		String s  ="100";
		String p = "200";
		
		String add =s+p;
		System.out.println(add);
		
	
		int k = Integer.parseInt(s);
		System.out.println(k);
		
		int h = Integer.parseInt(p);
		
		int i =k+h;
		System.out.println(i);
	
		//Converting Integer to String:------->>>>
		
		int w = 500;
		int r = 135;
		System.out.println(w+r);
		
		String u =String.valueOf(w);
		String y =String.valueOf(r);
		
		System.out.println(u+y);
		int asikBhai = 234567;
		
		System.out.println("=============================================================");
		
		String t = "welcome to bank of america";
		String g =t.toUpperCase();
		System.out.println(g);
		
		String m = "WELCOME TO BANK OF AMERICA";
		String l =m.toLowerCase();
		System.out.println(l);
		
		

	}

}
