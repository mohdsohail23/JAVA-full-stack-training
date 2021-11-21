package Day_4;

public class Conditional_demo {

	public static void main(String[] args) {
		int i=300;
		
		if(i%2==0) {
			System.out.println("Even number.................");
		}
		else {
			System.out.println("Odd number..............");
		}
		// ? - ternary operator
		System.out.println((i==100)?"i is equal to 100":"i is not equal to 100...");
		
		System.out.println((i%2==0)?"Even Number....":"Odd Number.....");
		
		
		if(i==200) {
			System.out.println("i value is 200");
		}
		else if(i<200) {
			System.out.println("i value is lesser than 200");
		}
		else if(i>400) {
			System.out.println("i value is greater than 400");
		}
		else {
			System.out.println("none of the conditions satisfied...");
		}
		
	}
}

