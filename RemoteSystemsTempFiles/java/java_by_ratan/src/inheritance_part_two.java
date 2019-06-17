class Pappu {

	void m(){
		
		System.out.println("parent method executed first");
     	}
}
class baccha extends Pappu{
    void m(){
		
		System.out.println("child class will be printed");
            }
 
	void m2(){
    	
       this.m();  
       super.m();
      	
             }
    
	//class inhertanc{
    public static void main(String[]args){
    	
    	new baccha().m2();
    }
}