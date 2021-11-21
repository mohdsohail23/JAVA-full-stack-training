package mod1_2.day4;

public class ThreadDemo6 {
public ThreadDemo6() {
	Thread t=new Thread(new MyJob2());
	t.start();}
	public static void main(String[] args) throws Exception {
for (int i=0; i<10; i++) {
	System.out.println(i);
	Thread.sleep(1001);
}
	}
	
	class MyJob2 implements Runnable{
		@Override
		public void run() {
			System.out.println("Child thread called....");
		}
	}
}
