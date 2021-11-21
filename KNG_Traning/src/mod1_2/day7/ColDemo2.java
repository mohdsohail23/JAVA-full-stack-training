package mod1_2.day7;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class ColDemo2 {
	public static void main(String[] args) {
		Vector v=new Vector();
		//vector methods are by default SYNCHRONIZED so they are thread safe
		
		v.add("hello");
		v.add("hai");
		
		System.out.println(v.get(0));
		for(Object o:v) {
			System.out.println(o);
		}
		
		Iterator iter=v.iterator();
		//v.add("johny");
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
}vo