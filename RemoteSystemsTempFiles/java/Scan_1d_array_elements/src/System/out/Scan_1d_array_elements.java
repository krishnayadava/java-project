package System.out;
import java.util.*;
import java.util.Scanner;

class Scan_1d_array_elements {
	
	public static void main(String[]args){

		int i=0; 
		
		
	
		int a[] = new int [5]; //initailing an array
	
	
	             //initialiseing i
	
	Scanner input= new Scanner(System.in);
	
	for(i=0; i<5; i++){           //loop lagaya 5 ka jo k initailse hoga 0 se
		
		System.out.print("value entered is :" );  // ye pehle value input k liye
		
		a[i]= input.nextInt();            //input wali memory me a[i] k value store hogi
	}
	
	for(i=0; i<5; i++){           //printing for 
	System.out.print(a[i]);
	}
	
	
	
	
	
	
	
	}

}
