//middle me insertion ya deletion
// data fetch k liye worse
// memory idhar udhar so initial capacity ku6 nhi
// null insertion is possible

import java.util.*;
class Linked_list {
	
	public static void main(String[] args){
		
		LinkedList l = new LinkedList();
		
	//	LinkedList l = new LinkedList(Collection c); kisi collection ko linked list me convert kr denge
		l.add("Ravi");  
		  l.add("Vijay");  
		  l.add("Ravi");  
		  l.add("Ajay");
		  l.addFirst("krishna");// mainly agar first aur last yaa beeech me dalna ya niklna hai
		  l.addLast("mohan"); //
		  l.add(3,"lisa");  //
		  l.remove(3);
		  l.add("null");
		  
		  System.out.println(l);
		  System.out.println(l.getFirst());
		  System.out.println(l.getLast());
		
	}

}