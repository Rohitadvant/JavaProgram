import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(null);
		s.add(null);
		s.add("Kanu");
		s.add("Utkarsh");
		s.add("Riddhi");
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
