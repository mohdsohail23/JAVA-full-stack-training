package mod1_day1;
public class ExceptionDemoRevision {
	public static void main(String[] args) {
		System.out.println("life before exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println(e);	
			System.out.println("you cannot divide a number by zero..maths does not allow this...");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("pleaes pass a number in command line...");
		}
//		catch(NumberFormatException ne) {
//			ne.printStackTrace();
//			System.out.println("you cannot pass a character.....");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("unknown exception...");
//		}
		finally {
			/*
			 * finally is called
			 * whether exception arises or not
			 * whether exception handled or not
			 * finally is always called...
			 */
			System.out.println("finally called...");
		}
		System.out.println("life after exception...");
	}
}