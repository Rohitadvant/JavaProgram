package Practice2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuetest {

	public static void main(String[] args) {
		Queue q=new PriorityQueue<>();
		q.add(10);
		q.add(15);
		q.add(13);
		q.add(2);
		//Iterator it=q.iterator();
		while(q.peek()!=null)
		{
		System.out.println(q.poll());
		}
		}
	}

