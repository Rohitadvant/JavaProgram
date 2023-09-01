import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set s=new TreeSet();
		s.add(null);
		s.add(1);
		s.add(5);
		s.add(8);
		s.add(3);
		s.add(2);
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			}
	}
