import java.util.*;


class string_string_tokenizer_user_input {
	
	public static void main(String[]args){
		
		System.out.print("enter the string you want to tokenize"); //yaha ye print kareynge
		Scanner input = new Scanner(System.in);                  // ye string input krne k liye
		
		String s = input.nextLine();                            //next input ko string s me store kr denge
		
        StringTokenizer s1= new StringTokenizer(s," ");        //yaha token karenge string ka
		
		while(s1.hasMoreTokens()){                             //yaha check karenge k tokens zyada hai ya kam
		
		
		System.out.println(s1.nextToken());                    //har token ko print kara denge
	}
		}
		
		
	}

