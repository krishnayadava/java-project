import java.util.Scanner;
public class array_bubble_short {
	
	
public static void main(String[]args){
		
	Scanner input = new Scanner(System.in);{
		
		int i;	
        int a[]= new int [10];
			
			
    	for( i= 0; i<5; i++){   //array me input le liya
				
				System.out.print("enter the value : " );
			       a[i]= input.nextInt();
	      	}
			
		
		for(int j=0; j<4; j++){  // N-1 iteration baad saare swap ho jayenge.(
			                                 
		  for( i=0; i<4; i++){   // ye loop internal ek ek iteration k liye
				
				if(a[i]>a[i+1]){            // adjacent compare ho rhe aur swap ho rhe
					int temp=a[i];          //pehle iteration me sbse bada wala right chala jayegaa.
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			}
			for(i=0; i<5; i++){
				System.out.print(a[i]);
				}
		}
	
		
	}

}

//// round wala ek baar jab chalega to internal ja k i =0 wala chalega aur right most point me chal jayega sabse bada wala...
////dusri baar fir round 2 me jayegaa...
