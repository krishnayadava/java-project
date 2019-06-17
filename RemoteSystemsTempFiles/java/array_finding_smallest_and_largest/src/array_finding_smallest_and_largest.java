import java.util.Scanner;
class array_finding_smallest_and_largest {

	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int a[] = new int [6];
		 int max=0;
		
		for(int i=0; i<6; i++){       //input wala part
			System.out.print("enter the value :" );
			      a[i]=input.nextInt();
		}
		
		for(int i=0; i<6; i++){      //max wala part
			
			if(a[i]>max){           // max 0 maan lenege aur fir compare karenge sare values se
				max=a[i];
			}
		}
		
		int min=a[0];
        for(int i=1; i<6; i++){    //min wala part
			
			if(min>a[i]){
				
				min=a[i];
			}
		}
			
			System.out.println("maximum value is" +max);
			
			System.out.println("minimum value is" +min);
		
		
	}
}
