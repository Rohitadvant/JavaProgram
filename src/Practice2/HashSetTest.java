package Practice2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
	Set s=new HashSet();
	s.add(21);
	s.add(2);
	s.add(32);
	s.add(4);
	Iterator it=s.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}
}
