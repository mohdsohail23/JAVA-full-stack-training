package Day12;

public class StaticBlockDemo {
	public static void main(String[] args) {
		StaticBlock.met();
		StaticBlock.met2();StaticBlock.met();
		StaticBlock.met2();
		
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
	}
}
class StaticBlock{
	//static blocks are called,before the call to the static methods or object creation of the class
	static {
		System.out.println("static block is called...");
	}
	StaticBlock(){
		System.out.println("cons called....");
	}
	static void met() {
		System.out.println("static method called....");
	}
	static void met2() {
		System.out.println("static method2 called....");
	}
	static void met2() {
		System.out.println("static method2 called....");
	}
}