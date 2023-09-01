import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		 LinkedHashMap<String,Integer> m=new LinkedHashMap<String,Integer>();
		m.put(null, 901);
		m.put(null, 901);
		m.put("Kanu", 904);
		m.put("Utkarsh", 903);
		m.put("Riddhi", 905);
		System.out.println(m);
		for(Map.Entry m1:m.entrySet()) {
			  System.out.println(m1.getKey()+" "+m1.getValue());    
		}
	}

	}

