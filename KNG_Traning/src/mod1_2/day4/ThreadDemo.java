package mod1_2.day4;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("I want to make Biryani.");
		
		Thread onionCutter=new Thread(new OnionCuttingJob());
		Thread tomatoCutter=new Thread(new TomatoCuttingJob());
		Thread riceBoiler=new Thread(new BoilBasmathiRice());
		
		onionCutter.start();
		tomatoCutter.start();
		riceBoiler.start();
		
//		new OnionCuttingJob().cutOnions();[old method without thread]
//		new TomatoCuttingJob().cutTomatoes();
//		new BoilBasmathiRice().boilRice();
	}
}
class OnionCuttingJob implements Runnable{
	@Override
	public void run() {
		cutOnions();
	}
	public void cutOnions() {
		System.out.println("onion cutting started...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("onion cutting over...doing some other job now.");
	}
}
class TomatoCuttingJob implements Runnable{
	@Override
	public void run() {
		cutTomatoes();	
	}
	public void cutTomatoes() {
		System.out.println("tomato cutting started...");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("tomato cutting over..doing some other job now.");
	}
}
class BoilBasmathiRice implements Runnable{
	@Override
	public void run() {
		boilRice();
	}
	public void boilRice() {
		System.out.println("boil basmathi rice....");
		try {Thread.sleep(15000);}catch(Exception e) {}
		System.out.println("ammaiya.......rice is boiled....");
	}
}