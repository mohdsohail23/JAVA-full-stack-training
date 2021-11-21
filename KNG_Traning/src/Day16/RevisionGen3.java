package Day16;
//code reusability
public class RevisionGen3 {
	public static void main(String[] args) {
		B bObj=new B();
		System.out.println("B obj...:"+bObj.i);
		bObj.met();
		
		A aObj=new B();
		System.out.println("A obj...:"+aObj.i);
		aObj.met();
		
		C cObj=new C();
		System.out.println("C obj...:"+cObj.i);
		cObj.met();
	}

class A{
	public int i=10;//private variables are not available outside the class
	public void met() {
		System.out.println(" A class method....");
	}
}
class B extends A{
	
}
class C extends A{
	
}
}
	

