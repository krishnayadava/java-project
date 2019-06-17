import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
    	
    	int number1 = input.nextInt();
    	
    	System.out.print("Enter an integer: ");
    	
    	int number2 = input.nextInt();
    	System.out.println("You entered " + number1);
    	System.out.println("You entered " + number2);
    }
}