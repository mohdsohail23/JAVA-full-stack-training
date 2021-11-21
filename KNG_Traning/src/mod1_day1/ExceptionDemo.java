package mod1_day1;

public class ExceptionDemo {
public static void main(String[] args) {
	System.out.println("Before exception");
	try {
		int i=1/Integer.parseInt(args[0]);
	}catch(ArithmeticException e) {
		System.out.println("Don't divide a number by zero");
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Please enter a value in command line...");
}catch(NumberFormatException ne) {
	System.out.println("please enter a valid  number...");
}catch(Exception e) {
	System.out.println("unknown exception handle with care...");
}
finally {
	System.out.println("finally called....");
}
System.out.println("After Exception");
}
}
/*
 * Finally block always gets executed...
 * whether an exception arises or not
 * whether an exception is handled or not
 * finally is always called..
 */
