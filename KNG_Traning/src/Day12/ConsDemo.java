package Day12;

public class ConsDemo {
	public static void main(String[] args) {
		
		//Human.initialization(1000);
		
		Human shoiab=new Human("AAA");//this is at object level
		Human shoiab2=new Human(1000);//this is at object level
		Human.initialization(100);//this is at class level
		shoiab.business();
		shoiab2.business();
	}
}
class Human{
	//A constructor is smillar to a method, but the name should be class name with return or void
	//this constructor is called when the object of Human class is created..
	static int honey;
	Human(){
		
	}
	Human(int honey){
		Human.honey=honey;
		System.out.println("human cons called...");
	}
	Human(String s){
		
	}
	static void initialization(int honey) {
		Human.honey=honey;
		System.out.println("initialization code called...");
	}
	
	public void business() {
		System.out.println("honey honey honey...:"+Human.honey);
	}
}
