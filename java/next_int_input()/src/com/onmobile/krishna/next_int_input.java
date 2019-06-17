package krishna;
import java.util.Scanner;

class next_int_input {
	
	
    public static void main(String[] args) {
    	
    	next_int_input s = new next_int_input();
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an character: ");
    	
    	String number1 = input.nextLine();
    	
    	System.out.print("Enter an character: ");
    
    	
    	String number2 = input.nextLine();
    	System.out.println("You entered " + number1);
    	System.out.println("You entered " + number2);
    }
}