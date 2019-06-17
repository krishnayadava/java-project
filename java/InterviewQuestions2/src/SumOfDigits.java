import java.util.*;
public class SumOfDigits {
	

		public static void main(String[]args){
			
			Scanner s= new Scanner(System.in);
			     int i; int arraysum=0;  
			     int a[] = new int [6];
			  System.out.println("enter the values of array");
			  
			     for (i=0; i<5; i++){
			    a[i]  =s.nextInt();
			     }
			     
			     
			    for(i=0; i<5; i++){
			    	 arraysum += a[i];
			    }
			    
			    System.out.println(arraysum);
			  //  System.out.println(n);
		}
}