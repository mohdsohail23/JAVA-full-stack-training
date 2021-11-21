package mod1_2.day8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo6 {

	public static void main(String[] args) {
		Set set=new HashSet();
		set=new TreeSet();
		
		set.add("bb");
		set.add("aa");
		set.add("YY");
		set.add("cc");
		
		System.out.println(set);
	}

}
