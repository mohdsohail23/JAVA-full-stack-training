package Day15;

public class GeneralizationDemo {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint=new RedPaint();
		brush.paint=new BluePaint();
		//Paint paint=new Paint();
	}
}
class PaintBrush{
	Paint paint;
}
//common nouns are abstract in nature
//abstract class objects cannot be created
//but still abstract classes can have constructors
abstract class Paint{
	public Paint() {
		System.out.println("Paint class constructor called.....");
	}
}
class RedPaint extends Paint{
	public RedPaint() {
		System.out.println("red paint constructor called...");
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		System.out.println("blue paint constructor called...");
	}
}

