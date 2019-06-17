
class constructor_call {

	
	constructor_call(){       // this constructor will be executed first
		this(10);             //in very first line it will call 1 argument constructor
		                      //it should be initialse in first statement of constructor
		System.out.println("0 argument constructor has executed");
	}
	
	
	constructor_call(int a){  //this constructor will be executed will second
		this(10, 20);//in very first line it will call 2 argument constructor
		                   
		System.out.println("1 argument constructor has executed");
		
		}
	constructor_call(int p, int q){ //call will come here and this constructor will be here
		System.out.println("2 argument constructor has executed ");
	}
	
	public static void main(String[]args){
		constructor_call s = new constructor_call();
		
		
		
	}
}
//this keyword is used to convert local variable to instance variable
//also for calling another constructor call using.

