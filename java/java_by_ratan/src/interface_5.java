interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
class interface_5 implements Printable,Showable{  //call kr skte 2 interface ko kyuki implementation jo hota hai wo implementation class me hota 
public void print()
{System.out.println("Hello");}  

public static void main(String args[]){  
	interface_5 obj = new interface_5();  
obj.print();  
//obj.show();  
 }  
} 


//java support multiple inhertance in interface because in interface we will only define method
// its implementation is done in implementation class