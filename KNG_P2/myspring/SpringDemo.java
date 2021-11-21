package myspring;
import java.lang.reflect.Field;
public class SpringDemo {
	public static void main(String[] args)throws Exception {
		ShoeShop shop=MySpringContainer.getShoeShop();
		
		Shoe shoe=shop.sellShoe();
		
		System.out.println(shoe);
	}
}
class MySpringContainer{
	public static ShoeShop getShoeShop()throws Exception {
		ShoeShop shop=new KnightsShoeShop();
		Class c=shop.getClass().getSuperclass();
		Field f= c.getDeclaredField("factory");
		f.setAccessible(true);
		Inject in=f.getAnnotation(Inject.class);
		if(in!=null) {
			String factoryclass=in.qualifier();
			ShoeFactory factory=(ShoeFactory)Class.forName(factoryclass).getConstructor().newInstance();
			//dependency injection - springs dependency injection concept
			shop.setFactory(factory);
		}
		return shop;
	}
}
abstract class Shoe{
	
}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}
interface Seller{
	public Shoe sellShoe();
}
interface Manufacturer{
	public Shoe makeShoe();
}
abstract class ShoeFactory implements Manufacturer{
	public ShoeFactory() {
		// TODO Auto-generated constructor stub
	}
}
abstract class ShoeShop implements Seller{
	@Inject(qualifier = "myspring.BataShoeF actory")
	private ShoeFactory factory;
	public final ShoeFactory getFactory() {
		return factory;
	}
	public final void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}
class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new SportsShoe();
	}
}
class KnightsShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}