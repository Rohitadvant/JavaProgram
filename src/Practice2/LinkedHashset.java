package Practice2;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(21);
		s.add(2);
		s.add(32);
		s.add(42);
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		}

	}


