
class baap {
	{
	System.out.println(" parent class instance block executed");
	}
	baap()
	{
    System.out.println(" parent class constructor executed");
	}
}

class constructor_and_instance_block extends baap{ //pehla flow yaha aya ab parent class ka instance block execute hoga
	{
		System.out.println("child class instance block executed");
	}
	constructor_and_instance_block(){          // fir yaha aya pr super mil gya to baap k paas
		System.out.println("child class constructor executed");
	}
	
public static void main(String[] args){
	
	     new constructor_and_instance_block();
}
}


// summary:--->
