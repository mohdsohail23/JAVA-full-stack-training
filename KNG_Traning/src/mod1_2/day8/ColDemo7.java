package mod1_2.day8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class ColDemo7 {
	public static void main(String[] args) {
		Set empSet=new TreeSet(new MyComparator());
		
		empSet.add(new Employee(1, "rahim",20));
		empSet.add(new Employee(2, "ram",22));
		empSet.add(new Employee(3, "john",21));
		empSet.add(new Employee(4, "singh",24));
		
		System.out.println(empSet);
	}
}
class MyComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.compareTo(o1);
	}
}
class Employee implements Comparable<Employee>{
	private int eno;
	private String ename;
	private int eage;
	public Employee(int eno, String ename, int eage) {
		this.eno = eno;
		this.ename = ename;
		this.eage = eage;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public int getEage() {
		return eage;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eage=" + eage + "]\n";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eage-o.eage;
	}
}