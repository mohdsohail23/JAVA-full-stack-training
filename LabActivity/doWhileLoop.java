package LabActivity;

import java.util.Scanner;

public class doWhileLoop {
public static void main(String[] args) {
	System.out.println("ENTER A POSITIVE NUMBER TO PRINT ITS  ADDITION:  ");
	Scanner scan=new  Scanner(System.in);
	int no=scan.nextInt();
	int sum=0;
	int a=0;
	do {
		sum=no+sum;
		no--;
		a++;
	} while (no>0);
	System.out.println("THE ADDITON OF "+a+" IS:");
	
	for(int i=a;i>=0;i--){
		System.out.print(i);
		if(i>0)
			System.out.print(" + ");
		    continue;
	}
	System.out.println("    ");
	System.out.println("= "+sum);
}
}
