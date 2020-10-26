package JavaBasics;

public class Array_Concept {

	public static void main(String[] args) {
		//int ar[]= {2,3,4,7,6};  // Array literal
		//System.out.println(ar.length);
		int arr[] = new int[3];  // Fixed  Array.
		arr[0] =5;
		arr[1] =7;
		arr[2] =9;
       System.out.println("This is length of static array arr: "+arr.length);
      
       int c =(arr[0]+arr[1])*arr[2];
       System.out.println("This is sum: "+c);
       System.out.println("============================================");
       for (int x=0; x<arr.length; x++) {
    	   System.out.println(arr[x]);
       }
       System.out.println("============================================");
       for(int i=2;i>=0; i--) {
    	   System.out.println("This is decending order: "+arr[i]);
       }
       System.out.println("============================================");
       for(int m=arr.length-1; m>=0; m--) {
    	   System.out.println("This is Another decending: "+arr[m]);
       }
       System.out.println("============================================");
       
       int d[][] = new int[2][2];
       d[0][0]=2;
       d[0][1]=6;
       d[1][0]=4;
       d[1][1]=7;

       System.out.println("Size of two dimension: "+d.length);
       for(int k=0; k<d.length; k++) {
    	   for(int j =0; j<d.length; j++) {
    		   System.out.println(d[k][j]);
    	   } 
       }
       System.out.println("==========================================================");
       
       for(int a=d.length-1; a>=0; a--) {
    	   for(int b=d.length-1; b>=0; b--) {
    		   System.out.println(d[a][b]);
    	   } 
       }
       System.out.println("===============================================================");
       for(int p=1; p>=0; p--) {
    	   for(int q=1; q>=0; q--) {
    		   System.out.println("Another: "+d[p][q]);
    	   } 
       }
       
	}	
}

