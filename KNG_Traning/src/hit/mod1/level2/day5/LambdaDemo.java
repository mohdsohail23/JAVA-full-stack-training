package hit.mod1.level2.day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class LambdaDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		es.execute(()->{System.out.println("child thread logic called...");});
		
		System.out.println("main thread is called...");
		es.shutdown();
		Doctor d=()->{System.out.println("curing as per alopathy medicine...");};
		Nurse n=(String name,int age)->{
			if(name.equals("rich")&& age<=30)
				{
					System.out.println("royal care..");
				}
			};	
		d.doCure();
		n.doCare("rich",29);
		
		ATM atm=(amt)->{return amt;};
		System.out.println(atm.withdrawMoney(1000));
	}
	
}
//rule is - lambda and method referencing work only with functional interfaces
@FunctionalInterface
interface Doctor{
	public void doCure();
}
interface Nurse{
	public void doCare(String name,int age);
}
interface ATM{
	public int withdrawMoney(int amt);
}
