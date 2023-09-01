import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList lst=new ArrayList();
	lst.add("Java");
	lst.add(2);
	lst.add('a');
	lst.add("Python");
	System.out.println(lst);
//	for(Object o:lst) {
//		System.out.println(o);
//	}
//	Iterator<Object> it=lst.iterator();
//	while(it.hasNext())
//	System.out.println(it.next());
	ListIterator<Object> listr=lst.listIterator();
	while(listr.hasNext()) {
		System.out.println(listr.next());
	}
	
	while(listr.hasPrevious())
		System.out.println(listr.previous());
	}
	
	}

