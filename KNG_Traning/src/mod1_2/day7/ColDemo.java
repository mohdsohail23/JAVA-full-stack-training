package mod1_2.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingDeque;

import com.sun.tools.javac.util.List;
public class ColDemo {
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=100;
		
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("The size of array is..:"+arr.length);
		
		//ArrayList list=new ArrayList();
		List list=LinkedList();
		System.out.println("The size of arraylist..:"+list.size());
		list.add("hello");
		list.add(123);
		list.add(new Dabba());
		list.add("hai");
		
		System.out.println("The size of arraylist..:"+list.size());
		list.remove(0);
		System.out.println("The size of arraylist..:"+list.size());
		
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println(list.get(0));
		
		//performance will good compared to for-loop
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//you cannot reuse a iterator
		while(iter.hasNext()) {
			System.out.println("..........."+iter.next());
		}
		//your iterator cursor can be moved back and forth
		ListIterator liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		//you cannot reuse a list iterator
		while(liter.hasPrevious()) {
			System.out.println("*******************"+liter.previous());
		}
	}
}
class Dabba{}