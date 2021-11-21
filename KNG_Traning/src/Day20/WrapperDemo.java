package Day20;
public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * for every primitive type in java , we have a corresponding wrapper class
		 *
		 * int - Integer
		 * byte - Byte
		 * long - Long
		 * char - Character
		 * boolean - Boolean
		 *
		 * Why we need them ?
		 * Simple types are not objects, so when some application is expecting only objects then
		 * you can use the wrapper
		 * Lot of utility methods are there is wrapper classes, which may be of use
		 * Difference
		 * When you use primitive, only value copy alone is created in stack
		 * but when you use wrapper, it creates an extra object (which is not good)
		 */
		//utility methods
		System.out.println(Integer.MIN_VALUE+":"+Integer.MAX_VALUE);
		System.out.println(Integer.max(10,20));
		System.out.println(Integer.min(10,20));
		System.out.println(Integer.compare(-10,20));//return 0 if equal or -1 if the first value is lower
		String n1=args[0];
		String n2=args[1];
		System.out.println(n1+n2);//concatenation of two strings..
		int x=Integer.parseInt(n1);
		int y=Integer.parseInt(n2);
		System.out.println(x+y);//addition of two numbers.
		
		//autoboxing and autounboxing - this feature was introduced after jdk5
		Integer innn=new Integer(30);//this is deprecated
		int nnnn=(int)innn;//this is old manual unboxing
		
		Integer ii=Integer.valueOf(10);//this is latest
		int n=ii;//auto unboxing
		Integer iii=n;//auto boxing
	}
}

//run as configration to pass the n1 and n2 value