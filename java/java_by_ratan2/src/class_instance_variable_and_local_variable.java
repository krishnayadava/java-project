class class_instance_and_static_variable {
	
	int a=100; // variables defined inside class and outside main are instance variable
	int b=200;  
	
	public static void main(String[]args){
		
		class_instance_and_static_variable s= new class_instance_and_static_variable();
		
		System.out.println(s.a);//instance variable ko directly use nhi kr skte static method me
		
		s.m();  //isi method se m() ko call kar lenge
	}
	void m(){  // instance method
		
		System.out.println(a); //instance variable directly use ho skta instance method me
	}

    }


//note:---> instance variable ko instance method directly use kr skta..but static mehtod nahi.....so
//          is case me static method me object bna k use kr lenge.