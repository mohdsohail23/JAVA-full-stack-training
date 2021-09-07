package Hackathon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassLockDemo {
	public static void main(String[] args) {
		WeldingRobot Mark1=new WeldingRobot();
		Mark1.setname("MARK1");
		
//		WeldingRobot Mark2=new WeldingRobot();
//		Mark2.setname("MARK2");
		
		ExecutorService es=Executors.newFixedThreadPool(2);
	    es.execute(new WeldingJob(Mark1, "Harrier", new ChassisNumber2()));
	    es.execute(new WeldingJob(Mark1, "Safari", new ChassisNumber2()));
	    
//	    es.execute(new WeldingJob(Mark2, "Safari", new ChassisNumber2()));
	    es.shutdown();
	}
}
class WeldingJob implements Runnable{
	ChassisNumber2 ChassisNo;
	WeldingRobot Robot;
	String ModelName;
	public WeldingJob(WeldingRobot Robot,String ModelName,ChassisNumber2 ChassisNo) {
		this.Robot=Robot;
		this.ModelName=ModelName;
		this.ChassisNo=ChassisNo;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(ModelName);
		synchronized (WeldingRobot.class) {
			Robot.doWelding(ChassisNo);
		}
	}
}
class WeldingRobot{
	String name;
	public void setname(String name) {
		this.name=name;
	}
	public void getname() {
		System.out.println(name);
	}
	public void doWelding(ChassisNumber2 chassisNo) {
		Thread T=Thread.currentThread();
		String ModelName=T.getName();
		System.out.println("Welding of chassis no. "+chassisNo+" for model "+ModelName+" is under process at robot "+name+" .....");
		try {Thread.sleep(4000); }catch(Exception e) {}
		System.out.println("Chassis no. "+chassisNo+" for "+ModelName+" and is Ready to dispatch.");
    }
}
class ChassisNumber{
	@Override
	public String toString() {
		return "#"+hashCode();
	}
}