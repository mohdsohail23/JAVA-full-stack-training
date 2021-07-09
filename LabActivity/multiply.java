package LabActivity;
import java.util.Scanner;


public class multiply {
public static void main(String[] args) {
	System.out.println("........enter two numbers.......");
	Scanner scan1=new Scanner(System.in);
	System.out.println("enter 1st number:");
	int numb1=scan1.nextInt();
	System.out.println("enter 2nd number:");
	int numb2=scan1.nextInt();
	int mul=numb1*numb2;
	System.out.println("the multiplication of the two numbers is:"+mul);
	
}
}