package Assignment_1;

import java.util.Scanner;

public class Even_or_odd_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner User = new Scanner(System.in);
System.out.println("Enter a number: ");
int number= User.nextInt();
if (number%2==0) {
System.out.println("The given number is: Even");
}
else {
	System.out.println("The given number is: Odd");
	}
}
}

