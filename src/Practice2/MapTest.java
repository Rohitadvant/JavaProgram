package Practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Object, Object> m=new HashMap<>();
		m.put("Rohit", 1);
		m.put("Pallavi", 2);
		m.put("Utkarsh", 3);
		m.put("Kanu", 4);
		Set set=m.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
