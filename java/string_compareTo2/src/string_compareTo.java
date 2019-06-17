import java.util.Scanner;
class string_compareTo {
	
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("enter the string 1 :");
	    
		String  s1   =input.nextLine();
		      
		System.out.print("enter the string 1 :");  
		String  s2   =input.nextLine();
		
		
		int m=s1.compareTo(s2);    // asci level pe compare krta aur result iska three typ ka hota.
		                           // either m=0;
		                           //or m>0
		                           // or m<0
		
		if(m==0){
			
			System.out.print("both the input given are same");
		}
		
		if(m>0){
			System.out.print("value of string1 is greator than second");
		}
		if(m<0){
			System.out.print("value of string2 is greator than first");
			
		}
		
	}

}
