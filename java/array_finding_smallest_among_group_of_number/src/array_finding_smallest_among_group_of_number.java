import java.util.Scanner;
class array_finding_smallest_among_group_of_number {
	
	
	public static void main (String[]args){
		
		
		int a[] = new int [10];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++){
		System.out.print("enter the number :"  );	
			a[i]=input.nextInt();
			
		}
		
		int min=a[0];
		
		for(int i=1; i<10; i++){
			
			if(min>a[i]){
				
				min=a[i];
			}
			
			
		}
		System.out.print("samllest value is : "  +min);
		
	}

}
