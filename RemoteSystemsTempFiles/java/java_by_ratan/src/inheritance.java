class Papa {
	
	int a=10;
	int b=20;
}
 class babu extends Papa{
	
	int a=100;
	int b=200;
 	
void m(int a,int b){
	System.out.println(this.a+this.b);
	System.out.println(super.a+super.b);
	System.out.println(a+b);
		
	}
 } 
class inheritance{
public static void main(String[]args){
	
	new babu().m(1000,2000);
}
}