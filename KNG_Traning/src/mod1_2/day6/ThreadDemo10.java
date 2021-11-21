package mod1_2.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo10 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		TrainingRoom tr1=new TrainingRoom();
		TrainingRoom tr2=new TrainingRoom();
		es.execute(new TrainingJob(tr1,"ram"));
		es.execute(new TrainingJob(tr2,"sham"));
		es.shutdown();
	}
}
class TrainingJob implements Runnable{
	TrainingRoom tr;String name;
	public TrainingJob(TrainingRoom tr,String name) {
		this.tr=tr;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(tr) {
		if(name.equals("ram")) {
			TrainingRoom.toilet();
		}
		else {
			TrainingRoom.toilet2();
		}
		}
	}
}
class TrainingRoom{
	 public static void toilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the toilet1....");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" has come out of toilet1...");
	}
	 public static void toilet2() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the toilet2....");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" has come out of toilet2...");
	}
	
}
