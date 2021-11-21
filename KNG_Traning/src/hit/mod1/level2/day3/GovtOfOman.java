package hit.mod1.level2.day3;
import java.util.Observable;
import java.util.Observer;
//Event and Signalling
public class GovtOfOman {
	public static void main(String[] args) {
		Road kingRoad=new Road();
		Satelite kingSatelite=new Satelite();
		
		kingRoad.addObserver(kingSatelite);
		
		kingRoad.accident();
	}
}
class Road extends Observable{
	public void accident() {
		setChanged();
		System.out.println("accident happened...");
		notifyObservers("Accident happened....");
	}
}
class Satelite implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Road) {
			callAmbulance((String)arg);
		}
		
	}
	void callAmbulance(String msg) {
		System.out.println("Accident happened,...come to this spot...");
	}
}