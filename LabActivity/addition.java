package LabActivity;
import java.util.Scanner;


public class addition {
public static void main(String[] args) {
	System.out.println("enter two numbers:");
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 1st number:");
	int num1=scan.nextInt();
	System.out.println("enter 2nd number:");
	int num2=scan.nextInt();
	int sum=num1+num2;
	System.out.println("the addition of the two numbers is:"+sum);
	
}
}
