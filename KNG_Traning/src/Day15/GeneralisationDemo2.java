package Day15;

public class GeneralisationDemo2 {
	public static void main(String[] args) {
		Paint paint=new Paint();
		brush.paint=new RedPaint();
		brush.paint=new BluePaint();
		//Paint paint=new Paint();
	}
}
class paint{
	Paint paint;
}
//common nouns are abstract in nature
//abstract class objects cannot be created
//but still abstract classes can have constructors
//you cannot have multiple inheritance
//but you can have multi level inheritance...
abstract class Liquid{}
abstract class Paint extends Liquid{
	public Paint() {
		System.out.println("Paint class cons called.....");
	}
}
abstract class Milk{
	
}
class RedPaint extends Paint{
	public RedPaint() {
		System.out.println("red paint construcor called...");
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		System.out.println("blue paint constructor called...");
	}
}