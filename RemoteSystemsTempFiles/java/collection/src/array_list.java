
import java.util.*;
class array_list {
	
	public static void main(String[]args){
		
		ArrayList l = new ArrayList();
		
	//	ArrayList l = new ArrayList(1000);
	//	ArrayList l = new ArrayList(Collection c); //steps to convert any list to array list
		l.add("A");
        l.add("B");
       l.add(2, "C");
       l.add("A");       //duplicates are allowed
        l.add("hello");
        l.add(10);
        l.add("null"); // null insertion is possible
        
   //  l.set(5, "krishna");
		System.out.println(l.size());
		System.out.println(l);
		System.out.println(l.get(4));
	}

}
//creates default size 10. new= (current*3/2) +1
// duplicates are allowed 
//null insertion is possible
//insertion order is preserved
//hetrogeneous objects are allowed // except tree set and tree map
