class overlaoding_constructor {
	
	overlaoding_constructor(){
		
		System.out.println("0 argument constructor executed");
		}
	overlaoding_constructor(int a){
		System.out.println("1 argument constructor executed");
	}

	public static void main(String[]args){
		
		new overlaoding_constructor(10);
		new overlaoding_constructor();
		
	}
}