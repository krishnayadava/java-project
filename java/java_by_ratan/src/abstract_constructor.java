
	abstract class papaji{

		papaji(){
			
			System.out.println("parent class constructor get executed");
		}
	}
	
	class abstract_constructor extends papaji{
		abstract_constructor(){
			super();
			System.out.println("child class constructor executed");
		}
	public static void main(String[]args){
		abstract_constructor s = new abstract_constructor();
	
	}
		
	}

//object creation of abstract class is not possible but constructor can be executed by creating object class of child 
// and from there it will call parent constructor by super keyword.
	