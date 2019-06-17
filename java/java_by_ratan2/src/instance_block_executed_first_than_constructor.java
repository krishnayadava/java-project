
class instance_block_executed_first_than_constructor {
	
	instance_block_executed_first_than_constructor(){
		
		System.out.println("constructor has executed first");
	}
	
	{
		
		System.out.println("instance block has executed first");
	}
	
	
	
	
	public static void main(String[]args){
		
		instance_block_executed_first_than_constructor s= new instance_block_executed_first_than_constructor();
		
	}

}

// instance block pehle execute hoga construtor k
// agar 2 consturctor hai alag alag to dono k pehle instance block execute hoga..


