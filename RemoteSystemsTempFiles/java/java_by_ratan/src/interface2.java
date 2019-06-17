
interface interfac {
	void m1();
	void m2();
	void m3();
}

abstract class test4 implements interfac{
	public void m1(){
		System.out.println("m1 method executed");
	}
}
abstract class test5 extends test4{
	public void m2(){
		System.out.println("m2 method executed");
	}
}

class interface2 extends test5{
	public void m3(){
		System.out.println("m3 method executed");
	}
	
public static void main(String[] args){
	interface2 s = new interface2();
	     s.m1();
	     s.m2();
	     s.m3();
}
}


