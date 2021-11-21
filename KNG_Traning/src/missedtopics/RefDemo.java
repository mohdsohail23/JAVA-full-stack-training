package missedtopics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class RefDemo {
	public static void main(String[] args)throws Exception {
		PoliceStation p1=new PoliceStation();
		Politician micky=new Politician();
		
		p1.arrest(micky);
		
		
	}
}
class PoliceStation{
	public void arrest(Object suspect) throws Exception{
		Class c=suspect.getClass();
		Field f= c.getField("name");
		System.out.println(f.get(suspect));
		
		Method m=c.getMethod("service");
		m.invoke(suspect);
		tortureRoom(suspect);
	}
	
	public void tortureRoom(Object suspect) throws Exception{
		Class c=suspect.getClass();
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(suspect));
		
		Method m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(suspect);
		
	}
}
class Politician{
	public String name="I am a politician...";
	private String secretName="third grade gunda....";
	
	public void service() {
		System.out.println("I do social service......");
	}
	private void secretService() {
		System.out.println("I kill people for power and money...");
	}
}
