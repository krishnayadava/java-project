
class differnce_between_static_and_instance_variable {

	int a=10;         //instance variable
	static int b=20;  //static variable
	
	public static void main(String[]args){
		
    differnce_between_static_and_instance_variable input= new differnce_between_static_and_instance_variable();
    //pehla object bnaya yaha pe
    
    System.out.println(input.a);
    System.out.println(input.b);
	
    input.a=99;  //yaha fir a aur b k value initialise kiya
    input.b=100;  
    
    System.out.println(input.a); //jo value dala hai wahi print hoga..!!
    System.out.println(input.b);
    
    differnce_between_static_and_instance_variable input2= new differnce_between_static_and_instance_variable();
  // dubara object bnaya...is case me static variable jo starting me dala tha wo legaa na k jo baadd me assign kiya
    //magar instance wala me dusri value legaa...
    
    
    System.out.println(input2.a);
    System.out.println(input2.b);
    
	}
	
	
	

}
//  instance variable --jitni baar object bnayenge utni baar seperate memory allocate hoga..
// static variable k case me jitni baar object bnayenge same memory use hogi...


//kehne ka matlb object bnaya agar to static variable jo starting me define me kiya tha wahi legaa..bhale he baad me static k value change kiya ho
//but instance variable k case me jitni baar change kiya utni baar change hogaa...

