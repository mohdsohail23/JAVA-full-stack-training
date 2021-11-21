package Day12;

public class StaticDemo {
	public static void main(String[] args) {
		//static methods are instantiated by the JVM
		//even before the object of the class is created...
		//which means you can call the static method before the object creation
		//StaticMethod.metStatic(1000);
		//StaticMethod.metNormal(); - this is not possible, because metNormal method is not loaded in memory
		StaticMethod obj=new StaticMethod();
		obj.metNormal();
		StaticMethod.metStatic(1000);
		obj.metNormal();
		//obj.metStatic();
		
	}
}
class StaticMethod{
	int money;//this variable will be loaded in memory only when the object of this class is created
	//the above variable cannot be accessed by a static method, because static methods are already in memory
	static int honey;//static methods only access static properties
	//non static variables cannot be accessed by static methods
	
	void metNormal() {
		System.out.println("non static method called..."+honey);
	}
	static void metStatic(int honey) {
		//this.money=1000;//this cannot be used in a static context
		StaticMethod.honey=honey;
		System.out.println("static method called...");
	}
}