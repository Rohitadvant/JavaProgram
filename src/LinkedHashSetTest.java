import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {

Set s=new LinkedHashSet();
s.add(null);
s.add(null);
s.add(9);
s.add(1);
s.add(1);
System.out.println(s);
Iterator it=s.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
