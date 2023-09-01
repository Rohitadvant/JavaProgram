import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,Integer> m=new <String,Integer>HashMap();
		m.put(null, 901);
		m.put("Siddu", 902);
		m.put("Kanu", 904);
		m.put("Utkarsh", 903);
		m.put("Riddhi", 905);
		System.out.println(m);
		for(Map.Entry m1:m.entrySet()) {
			  System.out.println(m1.getKey()+" "+m1.getValue());    
		}
	}

}
