import java.util.*;
class list {
	
	
public static void main(String[]args){
		
		LinkedList l = new LinkedList();
		
		           l.add("A");
		           l.add("B");
	  	           l.add(2, "C");
		           l.add("A");       //duplicates are allowed
		           l.add("hello");
		           l.set(5, "krishna");
		           //l.remove("A");
		         // l.remove(3);
		         // l.clear(); 
		           System.out.println(l);
		           System.out.println(l.size());
		           System.out.println(l.get(2));
		           System.out.println(l.contains("Y"));
		           System.out.println(l.isEmpty());
		           
		          // with the help of output we will be able to know insertion order is preserved
	}


}

//child of collection
 //duplicates are allowed
// insertion order is preserved