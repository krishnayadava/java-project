
final class final_modifier {

	int a=10;

final void m1(){
	a=a+100;
System.out.println(a);

}
public static void main(String[]args){
	final_modifier t = new final_modifier();
	t.m1();
	
}
}

//if class is final then reassignment of variable is possible.
//
