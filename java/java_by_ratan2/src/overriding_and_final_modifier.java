
class parent {

	void marry(){
		System.out.println("black girl");
		}
}	
class overriding_and_final_modifier extends parent{
     void marry(){
    	 System.out.println("cute girl");
     }
	
public static void main(String[] args){
       new overriding_and_final_modifier().marry();
}
}
