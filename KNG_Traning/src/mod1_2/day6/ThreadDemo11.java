package mod1_2.day6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo11 {
	public static void main(String[] args) {
		ClassLockDemo obj=new ClassLockDemo();
		ClassLockDemo obj2=new ClassLockDemo();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new ClassLockJob(obj,"ramu",1000));
		es.execute(new ClassLockJob(obj2,"somu",500));
		es.shutdown();
	}
}
class ClassLockJob implements Runnable{
	ClassLockDemo obj;String name;int amt;
	public ClassLockJob(ClassLockDemo obj,String name,int amt) {
		this.obj=obj;this.name=name;this.amt=amt;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(ClassLockDemo.class) {
			ClassLockDemo.met1(amt);
			ClassLockDemo.met2();
		}
	}
}
class ClassLockDemo{
	static int ii;
	 public static void met1(int i) {
		String name=Thread.currentThread().getName();
		ii=i;
		System.out.println("Met 1 called by...:"+name+"...."+i);
		try {Thread.sleep(100);}catch(Exception e) {}
	}
	 public static void met2() {
		String name=Thread.currentThread().getName();
		System.out.println("The value of i is...:"+(ii-100)+"..."+name);
	}
}