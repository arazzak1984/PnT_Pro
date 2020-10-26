package JavaBasics;

public class String_Array {

	public static void main(String[] args) {
		
		String ar[] = new String[5];
		ar[0]="Ashik Bhai";
		ar[1]="Dedar Bhai";
		ar[2]="Sohag Bhai";
		ar[3]="Khaled Bhai";
		ar[4]="Babul Bhai";
		
		for(int i =0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("====================================================");
		
		for(int k=ar.length-1; k>=0;k--) {
			System.out.println(ar[k]);
		}
		
		System.out.println("====================================================");
		
		String twodar[][]= new String [2][2];
		twodar[0][0]="asikbhai@yahoo";
		twodar[0][1]="34588";
		twodar[1][0]="didar@gmail";
		twodar[1][1]="88";
		
		for(int m=0; m<twodar.length;m++) {
			for(int j=0; j<twodar.length;j++) {
				System.out.println(twodar[m][j]);
			}
		}
		
		System.out.println("Size of two dimensional array: "+twodar.length);
		

	}

}
