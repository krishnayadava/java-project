import java.util.*;
class parentsss {
	
	void m(){
		System.out.println("parent method executed");
		}
}
class overriding_reference_variable_creation_process extends parentsss{
	
    void m(){
		System.out.println("child method executed");
	}
    
    void m1(){
    	System.out.println("m1 method executed");
    }
    
    
    
    public static void main(String[]args){
	
  parentsss p = new overriding_reference_variable_creation_process(); // child class k object ko parent k refernce me.
  overriding_reference_variable_creation_process c= (overriding_reference_variable_creation_process)p;// type casting
  p.m();
  c.m1();
  
  

}
}

//In case we are creating object of child class and storing in variable of parent p
// in this case if we are calling any method in child class than same method should be present 
//in parent class else compile time error will come... s type casting karnege...

// agar child k refernce me he store karaya to koi dikkt nhi hogi..

