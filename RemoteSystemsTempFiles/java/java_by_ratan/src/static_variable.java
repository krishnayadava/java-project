
class static_variable {
	
	static int a =10;  //static variable are declared outside method having static as modifier
	static int b=20;   //static variable h ye
	
	public static void main(String[]args){
		
		System.out.println(a);  // static variable ko directly acces kr skte static method me.
		System.out.println(b);
		
		static_variable s= new static_variable();
		s.m1();
	}	
	void m1(){
		System.out.println(a); // static variable ko instance method directly use kr skta hai..
		
		System.out.println(static_variable.b);// class name se bhi access kr skte hai static variable ko 
		                                      // instance variable me
		
		//System.out.println(s.b);
	}

}
