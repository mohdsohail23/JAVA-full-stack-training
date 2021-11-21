package Day11;
/*
 * 1. Class variable - only one copy is created by JVM for all the instances of the class
 * 2. Instance Variable - For every instance of the class, a new copy is created..
 * 3. Local Variable - For every client call a copy is created...
 *
 */
public class VariableDemo3 {
	static int i;//class Variable
	int j;//instance variable.
	int k=3030330;
	
public void met() {
		int k=20;//local variable
		System.out.println(k);
		System.out.println(this.k);
		//this keyword cannot be used inside a static method
	}
	
	public static void main(String[] args) {
		VariableDemo3.i=1010101;
		VariableDemo3 obj1=new VariableDemo3();
		obj1.j=393939;
			System.out.println(obj1.i+":"+obj1.j);
		VariableDemo3 obj2=new VariableDemo3();
			System.out.println(obj2.i+":"+obj2.j);
		VariableDemo3 obj3=new VariableDemo3();
			System.out.println(obj3.i+":"+obj3.j);
			
			obj1.met();
	}
}
