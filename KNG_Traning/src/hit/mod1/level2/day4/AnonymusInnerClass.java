package hit.mod1.level2.day4;

public class AnonymusInnerClass {
	public static void main(String[] args) {
	//	Kalimark.CampaCola cola=new Kalimark().new CampaCola();
		
		//Kalimark.CampaCola cola=new Kalimark.CampaCola();//for instantiating a static inner class
		Pepsi pepsiCo=new Pepsi();
		Kalimark kali=new Kalimark();
		kali.makeCola();
		//pepsiCo.makeCola(cola);
		//kali.makeCola(cola);
	}
}
abstract class Cola{
	public abstract void makeCola();
}
class Pepsi {
	//public void makeCola(Kalimark.CampaCola cola) {
	public void makeCola(Kalimark kali) {
		//kali.thief().makeCola();;
		//cola.makeCola();
		System.out.println("Pepsi fills campa cola cola in a pepsi bottle and sells");
	}
}
//class Kalimark{
//	int money=1000;
//	public void canteen() {
//		
//	}
//	public void makeCola(CampaCola cola) {
//		cola.makeCola();
//		System.out.println("kalimark fills campa cola cola in bovonto bottle and sells");
//	}
//	class CampaCola extends Cola{
//		@Override
//		public void makeCola() {
//			System.out.println(money);
//			canteen();
//			System.out.println("campa cola makes cola....");	
//		}
//	}
//}
//class Kalimark{
//	static int money=1000;
//	static public void canteen() {
//		
//	}
//	public void makeCola(CampaCola cola) {
//		cola.makeCola();
//		System.out.println("kalimark fills campa cola cola in bovonto bottle and sells");
//	}
//	static class CampaCola extends Cola{
//		@Override
//		public void makeCola() {
//			System.out.println(money);
//			canteen();
//			System.out.println("campa cola makes cola....");	
//		}
//	}
//}
class Kalimark{
	static int money=1000;
	static public void canteen() {
		
	}
	public void makeCola() {
//		class CampaCola extends Cola{
//			@Override
//			public void makeCola() {
//				System.out.println(money);
//				canteen();
//				System.out.println("campa cola makes cola....");	
//			}
//		}
//		new CampaCola().makeCola();
		new Cola() {		
			@Override
			public void makeCola() {
				System.out.println("kalimark is making cola using the formula of campacola....");	
			}
		}.makeCola();
		System.out.println("kalimark fills campa cola cola in bovonto bottle and sells");
	}
	
//	public Cola thief() {
//		return new CampaCola();
//	}
}