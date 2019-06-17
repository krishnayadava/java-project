import java.util.*;
class exception_handling2 {
	
	public static void main(String[] args){
		int a[] = new int [5];
		
		Scanner input=new Scanner(System.in);
		  for(int i=0; i<4; i++){
			  System.out.println("enter the values");
		         a[i]  =input.nextInt();
		  }
		  
		  try{
			  for(int i=0; i<5; i++){  // ek output by default 0 le rha??? <= pe exception throw kr dega
				  System.out.println(a[i]);
			      }
		     }
		  catch(ArithmeticException e){
				System.out.println("In the catch Block due to Exception = " +e);
			}
		
	}

}
