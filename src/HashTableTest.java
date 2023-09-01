import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String,Integer> m=new Hashtable<String, Integer>();
		m.put("Rohit", 901);
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

