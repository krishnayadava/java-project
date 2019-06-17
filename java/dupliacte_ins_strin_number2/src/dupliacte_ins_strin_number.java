import java.util.*;
class DuplStr{
 public static void main(String argu[]) {

	
	 
	 String s= " krishnayada";
	 
	 
Map<Character,Integer> map = new HashMap<Character,Integer>(); //ek object bnayenge map ka jo key aur value me store kareg
	 
	 for (int i = 0; i < s.length(); i++)
	 {
	   char c = s.charAt(i);
	   
	     if (map.containsKey(c))
	       {
	        int cnt = map.get(c);
	       map.put(c, ++cnt);
	        } 
	   
	     else {
	        map.put(c, 1);
	   }
	   
	   System.out.println(c);
	 }
}}

