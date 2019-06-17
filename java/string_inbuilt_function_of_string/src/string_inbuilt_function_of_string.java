
class string_inbuilt_function_of_string {
	
	
	public static void main(String[]args){
		
		String s = "RAMESHWARAM";
		
		System.out.println(s.length());  //it will find the length of string. 11
		System.out.println(s.charAt(5));  // index 0 se start hoga..to 5 pe H
		System.out.println(s.indexOf("R")); // it will result as 0
		System.out.println(s.lastIndexOf("R"));
		System.out.println(s.contains("Ram"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(8));   // 8 aur 8 k baad sara lega
		System.out.println(s.substring(4,10)); // 4a aur 4 k baad sara lega 9 tak
		
	}

}
