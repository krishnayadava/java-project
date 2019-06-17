import java.util.*;
class exception_handling {
	
	public static void main(String[]args){
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");        
		int a =s.nextInt();
		System.out.println("enter the second number");
		int b =s.nextInt();
		int c;
		c=a/b; // agar exception aya to c ka refernce 
		
		try{
			System.out.println(c);
			}
			catch(ArithmeticException e){
				System.out.println("In the catch Block due to Exception = " +e);
			}
		}
	}