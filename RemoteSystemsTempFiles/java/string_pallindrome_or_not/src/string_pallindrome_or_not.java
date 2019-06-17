import java.util.*;
class string_pallindrome_or_not {
	
	public static void main(String[]args){
		int i=0; int j;
		
		
		
		   Scanner input= new Scanner(System.in); //initilaising for takig input
		
		   System.out.println("enter the string "); // input string lene k liye
		      
		      String s=input.nextLine();  //string input k liye
	           
		        
		    
		    
		              
		
	           char  b[]=s.toCharArray();      //ab char array me store kra diya string ko
	           
	                                          
		  
	           int p=b.length;
	
              for(i=0; i<p/2; i++){  // p/2 times is he comapre kr payenge
                                     // agar 6 value hai to 3 compare hoga              
            	  if(b[i]!=b[p-1-i]){ //compare karenge first aur last element ko
            		  
            		  System.out.println("the value is not pallindrom");
            		  break;
              }
              }
              
              if (i==p/2){  // ye is liye kyuki agar sara compare ho gya tabhi ye equal hoga..
            	  System.out.println("the value is pallindrom");
              }
              
            
            	  
              }
              
              
              
          }
		
	