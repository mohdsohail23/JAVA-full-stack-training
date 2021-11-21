package Day16;
public class RevisionGen5 {
	public static void main(String[] args) {
		Sub1 s1Obj=new Sub1();
		System.out.println("Sub1....:"+s1Obj.i);
		s1Obj.met(12);
		
		Super sup=s1Obj;
		System.out.println("Super class...:"+sup.i);
		sup.met(13);
		
		Sub2 s2Obj=new Sub2();
		System.out.println("Sub2....:"+s2Obj.i);
		s2Obj.met(14);	
	}
}
class Super{
	int i=10;
	public void met(int l) {
		System.out.println("super class method....."+l);
	}
}
class Sub1 extends Super{
	int i=20;//overriden the i of super class
	public void met(int ss) {
		System.out.println("sub1 class method called.....");
	}
}
class Sub2 extends Super{
	
}
