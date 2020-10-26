package JavaBasics;
import java.util.ArrayList;

public class Arraylist_Concept {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		obj.add(20);   //0
		obj.add(30);   //1
		obj.add(40);   //2
		obj.add(50);   //3
		obj.add(60);   //4
		
		System.out.println("0th index: "+obj.get(0));
		System.out.println("1th index: "+obj.get(1));
		System.out.println("2th index: "+obj.get(2));
		System.out.println("3th index: "+obj.get(3));
		System.out.println("4th index: "+obj.get(4));
System.out.println("=================================================================================================");	
		
		System.out.println("Before: "+obj.size());
			
		for(int i=0; i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		
		obj.remove(2);
		obj.remove(3);
		System.out.println("After remove: "+obj.size());

		for(int i=0; i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
        

		
		
		
		
		
		
	}

}
