
class parentss {
	
	    parentss()
	    {
		System.out.println("parent constructor has executed");
	    }
}
class constructor_if_this_And_super_not_in_constructor extends parentss{
	
	constructor_if_this_And_super_not_in_constructor() //call will come here and  since this or super is not 
	                                                   //here hence by default super keyword will be generated
	    {
		System.out.println("child constructor has executed");
	    }
	
public static void main(String[]args){
	new constructor_if_this_And_super_not_in_constructor();
}
}
	


//in any constructor if we are not writing any this or super than by default it will take super keyword
//by compiler