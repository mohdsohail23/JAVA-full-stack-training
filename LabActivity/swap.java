package LabActivity;
import java.util.Scanner;


public class swap {
public static void main(String[] args) {
	System.out.println("......This is swap progam........");
	Scanner swap=new Scanner(System.in);
	System.out.println("Enter value of A= ");
	int A=swap.nextInt();
	System.out.println("Enter value of B= ");
	int B=swap.nextInt();
	int temp=A;
	A=B;
	B=temp;
	System.out.println("********************************");
	System.out.println("earlier value of A was...."+B);
	System.out.println("earlier value of B was...."+A);
	System.out.println("********************************");
	System.out.println("After SWAPPING value of A is...."+A);
	System.out.println("After SWAPPING value of B is...."+B);
}
}
