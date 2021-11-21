package mod1_2.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo13 {
	public static void main(String[] args) {
		Frog frog=new Frog();
		Crane crane=new Crane();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new DeadLockJob(crane,frog,"crane"));
		es.execute(new DeadLockJob(crane,frog,"frog"));
		
		es.shutdown();
	}
}
class DeadLockJob implements Runnable{
	Crane c;Frog f;String name;
	public DeadLockJob(Crane c,Frog f,String name) {
		this.c=c;
		this.f=f;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("crane")) {
			c.eat(f);
		}
		else {
			f.escape(c);
		}
	}
}
class Crane{
	synchronized public void eat(Frog f) {
		System.out.println();
		f.leaveCrane();
	}
	synchronized public void leaveFrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane c) {
		c.leaveFrog();
	}
	synchronized public void leaveCrane() {
		
	}
}
