package Day15;

public class GeneralizationDemo3 {
	public static void main(String[] args) {
		Pizza pizza=new DominoPizza();
		//pizza.shape="zig zag";
		System.out.println("Pizaa's shape is:" + pizza.shape);
		
		pizza.cookPizza();
		
	}
}
//When I declare a parent or super class the rules are
//1. The super class should be abstract
//2. All variables I declare should be final
//3. All business methods I declare should be final.
abstract class Pizza{
	//when I declare a variable final, the variable value cannot be changed.
	final String shape="circle";
	
	//when I declare a method final, the method cannot be redeclared in sub class
	final public void cookPizza() {
		System.out.println("Pizaa will be cooked in an oven");
	}
}
class DominoPizza extends Pizza{
	
}
class PizzaHut extends Pizza{
	
}
class McDonald extends Pizza{
	
}
