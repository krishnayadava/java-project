import java.util.*;
public class missing_number_in_array {
	
	public static void main(String[]args){
		
		Scanner s= new Scanner(System.in);
		     int i; int arraysum=0;  
		     int a[] = new int [6];
		  System.out.println("enter the values of array");
		  
		     for (i=0; i<5; i++){
		    a[i]  =s.nextInt();
		     }
		     
		     
		     
		    int n= a.length;
		    int sum= n*(n+1)/2;
		    
		    for(i=0; i<5; i++){
		    	 arraysum += a[i];
		    }
		    
		    int missing= sum-arraysum;
		
		    System.out.println(missing);
		  //  System.out.println(n);
	}

}