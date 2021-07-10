package LabActivity;

import java.util.Scanner;

public class floydTriangle {
public static void main(String[] args) {
	int rows,number=1,counter,j;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the no. of  rows:");
	rows=input.nextInt();
	System.out.println("------FLOYD_TRIANGLE------");
	for(counter=1;counter<=rows;counter++){
		for(j=1;j<=counter;j++){
			System.out.print(number+" ");
			number++;
		}
		System.out.println();
	}
		
}
}
