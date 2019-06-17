
import java.util.Scanner;
class string_comparing_two_string {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("enter the string 1 :");
	    
		String  s1   =input.nextLine();
		      
		System.out.print("enter the string 1 :");  
		String  s2   =input.nextLine();
		
		
		if(s1==s2){   //ye string ka refernce compare karega...ku6 bhi dalenge not equal kyuki s1 and s2 equal nhi
			
			System.out.print("Strings are equal ");
		}
		
		else{
			System.out.print("Strings are not equal ");
		}
	}

}