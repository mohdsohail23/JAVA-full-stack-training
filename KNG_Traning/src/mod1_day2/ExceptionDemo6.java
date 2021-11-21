package mod1_day2;
import java.util.Scanner;
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Child baby=new Child();
		Dog tiger=new Dog();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item..:");
		String item=scan.next();
		
		baby.playWithDog(tiger, item);
	}
}
class Child{
	public void playWithDog(Dog dog,String item) {
		try {
			
			dog.play(item);
			
		}catch(DogBiteException de) {
			System.out.println(de);
			System.out.println("Please take him to hospital.....");	
			
		}catch(DogBarkException dre) {
			System.out.println(dre);
			System.out.println("barking dogs seldom bite....no worries....");
			
		}catch(DogExceptions dee) {
			System.out.println(dee);
			System.out.println("unknown exception...we will study and handle it....");
		}
		finally {
			System.out.println("Thankyou dog.......");
		}
	}
}
class Dog{
	public void  play(String item) throws DogExceptions{
		if(item.equals("stick")) {
			throw new DogBiteException("You beat I bite.....");
		}
		else if(item.equals("stone")) {
			throw new DogBarkException();
		}
	}
}
abstract class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+this.msg;
	}
}
class DogBarkException extends DogExceptions{
	
}