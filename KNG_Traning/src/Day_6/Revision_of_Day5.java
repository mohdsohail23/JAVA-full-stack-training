package Day_6;

import java.util.Scanner;

public class Revision_of_Day5 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter x value..:");
		int x=scan.nextInt();
		System.out.println("Please enter y value..:");
		int y=scan.nextInt();
		
		int add=x+y;
		System.out.println("Addition..:"+add);
		int sub=x-y;
		System.out.println("Subtraction..:"+sub);
		int mul=x*y;
		System.out.println("mul..:"+x*y);
		int div=x/y;//quotient
		System.out.println("div..:"+div);
		int reminder=x%2;//reminder
		System.out.println("Reminder...:"+reminder);
		
		System.out.println(x);//normal value will be printed
		System.out.println(x++);//this will first print and then increment
		System.out.println(x);//this will print incremented value
		System.out.println("*********************************");
		System.out.println(x);
		System.out.println(++x);//this will first increment and then print
		System.out.println(x);
		//x=x+1;
		System.out.println("********************************");
		System.out.println(x);//normal value will be printed
		System.out.println(x--);//this will first print and then decrement
		System.out.println(x);//this will print decremented value
		System.out.println("*********************************");
		System.out.println(x);
		System.out.println(--x);//this will first decrement and then print
		System.out.println(x);
		
		//x=x+5;
		x+=5;
		System.out.println(x);
		
		
		//Relational Operators
		//==, <, >, <=, >=, !=
		//Relational operators always return a boolean
		
		boolean boo=(x%2!=0);
		System.out.println(boo);
		System.out.println(20<=20 || 10>20);
		
		if(x%2==0) {
			System.out.println("Even Number............");
		}
		else {
			System.out.println("Odd Number................");
		}
		
		switch(x%2) {
			case 0:{
				System.out.println("Even");
				break;
			}
			case 1:{
				System.out.println("Odd");
				break;
			}
		}
		String Result=(x%2==0)?"Evenn":"Oddd";
		
		System.out.println("Result....:"+Result);
	}
}
