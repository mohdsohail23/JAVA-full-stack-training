package mod1_2.day8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PracticeCompareTo {

	public static void main(String[] args) {
		String s1="y";
		String s2="z";
		
		System.out.println(s2.compareTo(s1));

		List list=new LinkedList();
		list.add(new Student(1,"AbdulMajeed"));
		list.add(new Student(2,"AbdulHameed"));
		list.add(new Student(3,"AbdulAzeez"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
