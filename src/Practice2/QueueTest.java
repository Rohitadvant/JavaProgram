package Practice2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
	Queue q=new LinkedList();
	q.add(10);
	q.add("Rohit");
	q.add(true);
	q.add('f');
	while(q.peek()!=null)
	{
	System.out.println(q.poll());
	}
	}

}
