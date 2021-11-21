package mod1_2.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
public class ColDemo4 {
	public static void main(String[] args) {
		Queue queue=new LinkedList();
		
		queue.add("aaa");
		queue.add("bbb");
		queue.add("ccc");
		queue.add("ddd");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());//this will retrieve and also removes
		System.out.println(queue);
		
		queue.remove();//remove the peek object by default
		System.out.println(queue);
		
		queue.remove("ddd");
		System.out.println(queue);
		queue.add("zzz");
		queue.add("xxx");
		queue.add("yyy");
		Iterator iter= queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(queue);
	}
} 