package mod1_2.day6;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class ThreadDemo14 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			
			Luggage luggage=CloakRoom.getLuggage();
			System.out.println("Thread1...:"+luggage);
			
			luggage=CloakRoom.getLuggage();
			System.out.println("Thread1...:"+luggage);
			
		});
		
es.execute(()->{
			
			Luggage luggage=CloakRoom.getLuggage();
			System.out.println("Thread2...:"+luggage);
			CloakRoom.clearLuggage();
			try {Thread.sleep(5000);}catch(Exception e) {}
			luggage=CloakRoom.getLuggage();
			System.out.println("Thread2...:"+luggage);
			
		});
es.shutdown();
	}
}
class CloakRoom{
	private static ThreadLocal<Luggage> tLocal=new ThreadLocal<Luggage>();
	
	public static Luggage getLuggage() {
		Luggage luggage=tLocal.get();
		if(luggage==null) {
			luggage=new Luggage();
			tLocal.set(luggage);
		}
		return luggage;
	}
	
	public static void clearLuggage() {
		Luggage luggage=tLocal.get();
		if(luggage!=null) {
			tLocal.remove();
		}
	}
}
class Luggage{
	
}