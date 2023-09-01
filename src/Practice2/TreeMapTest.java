package Practice2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map m=new TreeMap();
		m.put("Rohit", 1);
		m.put("Pallavi", 2);
		m.put("Utkarsh", 3);
		m.put("Kanu", 4);
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
