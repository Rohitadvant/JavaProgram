package Practice2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue q= new LinkedList();
		q.add("Rohit");
		q.add("Pallavi");
		q.add("Kanu");
		q.add("Riddhi");
		q.add("Utkarsh");
		Iterator it=q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
