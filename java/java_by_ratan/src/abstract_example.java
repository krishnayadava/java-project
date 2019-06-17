abstract class test{   //class abstract hai to object nhi banega...!!
	abstract void m1(); 
	abstract void m2();
	
	void m4(){
		System.out.println("m4 method");
	}
}	

class abstract_example extends test{  // iska object nhi bnega...!!
	
	void m1(){
		System.out.println("m1 method");
	}
	void m2(){
		System.out.println("m2 method");
	}
	void m3(){
		System.out.println("m3 method");
	}
public static void main(String[] args){
	test t = new abstract_example();
     t.m1();
     t.m2();
   // t.m3();
}
}

//yaha child class ka refernce bnaya to koi dikkat nhi...
//abstract class k refernce me store kiye child class k object.... to method check karenge abstract class me
//k hai k nhi...agr nhi to compile time me error degaa...!!!


