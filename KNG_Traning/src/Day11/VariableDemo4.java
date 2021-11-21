package Day11;
/*
 * Variables can also be simple type or complex type
 * ex: byte,short,int,long,float,double,boolean - simple types, including String
 * for complex types
 * Any class written is a complex type
 *
 * ** You cannot declare a static variable inside a method....
 * ** this key word cannot be used inside a static method..
 * ** static variables can be accessed inside static methods
 */
public class VariableDemo4 {
	int k=10;
	static int kk=20;
	public void met() {
		System.out.println(k);
		System.out.println(kk);
	}
	public static void main(String[] args) {
		//System.out.println(k);
		System.out.println(kk);
		VariableDemo4 obj=new VariableDemo4();
		System.out.println(obj.k);
		TRoom room1=new TRoom();
		
		TRoom.western=new Toilet();
		room1.sanyo=new Projector();
		
		System.out.println(room1.sanyo+":"+TRoom.western);
		
		TRoom room2=new TRoom();
		System.out.println(room2.sanyo+":"+TRoom.western);
		
		System.out.println("HashCode of room1..:"+room1.hashCode());
		System.out.println("HashCode of room2..:"+room2.hashCode());
	}
}
class TRoom{
	// the  below are complex types
	Projector sanyo;
	static Toilet western;
	
}
class Projector{
	
}
class Toilet{
	
}