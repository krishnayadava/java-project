
class string_concatination_of_two_string {
	
	public static void main(String[]args){
		
		String s1= "ram" + "sita";  //if value/char are concatinate than constant pool me memory allocate hogi
		String s2= "ram" + "sita";
		
		System.out.println(s1);
		if(s1==s2){
			
			System.out.println("references are pointing same object"); //ye output ayega kyuki char or variable used hua
		}
		else{
			System.out.println("references are not pointing same object");
		}
		
		
		String s3= "ram";
		String s4="krishna";
		String s5=s3+s4;        //yaha "variable" s3 aur s4 used hua concat k liye so ye non constant pool me jayega...
		String s6=s3+s4;
		System.out.println(s5);
		
		if(s5==s6){
			
			System.out.print("refernces are pointing to same location");
		}
		else{
			System.out.print("refernces are pointing to not location"); //ye output ayega kyuki char or variable used hua
		}
	}
	
	

}
