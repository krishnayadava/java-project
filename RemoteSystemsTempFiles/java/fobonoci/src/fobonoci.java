import java.util.*;
class fobonoci {

	
	public static void main(String[]args){
		
		Scanner s = new Scanner(System.in);
		
		int [] fib =  new int[20];
		
		fib[0]=0;
		fib[1]=1;
		
		int i;
		for(i=2; i<0; i++){
		fib[i]= fib[i-1]+ fib[i-2];
	
		System.out.println(fib[i]);
		}
		
		
	}
	
	
	}


