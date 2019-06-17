class papaa {
	{
		System.out.println("parent instance block executed");
	}
}
	class constructor_parent_block extends papaa{
	{
		System.out.println("child class instance block executed");
	}
	
	public static void main(String[] args){
		
		new constructor_parent_block();
		
	}
	
}
//In Is a relationship..if parent class and child class is there...
//	than parent class instance will be executed first than child class instance block

