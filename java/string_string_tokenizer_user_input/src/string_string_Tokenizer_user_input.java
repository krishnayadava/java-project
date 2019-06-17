import java.util.*;
import java.util.Scanner;


class string_string_tokenizer_user_input {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		
		
		
		System.out.println("enter the string you want to tokenize");
		
		StringTokenizer s1= new StringTokenizer("s", " ");
		
		while(s1.hasMoreTokens()){
			
			System.out.println("nextToken()");
			
			
		}
		
		
	}

}