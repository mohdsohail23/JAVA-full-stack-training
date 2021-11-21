package Day_4;

import java.util.Scanner;

public class Keyboard_Input_Demo_DecimalValue {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a value:");
		
		float f=scan.nextFloat();
		
		System.out.println("the value you have entered is:" +f);
		
		System.out.println((f%2==0)?"Even number":"Odd number");
		if(f>40 && f<60) {
			System.out.println("Second Division");
		}
			else if(f>60 && f<80) {
				System.out.println("First Division");
				}
			else {
				System.out.println("Topper");
			}
	}

}
