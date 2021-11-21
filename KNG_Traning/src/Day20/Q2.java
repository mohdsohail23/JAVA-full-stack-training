package Day20;

public class Q2 {
public static void main(String[] args) {
	Employee e=new Employee("Bob", 48);
	e.calculatePay();
	System.out.println(e.printDetails());
	e=null;
	e=new Employee("Denise",36);
	e.calculatePay();
	System.out.println(e.printDetails());
}
}