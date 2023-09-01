package Practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		List lst=new ArrayList();
		lst.add(11);
		lst.add(10);
		lst.add("Rohit");
		lst.add(true);
//		for(Object obj:lst) {
//			System.out.println(obj);
//		}
		ListIterator it=lst.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		while(it.hasPrevious()) {
			System.out.println(it.previous()); 
		}
	}

}
