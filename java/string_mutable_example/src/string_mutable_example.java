
public class string_mutable_example {
	
	public static void main(String[]args){
		
		String s1 = "ram";    //new nahi laga to constant pool me store hoga.
		String s2 = "ram";    // ab string already store hai to s2=s1.. hoga aur output equal ayega...
		                      // yaani pehle search karega constant pool me k string already hai ya nhi..
		                      //agar hai to same refernce he point karega
		                      //DUPLICATES ARE NOT ALLOWED
		
	                          // agar "new" se bna to har string alag alag store hogi non constant pool me
		                      //DUPLICATES ARE ALLOWED
	
	if(s1==s2){
	System.out.print("string are equal");	
	}
	else{
		
	System.out.print("string are not equal");
	}
}
	}
