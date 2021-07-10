package LabActivity;

import java.util.Scanner;

public class areaSquare {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter side of Square:");
		double  s=scan.nextDouble();
		double a=s*s;
		System.out.println("The Area is :  "+a);
	}
}
