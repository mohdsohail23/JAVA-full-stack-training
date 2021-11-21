package Day15;
//method overriding
public class GeneralizationDemo4 {
	public static void main(String[] args) {
		//A obj=new A();
		A obj=new B();
		//obj.i=20;
		System.out.println(obj.i);
		obj.met(1);
		obj.iDontHaveLogic();
	}
}
abstract class A{
	final int i=10;
	final public void met(int i) {
		System.out.println("met of super class A called....");
	}
	//when u declare a abstract method, then the class should be compulsorily declared
	//as abstract, and abstract methods have to compulsorily overriden in the sub class
	abstract public void iDontHaveLogic();
}
class B extends A{
	int i=20;
	//since met method is already declared in parent class, this is called overriding
//	public void met(int i) {
//		System.out.println("met of B called.....");
//	}
	@Override
	public void iDontHaveLogic() {
		System.out.println("logic for i dont have logic abstract method..from sub class..");
	}
}
