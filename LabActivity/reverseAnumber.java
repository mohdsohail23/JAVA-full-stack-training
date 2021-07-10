package LabActivity;

import java.util.Scanner;

public class reverseAnumber {
public static void main(String[] args) {
	System.out.println("Enter any number to be reversed:");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int  rev=0;
	while(num!=0){
		rev=rev*10;
		rev=rev+num%10;
		num=num/10;
	}
	System.out.println("Reverse number is:");
	System.out.println(rev);
}
}
