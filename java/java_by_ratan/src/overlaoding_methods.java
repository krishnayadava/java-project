
class overlaoding_methods {

	
	void m1(){
		
		System.out.println("o argument method executed");
	}
	void m1(int a){
		
		System.out.println("1 argument method executed");
	}
	
	public static void main(String[]args){
		
		overlaoding_methods s=new overlaoding_methods();
		s.m1(10);
		s.m1();
		
	}
	
}
