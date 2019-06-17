import java.util.Scanner;
class array_finding_largest_and_smallest_from_array {
	
	
	public static void main(String[]args){
		
		int i=0; 
		int large=0;  //initialising large kykui 0 se compare karenge
		
		int a[] =new int [10];
		
		Scanner input = new Scanner(System.in);
		
		for (i=0; i<10; i++){
			
			System.out.print("enter the value : ");
			
			a[i] = input.nextInt();
			
		}
		
		for (i=0; i<10; i++){
			
			if(a[i]>large)  // o se compare karenge aur a k value badi hui to assignn kr denge large me ako
				
				large=a[i];
	    }
		
		System.out.print("largest number is"   +large);
		
	}

}
