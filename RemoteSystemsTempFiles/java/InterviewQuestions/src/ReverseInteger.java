import java.util.*;
public class ReverseInteger {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the values");
		  
		  int  a []= new int [5];
		  
		   for(int i=0; i<=3; i++){
			  
			 a [i]  = input.nextInt();
		  }
		   
		   //int a[] = {1,2,3,4};
		  
		  
		  for(int i= 3; i>=0; i--){
			  
		   System.out.print(a[i]);
		   
		  }
		  
	}
	
	

}
