
public class Mythread extends Thread {  //Thread class contains different methods like run,sleep,start
	
	public void run(){  //overriding run method available in Thread class(this is also know as JOB)
		
		for(int i=0; i<10; i++){
			System.out.println("after start method name is " +t.getName());
			System.out.println("child thread");
		}
	}

}

class ThreadDemo{
	
	public static void main(String[] args){
		System.out.println("main thread name is" +Thread.currentThread().getName());
		Mythread t= new Mythread();  //instantaition of child thread
		         t.start(); //starting of main thread
		                             //using method available in Thread class//  
		                             //Here thread are divided into two parts --main and child thread
		                             //flow will move towards child thread from here
		         
		         
		        // System.out.println("after start method name is " +t.getName());
		         for(int i=0; i<10; i++){   
		        	 System.out.println("after start method name is " +t.getName());
		System.out.println("main thread"); //executed by main thread
	}}
	
	
}