import java.util.Scanner;
import java.util.*;
public class ReverseString {
	
	
	public static void main(String[]args){
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("enter the string");
	
	String s= input.nextLine();
	
	       char [] c  = s.toCharArray();
	       
	       for(int i =c.length-1; i>=0; i--){
	    	   
	    	   System.out.print(c[i]);
	    	   
	    	   
	       }
	       
}       }