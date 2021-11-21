package hit.mod1.level2.day4;

public class InnerClassDemo {
	public static void main(String[] args) {
		Kalimark.CampaCola cola=new Kalimark().new CampaCola();
		Pepsi pepsiCo=new Pepsi();
		Kalimark kali=new Kalimark();
		
		pepsiCo.makeCola(cola);
		kali.makeCola(cola);
	}
}
abstract class Cola{
	public abstract void makeCola();
}
class Pepsi {
	public void makeCola(Kalimark.CampaCola cola) {
		cola.makeCola();
		System.out.println("Pepsi fills campa cola cola in a pepsi bottle and sells");
	}
}
class Kalimark{
	int money=1000;
	public void canteen() {
		
	}
	public void makeCola(CampaCola cola) {
		cola.makeCola();
		System.out.println("kalimark fills campa cola cola in bovonto bottle and sells");
	}
	class CampaCola extends Cola{
		@Override
		public void makeCola() {
			System.out.println(money);
			canteen();
			System.out.println("campa cola makes cola....");	
		}
	}
}
