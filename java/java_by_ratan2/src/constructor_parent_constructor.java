class Parentee {
	Parentee(){  //constructor and class name should be same
		System.out.println("parent constructor executed");
	}
}

class constructor_parent_constructor extends Parentee{
	
    constructor_parent_constructor(){  //constructor and class name should be same for this class
	    	this(10);                //call constructor with 1 argument in same class
	   	System.out.println("child constructor executed");
	}
	
	constructor_parent_constructor(int a){
		    super();               //calls parent class constructor
		System.out.println("child class with single variable executed");
			}
		
	
	public static void main(String[] args){
			new constructor_parent_constructor();
		}
	}
	
//if child and parent class are there than constructor name for each of the class would be differnt
// current constructor is called by this keyword and parent by super keyword.
// at a time both is not possible
