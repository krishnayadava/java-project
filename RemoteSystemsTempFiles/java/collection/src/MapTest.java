import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class MapTest {
	
	public static void main(String[]args){
		
		HashMap map= new HashMap();
		
		map.put("ram", 101);
		map.put("ramesh", 102);
		map.put("ramu", 103);
		map.put("rampal", 104);
		map.put("ramganga", 105);
		
		
		Set s=map.keySet();
		System.out.println(s);
		
		Collection c=map.values();
		System.out.println(c);
		
		
	}

}
