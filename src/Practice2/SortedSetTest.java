package Practice2;


import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		SortedSet<Integer> s=new TreeSet<Integer>();
		s.add(211);
		s.add(2);
		s.add(32);
		s.add(42);
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		}

	}


