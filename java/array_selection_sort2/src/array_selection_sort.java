import java.util.Scanner;
class array_selection_sort {

	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int a[] = new int [5];
		int i; int j; int k; int min; int loc;
		
		for (i=0; i<5; i++){
			System.out.print("enter the number :");
			 a[i]= input.nextInt();
			}
		
		
		for(i=0; i<4; i++){  //a[0] lega aur sare se ek baar compare krne k liye
			
			for(j=i+1; j<5; j++){
				
			 if(a[i]>a[j]){  //a[0] ko pehle sare elemnts se compare kr rhe
				
				 int temp= a[i];  // agar a[i] bada hai to swap kiya
				 a[i]=a[j];
				 a[j]=temp;      // aur a[j] me store kra diya smallest pehle iteration me
				
			 }
			 }
		}
		
			
	   for(j=0; j<5; j++){
		System.out.print(a[j]);
	}
}
}
