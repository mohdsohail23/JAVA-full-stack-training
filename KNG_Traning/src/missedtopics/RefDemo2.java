package missedtopics;
import java.lang.reflect.Method;
public class RefDemo2 {
	public static void main(String[] args) throws Exception{
		
		//Demo demo=(Demo)Class.forName("missedtopics.Demo").newInstance();
		
		Object demo=Class.forName("missedtopics.Demo").getConstructor(String.class,int.class).newInstance("hello",10);
		
		System.out.println(demo);
		
		Method m=demo.getClass().getDeclaredMethod("met");
		m.setAccessible(true);
		m.invoke(demo);
		
		m=demo.getClass().getDeclaredMethod("met",String.class);
		m.setAccessible(true);
		m.invoke(demo, "hello");
	}
}
class Demo{
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public Demo(String s,int i) {
		System.out.println("over loaded cons called...:"+s+":"+i);
	}
	public void met() {
		System.out.println("met called...");
	}
	public void met(String s) {
		System.out.println("overloaded met called...:"+s);
	}
}