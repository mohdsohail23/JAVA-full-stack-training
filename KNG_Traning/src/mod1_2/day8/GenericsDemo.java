package mod1_2.day8;
import java.util.Iterator;
import java.util.Vector;
public class GenericsDemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("hello");
		v.add("helllllll");
		v.add("aajjaja");
		
		Iterator<String> iter=v.iterator();
		while(iter.hasNext()) {
			String d=iter.next();
			System.out.println(d);
		}
		
	}
}


