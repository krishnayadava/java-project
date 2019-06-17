
class string_mutable_stringbuffer_string_builder {

	public static void main(String[]args){
		
		StringBuffer s = new StringBuffer("ram"); //mutable matlb jo ek baar diya usko change kr skte hai
		s.append("sita");  //                         // s me append kr de rhe sita,, ab s me krishnasita
		                                               //buffer k jagah builder bhi use kr skte hai
		System.out.println(s);
		System.out.println(s.capacity());
		
	}
}
