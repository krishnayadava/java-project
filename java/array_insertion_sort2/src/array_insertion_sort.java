import java.util.Scanner;

class array_insertion_sort {

	
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		int a[]= new int [5];
		int i;
		for(i=0; i<5; i++){
			System.out.print("enter the value : ");
			     a[i] = input.nextInt();
		}
		
		for(i=1; i<5; i++) {  //
			
			int key = a[i];             //yaha second element ko pakad rhe..
			for(int j=i-1; j>=0; j--) { // yaha pehla element j-1 le rhe.
				if(key < a[j]) {       // second ko pehle se compare kr rhe
					a[j+1] = a[j];
					a[j] = key;
				}
			}  
		}
		for(int j=0; j<5; j++){
		System.out.print(a[j]);
	}}
}

// pehle 2 nd element ko pakad k usk ek kam yaani i = j-1 se compare karenge aur fir
//check kareneg k agla chota h ya bada....chota huato shift kr denge..