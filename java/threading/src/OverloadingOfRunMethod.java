
public class OverloadingOfRunMethod extends Thread {
	
	public void run(){
		System.out.println("O argument run method executed");
	}
	
	public void run(int a){
		System.out.println("1 argument run method executed");
	}
}

 class Mythreads{
	 public static void main(String[] args){
		 
		 OverloadingOfRunMethod t = new OverloadingOfRunMethod();
		                 t.start();
	 }	
}
 
 //Only 0 argument run method will be executed. 
 //If we want o execute parameter run method then we need to simply call the method
 