package mod1_2.day8;

import java.util.Iterator;
import java.util.Vector;

public class practice2Generic {

	public static void main(String[] args) {
		Vector<Dabba> v=new Vector<>();
		v.add(new Dabba());
		v.add(new Dabba());
		v.add(new Dabba() );
		

		Iterator<Dabba> iter=v.iterator();
		while(iter.hasNext()) {
			Dabba d=iter.next();
			d.enjoy();
		}
	}
}
	class Dabba{
		public void enjoy() {
			System.out.println("dabba enjoyment...");
		}
	}
