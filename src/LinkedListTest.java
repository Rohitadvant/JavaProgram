import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		List lst=new LinkedList();
		lst.add("Java");
		lst.add(2);
		lst.add('a');
		lst.add("Python");
		System.out.println(lst);
		System.out.println(lst.size());
		ListIterator<Object> listr=lst.listIterator();
		while(listr.hasNext()) {
			System.out.println(listr.next());
		}
		
		while(listr.hasPrevious())
			System.out.println(listr.previous());
		}
		

	}

