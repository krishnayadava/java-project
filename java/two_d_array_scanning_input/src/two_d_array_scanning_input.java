import java.util.*;
import java.util.Scanner;
class two_d_array_scanning_input {
	
	
	public static void main(String[]args){
		
		int i=0;
		int j=0;
		int a[][]= new int [3][3];
		
		Scanner input = new Scanner(System.in);   //defining for taking input from system keyboard
		
		
		
		for(i=0; i<3; i++){        // pehle i=0 me ghusega....
			
		for(j=0; j<3; j++){        //fir j=0 me ghusega aur pehli line yaani 1, 2. 3 dalega  
			                       //dalne k baad loop break aur i=1 hoga..
			System.out.print("enter the vaue ot 2d array :");
		
		     a[i][j]       =input.nextInt();
		}
		}
		
		for(i=0; i<3; i++){
			
			for(j=0; j<3; j++){
				
			     System.out.print(a[i][j] ); //print wale k case me ek line me likhega 
		}
			 ; // println moves cursor to new line
			 System.out.println();
		}

}
}