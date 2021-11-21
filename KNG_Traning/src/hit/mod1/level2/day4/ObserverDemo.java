package hit.mod1.level2.day4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObserverDemo {
	public static void main(String[] args) {
		Speaker bose=new Speaker();
		FireAlarm shakthi=new FireAlarm();
		Students knights=new Students();
		Teacher shoiab=new Teacher();
		
		
		shakthi.addObserver(knights);
		shakthi.addObserver(shoiab);
		
		bose.addObserver(shoiab);
		bose.addObserver(knights);
		
		bose.announcement();
		shakthi.alarm();
	}
}
class Speaker extends MyObservable{
	public void announcement() {
		setChanged();
		notifyObservers("Oct 2nd is Gandhi Jayanthi..we celebrate jayanthi by not taking holiday");
	}
}
class FireAlarm extends MyObservable{
	public void alarm() {
		setChanged();
		notifyObservers("Fire in the mountain run run run.......");
	}
}
class Students implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof FireAlarm) {
			System.out.println("students running...:"+(String)arg);
		}
		else {
			System.out.println("Students listening..:"+(String)arg);
		}
	}
	
}
class Teacher implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof FireAlarm) {
			System.out.println("Teacher is thinking......");
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println("Teacher running...:"+(String)arg);
		}
		else {
			System.out.println("Teacher listening..:"+(String)arg);
		}
	}
}
class MyObservable extends Observable{
	Vector<Observer> list;ExecutorService es;
	public MyObservable() {
		list=new Vector<Observer>();
		es=Executors.newFixedThreadPool(4);
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		list.add(o);
	}
	
	@Override
	public void notifyObservers(Object arg) {
		Iterator<Observer> iter=list.iterator();
		while(iter.hasNext()) {
			Observer o=iter.next();
			es.execute(new ThreadJob(o,this,(String)arg));
		}
		es.shutdown();
	}
	
}
class ThreadJob implements Runnable{
	Observer obs;String msg;Observable obbs;
	public ThreadJob(Observer obs,Observable obbs,String msg) {
		// TODO Auto-generated constructor stub
		this.obs=obs;
		this.msg=msg;
		this.obbs=obbs;
	}
	@Override
	public void run() {
		obs.update(obbs, msg);
	}
}d