import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Integer> m=new TreeMap<String,Integer>();
		m.put("Rohit", 901);
		m.put("Siddu", 901);
		m.put("Kanu", 904);
		m.put("Utkarsh", 903);
		m.put("Riddhi", 905);
		System.out.println(m);
		for(Map.Entry m1:m.entrySet()) {
			  System.out.println(m1.getKey()+" "+m1.getValue());    
		}
	}


	}


