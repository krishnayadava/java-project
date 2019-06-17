
abstract class pitaji {
	{
	System.out.println("instance block executed");
	}

	static{
	System.out.println("static block executed");
	}
}	


class abstract_block_and_static_block extends pitaji{
	abstract_block_and_static_block(){
		super();
		System.out.println("child class executed");
	}
	

public static void main(String[]args){
	new abstract_block_and_static_block();
}
}


