package Day13;
/*
 * complex types
 * constructor
 * instance variable
 */
public class StaticDemoRevision {
	public static void main(String[] args) {
		Bottle violetBottle=new Bottle(new Colour("violet bottle"));
		//violetBottle.colour=new Colour();
		
		Bottle blueBottle=new Bottle(new Colour("blue bottle"));
		//blueBottle.colour=new Colour();
		
		System.out.println(violetBottle.colour.colour);
		System.out.println(blueBottle.colour.colour);
	}
}
class Bottle{
	Colour colour;//instance variable
	Bottle(Colour colour){
		this.colour=colour;
	}
}
class Colour{
	String colour;
	Colour(String colour){
		this.colour=colour;
	}
}