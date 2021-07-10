package LabActivity;

import java.util.Scanner;

public class areaCircle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		double  r=scan.nextDouble();
		double a=r*r*Math.PI;
		System.out.println("The Area is :  "+a);
		System.out.println("The circumference is :  "+(Math.PI*r*2));
	}
}
