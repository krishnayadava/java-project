
import java.util.*;
class Vector_list {
	
	public static void main(String[] args){
		
		Vector v = new Vector();
	//	Vector v = new Vector(20);
	//	Vector v = new Vector(1000 5);
	//	Vector v = new Vector(Collection c);
		
	System.out.println(v.capacity()); //vector me he keval dekh payenge
	
	for(int i=0; i<=10; i++){
		v.addElement(i);
	}
	
	System.out.println(v.capacity());
	
	    v.addElement("A");
	
	System.out.println(v.capacity());
	
	 v.removeElementAt(9);  //Is point ka element delete hoga 
	 v.removeElement("A");  // ye element delete hoga
	 
	 System.out.println(v);	
	}

}
