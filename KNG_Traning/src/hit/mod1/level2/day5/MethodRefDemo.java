package hit.mod1.level2.day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MethodRefDemo {
	public MethodRefDemo() {
		System.out.println("child thread logic is written in this constructor...");
	}
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);		
//		es.execute(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("child thread called...");
//			}
//		});
		//es.execute(new MethodRefDemo()::myThreadMethod);
		es.execute(MethodRefDemo::new);//this will call the constructor logic as run method logic..
		
		System.out.println("main thread called...");
		es.shutdown();
	}
	
	public void myThreadMethod() {
		System.out.println("child thread logic goes here...");
	}
}