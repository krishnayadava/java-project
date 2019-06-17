
abstract class test1 {

	 abstract void m1();  
	 abstract void m2();
	 abstract void m3();
	}

abstract class test2 extends test1{
    void m1(){
    	System.out.println("m1 method executed");
	}}
abstract class test3 extends test2{
	void m2(){
		System.out.println("m2 method executed");
	}}
class abstract_example2 extends test3{
	void m3(){
		System.out.println("m3 method executed");
	}
	
	public static void main(String[] args){
		abstract_example2 t = new abstract_example2();
		 t.m1();
		 t.m2();
		 t.m3();
	}
}