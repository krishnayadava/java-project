import java.util.Scanner;
public class string_comparing_two_string {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("enter the string 1 :");
	    
		String  s1   =input.nextLine();
		      
		System.out.print("enter the string 1 :");  
		String  s2   =input.nextLine();
		
		
		if(s1.equals(s2)){   //for content of string 
			
			System.out.print("Strings are equal ");
		}
		
		else{
			System.out.print("Strings are not equal ");
		}
	}

}
