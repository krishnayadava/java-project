import java.util.*;

import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an char: ");
    	String s1 = input.nextLine();
    	System.out.print("Enter an char: ");
    	String s2 = input.nextLine();
    	System.out.println("You entered " + s1);
    	System.out.println("You entered " + s2);
    }
}