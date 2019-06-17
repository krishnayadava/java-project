class constructor_this_keyword {
	
int a;	
constructor_this_keyword(int a){
		
		System.out.println("constructor has executed");
		
		this.a=a; //(if this will be commented than it will take default value a in some other mehtods)
		          //this is to convert local variable into instance variable
	    }
	
	void m(){
		System.out.println(a);
	}

        public static void main(String[]args){
		
		constructor_this_keyword s = new constructor_this_keyword(10);
		        
		                  s.m();
	}

}
