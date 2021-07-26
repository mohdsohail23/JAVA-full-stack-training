package LabActivity_week2;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int c=5 ;	
		do{
			int Sum=0;
		System.out.println("Please Enter any Number to check wether its a Perfect Number or Not: ");
		Scanner scan = new Scanner(System.in);	
		int num = scan.nextInt();
		for(int i = 1 ; i < num ; i++) {
			if(num % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == num) {
			System.out.println(num+" is a Perfect Number");
		}
		else {
			System.out.println(num+" is NOT a Perfect Number");
		}
	c--;
	System.out.println("----------------------------------------------------------");
	}while(c!=0);
	}
}
