package LabActivity;

import java.util.Scanner;

public class areaRectangale {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length of rectangale:");
	double  l=scan.nextDouble();
	System.out.println("Enter width of rectangale:");
	double  b=scan.nextDouble();
	double a=l*b;
	System.out.println("The Area is :  "+a);
}
}
