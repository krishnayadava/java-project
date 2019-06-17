import java.util.StringTokenizer;


class string_string_tokenizer {
	
	
	

	public static void main(String[]args){
		
		String p= "raja ram mohan roy";
		StringTokenizer s1= new StringTokenizer(p,", ");
		
		while(s1.hasMoreTokens()){
		
		
		System.out.println(s1.nextToken());
	}

}}
