package mod1_2.day6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//One object - two threads and two tasks
public class ThreadDemo8 {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new BookingJob(central,"ram",1000));
		es.execute(new BookingJob(central,"rahim",500));
		es.shutdown();
	
	}
}
class BookingJob implements Runnable{
	int amt;ReservationCounter counter;String name;
	public BookingJob(ReservationCounter counter,String name,int amt) {
		this.counter=counter;
		this.name=name;
		this.amt=amt;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(counter) {// object lock
		counter.bookTicket(amt);
		counter.giveChange();		
	}
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket Booked by...:"+name+"..amount is...:"+amt);
		try{Thread.sleep(5005);}catch(Exception e) {}}
	
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to...:"+name+"..amount is...:"+(amt-100));
		try {Thread.sleep(2002);} catch(Exception e) {}
	}
}
