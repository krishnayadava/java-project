import java.util.Scanner;
class hello {
	
	public static void main(String[]args){
		int c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter the first number: ");
		
		int number1 = input.nextInt();
		
		System.out.print("enter the second number: ");
		
		int number2 = input.nextInt();
		
		c= number1 + number2;
		
		System.out.print("sum of two number is :" +c);
	}
}	

		
		
		