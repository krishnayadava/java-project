class exception_handling3 {
	public static void main(String[] args){
		demo d=new demo();
		System.out.println("entering main method");
		
		try{
			d.fun();
		}
		
		catch(ArithmeticException e){
			System.out.println("exception cought");
			//throw e;
		}
		System.out.println("method existing normally");
	}}

class demo{
	void fun(){
		System.out.println("entering fun");}
		try{
		fun2();
	}
	void fun2(){
		System.out.println("entering fun2");
		int a; int b; int c;
		a=10;b=0;
		c=a/b;
		System.out.println(c);
		throw e;
	}
	
}