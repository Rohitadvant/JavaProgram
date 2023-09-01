import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add("Test");
		q.add("Java");
		q.add("Developer");
		q.add("Bangalore");
		System.out.println(q);
		
		while(q.peek()!=null) {
			System.out.println(q.poll());
		}
	}
}

