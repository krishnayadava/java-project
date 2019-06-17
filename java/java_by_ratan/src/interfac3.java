
interface compute {
	void add();
	void sub();
}
class interfac3 implements compute{
	int a;
	int b;
	int c;
  public void add(){
	a=10;
	b=20;
	c=a+b;
	System.out.println(c);
}
  public void sub(){
		a=30;
		b=20;
		c=a-b;
		System.out.println(c);
	}
  
public static void main(String[] args){
	compute c;  //abstract class ka keval refernce bna skte
	
	interfac3 p = new interfac3(); //bina wale ka bna object aur iska refernce transfer kr denge abstract wale me.
	c=p;
	c.add();
	c.sub();
}
}


