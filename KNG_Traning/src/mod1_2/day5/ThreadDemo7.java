package mod1_2.day5;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadDemo7 {
	public static void main(String[] args)throws Exception {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyJob3());
		System.out.println("main thread called...");
		
	Future f= es.submit(new MyJob4());
	System.out.println("The value returned is...:"+f.get());
		System.out.println("main thread called..");
		
		es.shutdown();
	}
}
class MyJob4 implements Callable{//fire and wait
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		try {Thread.sleep(1000);}catch(Exception e) {}
		return "hello world...";
	}
}
class MyJob3 implements Runnable{//fire and forget
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}