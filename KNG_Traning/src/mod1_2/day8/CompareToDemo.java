package mod1_2.day8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class CompareToDemo {
	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		
		System.out.println(s2.compareTo(s1));
		
		List list=new LinkedList();
		list.add(new Student(1,"ram"));
		list.add(new Student(2,"rahim"));
		list.add(new Student(3,"john"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
class Student implements Comparable{
	int sid;
	String sname;
	public Student(int sid, String sname) {		
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public int compareTo(Object o) {
		Student st=(Student)o;
		return st.sname.compareTo(this.sname);
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
