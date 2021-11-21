package mod1_day1;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		new ExceptionDemo2().met();
		try {
			new Temp().tempMet();
		}catch(Exception e) {}
	}
	public void met() {
		try {
			wait(100);
		}catch(Exception e) {
			
		}
	}
}
class Temp{
	public void tempMet()throws Exception {
		
	}
}
/*
 * throws does two things.
 * 1. it conveys to the caller of the method that the method is capable of throwing an exception
 * so the compiler will not allow the caller to leave the code without try catch.
 *
 * 2. It can also bypass the compilation check of throws - checked exception
 */