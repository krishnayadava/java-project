import java.util.*;
public class duplicates_remove_in_string {
		
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			
		    System.out.print("enter the string 1 :");
		    
			String  s1   =input.nextLine();
			
			
		  char [] charArr = s1.toCharArray();   ///JO bhi input aya use char array me convert kr denge
			   
		Set<Character> charset= new LinkedHashSet<Character>(); //ek linked hashset create karenge jisme k char array wale dalenge
			 
		
			  for(char ch : charArr){// jo char array hai use ch me store karayenge 
					   charset.add(ch);  //aur set me add kr denge
			   }
			  
			  
			   StringBuffer s = new StringBuffer();
			   
			   for(char c : charset){
				   s.append(c);
			   }
			   
			   System.out.println(s);
			      
		}

		
			
		}
