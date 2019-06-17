
import java.util.HashMap;
import java.util.Map;
class duplicates{
 public static void main(String argu[]) {

	 String str = "asdfasdfaf"; 
	 
	 char[] arr = str.toCharArray();
	    
	 Map<Character, Integer> Map = new HashMap<Character, Integer>();
	 
	    

	    for (char value: arr) {

	     //  if (Character.isAlphabetic(value)) {
	           if (Map.containsKey(value)) {
	               Map.put(value, Map.get(value) + 1);

	           } else {
	               Map.put(value, 1);
	           }
	       }
	 //   }

	    System.out.println(Map);
	    
 }}
