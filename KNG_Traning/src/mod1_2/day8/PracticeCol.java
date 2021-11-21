package mod1_2.day8;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Vector;

public class PracticeCol {
public static void main(String[] args) {
	Queue queue=new LinkedList();
	Vector v=new Vector();
	//vector methods are by default SYNCHRONIZED so they are thread safe
	
	queue.add("11");
	queue.add("22");
	queue.add("33");
	queue.add("44");
	
	System.out.println(queue);
	System.out.println(queue.peek());
	System.out.println(queue);
	System.out.println(queue.poll());
	System.out.println(queue);
	queue.remove();
	System.out.println(queue);
	queue.remove("44");
	System.out.println(queue);
	queue.add("LL");
	queue.add("MM");
	queue.add("NN");
	Iterator iter= queue.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	System.out.println(queue);
	
	v.add("hello");
	v.add("hai");
	
	System.out.println(v.get(0));
	for(Object o:v) {
		System.out.println(o);
	}
	
	Iterator iter1=v.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	ListIterator liter=v.listIterator();
	
	Enumeration e=v.elements();
	v.add("johny");
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
