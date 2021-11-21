package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class SpringDemo {
	public static void main(String[] args)throws Exception {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("anno-config.xml");
		ShoeShop shop=ctx.getBean("kss", ShoeShop.class);
		Shoe shoe=shop.sellShoe();
		
		System.out.println("---> "+shoe);
		
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
	@Autowired
	@Qualifier("bsf")
	private ShoeFactory factory;
	public final ShoeFactory getFactory() {
		return factory;
	}
	public final void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}
@Component("bsf")
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
@Component("lsf")
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
@Component("kss")
class KnightsShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}