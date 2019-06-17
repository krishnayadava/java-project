
class constructor_types {
	
	void m1(){
		
		System.out.print("method has been executed");
	}
	
	constructor_types(){  //if this constructor is not defined than defualt(o argument, empty parameter constructr
		                  //will run which is provided by compiler
		
		System.out.println("constructor has executed");
		
	}
	constructor_types(int a){  //parameterised constructor will be executed
		                      //yaha ye define karenge k jo parameter me aa rha wo kya hai in hai ya float ya string

        System.out.println("constructor with parameter has executed");

}
	
public static void main(String[]args){
	
	
	constructor_types s= new constructor_types();
	constructor_types s2= new constructor_types(10);
	  s.m1();
	
}
}

//here constructor will execute first than method
//defualt constructor will execute only if no any constructor is defined...
//if constructor h already class me aur parameter wala nhi to compiler error generate kr dega..
