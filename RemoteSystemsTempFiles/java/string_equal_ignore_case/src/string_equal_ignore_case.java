
class string_equal_ignore_case {
	
	public static void main(String[]args){
		
		String s1= "RaMa";
		String s2= "Rama";
		
		if(s1.equalsIgnoreCase(s2)){
			
			System.out.print("Strings are equal");
		}
		else{
			
			System.out.print("Strings are not equal");
		}
	}

}
