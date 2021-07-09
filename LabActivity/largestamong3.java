package LabActivity;
import java.util.Scanner;


public class largestamong3 {
public static void main(String[] args) {
	System.out.println("enter 3 numbers:");
	Scanner input=new Scanner(System.in);
	float n1=input.nextFloat();
	float n2=input.nextFloat();
	float n3=input.nextFloat();
	if(n1>n2&&n1>n3) 
		System.out.println("the largest number is: "+n1);
	else if(n2>n1&&n2>n3)
        System.out.println("the largest number is: "+n2);
	else
		System.out.println("the largest number is: "+n3);
	
}
}
