package JavaBasics;

import java.util.ArrayList;

public class Arraylist_Prog1 {
	
	public static void main(String[] args) {
		ArrayList dedar = new ArrayList();  // Dyanamic Array 
		dedar.add("Dada bhai");
		dedar.add(234);
		dedar.add('a');
		dedar.add(12.23f);
		dedar.add(true);
		System.out.println(dedar);
		System.out.println("Size of the array: "+dedar.size());
		for(int i=0; i<dedar.size(); i++) {
			System.out.println(dedar.get(i));
		}
		
		System.out.println("=========================================");
		
		ArrayList<String> ashik = new ArrayList<String>();
		ashik.add("Ashik bhai is the best");
		ashik.add("24");
		ashik.add("he best");
		ashik.add("dog");
		
		System.out.println("Before adding: "+ashik.size());
		for(int xy =0; xy<ashik.size(); xy++) {
			System.out.println(ashik.get(xy));
		}
		System.out.println("=====================================");
		
		ArrayList<String> babul = new ArrayList<String>();
		babul.add("2345");
		babul.add("5678");
		System.out.println("==================================");
	
		String x=babul.get(0);
		String y= babul.get(1);
		System.out.println(x+y);
		System.out.println("==================================");
		ashik.addAll(babul);
		System.out.println("After adding: "+ashik.size());
		
		for(int xy =0; xy<ashik.size(); xy++) {
			System.out.println(ashik.get(xy));
		}
			
		ashik.removeAll(babul);
			
			
	}

}
