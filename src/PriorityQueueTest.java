import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.add(8);
		q.add(3);
		q.add(9);
		q.add(2);
		q.add(1);
		System.out.println(q);
		while(q.peek()!=null) {
			System.out.println(q.poll());
		}
	}
	}


