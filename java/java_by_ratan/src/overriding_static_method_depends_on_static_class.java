
class parenty {
	
	static void m1(){
		System.out.println(" parent method executed");
	}
}
class overriding_static_method_depends_on_static_class extends parenty{
	
	static void m1(){
    System.out.println("child method executed");
	}
	
public static void main(String[] args){

	parenty p= new overriding_static_method_depends_on_static_class();
	       p.m1();
	
}
	
	
}

	
//static modifier lag gya to static class pe depend krta..jiska class uska execution.