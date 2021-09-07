package Hackathon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassLockDemo2 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
	    es.execute(new WeldingJob2( "Harrier", new ChassisNumber2()));
	    es.execute(new WeldingJob2( "Safari", new ChassisNumber2()));
	    es.shutdown();
	}
}
class WeldingJob2 implements Runnable{
	ChassisNumber2 ChassisNo;
	String ModelName;
	
	public WeldingJob2(String ModelName,ChassisNumber2 ChassisNo) {
		this.ModelName=ModelName;
		this.ChassisNo=ChassisNo;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(ModelName);
		WeldingRobot2.doWelding(ChassisNo);
	}
}
class WeldingRobot2{
	public static void doWelding(ChassisNumber2 chassisNo) {
		synchronized (WeldingRobot2.class) {
		Thread T=Thread.currentThread();
		String ModelName=T.getName();
		System.out.println("Welding of chassis no. "+chassisNo+" for model "+ModelName+" is under process.....");
		try {Thread.sleep(4000); }catch(Exception e) {}
		System.out.println("Chassis no. "+chassisNo+" for "+ModelName+" and is Ready to dispatch.");
		}
	}
}
class ChassisNumber2{
	@Override
	public String toString() {
		return "#"+hashCode();
	}
}
