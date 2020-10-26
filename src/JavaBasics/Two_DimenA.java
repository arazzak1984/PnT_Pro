package JavaBasics;

public class Two_DimenA {

	public static void main(String[] args) {
		
		String ar[][]= new String[3][3]; 
		
		ar[0][0]="BNP";
		ar[0][1]="Awamilig";
		ar[0][2]="Democrat";
		
		ar[1][0]="Repulican";
		ar[1][1]="Elephant";
		ar[1][2]="Donkey";
		
		ar[2][0]="Asik bhai";
		ar[2][1]="Dedar bhai";
		ar[2][2]="Babul bhai";
		
		for(int i =0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				System.out.println(ar[i][j]);
				//System.out.println();
			}
		}
		
		
	}

}
