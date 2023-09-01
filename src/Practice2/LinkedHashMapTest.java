package Practice2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		m.put("Rohit",1);
		m.put("Kanu",3);
		m.put("Utkarsh", 2);
		m.put("Renu", 4);
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
