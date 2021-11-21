package Day_4;

import java.util.Scanner;

public class Keyboard_Input_Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a value:");
		
		int i=scan.nextInt();
		
		System.out.println("the value you have entered is:" +i);
		
		System.out.println((i%2==0)?"Even number":"Odd number");
		if(i>40 && i<60) {
			System.out.println("Second Division");
		}
			else if(i>60 && i<80) {
				System.out.println("First Division");
				}
			else {
				System.out.println("Topper");
			}
	}

}
