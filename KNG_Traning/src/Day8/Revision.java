package Day8;

import java.util.Scanner;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//if and ternary - both accept boolean
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a value..:");
			int x=scan.nextInt();
			boolean b=x>=10;
			if(b) {
				System.out.println("true called....");
			}
			else {
				System.out.println("false called...");
			}
			
			String result=(b)?"ternary true called...":"ternary false called..";
			System.out.println(result);
			
			switch(x%2) {
			case 0:{
				System.out.println(" case 0");
				break;
			}
			case 1:{
				System.out.println("case 1");
			}
			}
			//while - pre-condition - in a cinema hall the ticket is checked before you enter
			//do-while - post condition - in a train the passengers are allowed to board the train
			//and checking of ticket is done later.
//			boolean value=x<10;
//			while(x<10) {//pre conditional check
//				x++;
//				System.out.println("while loop true called....:"+x);			
//			}
//			
//			do { //post conditional check
//				System.out.println(" do while loop called....."+x);
//			}while(x<10);
//			
			for(int y=2;y<10; ++y) {//for(initialization;condition;increment/decrement)
				System.out.println("for loop....:"+x);			
			}
			
			for(int i=0;i<5;i++) {//this loop will run 5 times
				for(int j=0;j<5;j++) {// this will also run 5 times for every outer for loop iteration
					System.out.print("*"+"\t");
				}
				System.out.println();
			}
			
			for(int i=0;i<10;i++) {
				if(i%2==0) {
					continue;
				}
				System.out.println(i);
			}
		}
	}
