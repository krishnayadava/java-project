import java.util.*;
public class BinaryNumberOrNot {
	
		
		public static void main(String[] args){
			
			int a [] = new int [5];
			 
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value ");
	   	
			 for(int i=0; i<=4; i++){
				  
				 a [i]  = s.nextInt();
			  }
		
		for(int i=0; i<=4; i++){
			
			if(a[i]==0 || a[i]==1){
				
				System.out.println("the given number is binary");
			}
			
			else{
				
				System.out.println("the given number is not binary");
			}
		}
		
		}}		
