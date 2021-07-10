package LabActivity;

import java.util.Scanner;

public class areaTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter height  of  triangle:");
		double  h=scan.nextDouble();
		System.out.println("Enter base width of tringle:");
		double  b=scan.nextDouble();
		double a=(h*b)/2;
		System.out.println("The Area is :  "+a);
	}
}
