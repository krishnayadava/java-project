
class parentssss {
	
	void m1(){
	System.out.println("parent block executed");

}
	}

class constructor_super_keyword extends parentssss{
	void m1(){
	System.out.println("child block executed");
	}
	
	void m2(){
		this.m1();  //calls current method
		super.m1();  //calls parent method
	}
	public static void main(String[] args){
		new constructor_super_keyword().m2();
	}
}
