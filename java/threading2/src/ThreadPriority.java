
public class ThreadPriority extends Thread {
	
	public void run(){
		System.out.println("child executed");
	}


}
class Mysthread{
	public static void main(String[] args){
		ThreadPriority t = new ThreadPriority();
		System.out.println("this is the main thread "  +Thread.currentThread().getName());
		
		        t.setPriority(10);
		        t.start();
		        
		        
		        for(int i =0 ; i<=4; i++){
		        	System.out.println("main thread executed");
		        }
		        }
	}
