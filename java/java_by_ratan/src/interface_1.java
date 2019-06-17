
interface testaaa { // abstract

	void m1();  // by default public and abstract
	void m2();
	void m3();
}

class interface_1 implements testaaa{
	
	public void m1(){   //it should be also public if default than it will not work out
		System.out.println("m1 method get executed");
	}
	
	public void m2(){
		System.out.println("m2 method get executed");
	}
	public void m3(){
		System.out.println("m3 method get executed");
	}
	
public static void main(String[] args){
	interface_1 s = new interface_1();
	s.m1();
	s.m2();
	s.m3();
}
	
	
}