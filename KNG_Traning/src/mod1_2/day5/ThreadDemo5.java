package mod1_2.day5;

public class ThreadDemo5 {
	public static void main(String[] args) throws Exception{
		Thread t=new Thread(new MyJob());
		t.start();
		Thread.sleep(100);
	System.out.println("main thread running....");	

		for(int i=0;i<50;i++) {
			System.out.print(i+"\t");
		}
		while(true) {
		//System.out.println("main thread...");
}
class MyJob implements Runnable{
	public void run() {
		//System.out.println("child thread called....");
	}
}
	}	
}
