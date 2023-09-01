package Practice2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		List l=new LinkedList();
		l.add(100);
		l.add("Pallavi");
		l.add(false);
		l.add('a');
		ListIterator lstr=l.listIterator();
		while(lstr.hasNext()) {
			System.out.println(lstr.next());
		}
		while(lstr.hasPrevious()) {
			System.out.println(lstr.previous());
		}
	}

}
