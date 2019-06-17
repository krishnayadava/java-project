import java.util.*;
class vowel_consonant_number {
	
	public static void main(String[]args){
		
	Scanner input = new Scanner(System.in);
	int vowels=0; int consonants=0; int digits=0; int spaces=0;
	            String s =input.nextLine();
	            
	                 s=s.toLowerCase();
	                 
	              
	               for(int i = 0; i < s.length(); ++i)
	               {
	            	   char ch = s.charAt(i);
	            	   
	                     if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
	        	  
	        	             ++vowels;
	                }
	                     else if((ch >= 'a'&& ch <= 'z')) {
	                         ++consonants;
	                     }
	                     else if( ch >= '0' && ch <= '9')
	                     {
	                         ++digits;
	                     }
	                     else if (ch ==' ')
	                     {
	                         ++spaces;
	                     }
	           
	               }
	               System.out.println(vowels);
	               System.out.println(digits);
	               System.out.println(spaces);
	               System.out.println(consonants);
}
}