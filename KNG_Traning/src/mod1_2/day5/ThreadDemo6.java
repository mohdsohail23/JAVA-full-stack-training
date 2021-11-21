package mod1_2.day5;

public class ThreadDemo6 {
	public ThreadDemo6() {
		Thread t=new Thread(new MyJob2());
		t.start();
	}
	public static void main(String[] args)throws Exception {
		new ThreadDemo6();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
class MyJob2 implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}
