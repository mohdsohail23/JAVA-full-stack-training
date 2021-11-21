package Day_6;

import java.util.Scanner;
public class Looping_construct {

		public static void main(String[] args) {
			//My objective is to print n even numbers.
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a n number..:");
			int n=scan.nextInt();
			
			System.out.println("looping starts..............");
			while(n>0) {//untill the expression returns true the loop will continue...while is a precheck loop
				if(n%2==0) {
					System.out.println(n+" is even number....");
				}
				--n;
			}
			System.out.println("looping ends.............");
			
			n=10;
			do {
				if(n%2!=0) {
					System.out.println(n+" is odd number....");
				}
				--n;
			}while(n>0);
			for(int i=0;i<10;i++) {
				if(i%2==0) {
					System.out.println("Even number...."+i);
				}
			}
			n=10;
			for(;n>0;n--) {
				if(n%2!=0) {
					System.out.println("Odd number...."+n);
				}
			}
			for(int x=0,y=10; x<10 && y>0; x++,y--) {
				System.out.println(x+":"+y);
			}
		}
}
