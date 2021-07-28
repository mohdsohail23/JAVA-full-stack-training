package LabActivity_week2;

import java.util.Scanner;

public class Rev_2Darray {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the no. of rows  : ");
		int a=scan.nextInt();
		System.out.print("Enter the no. of column  : ");
		int b=scan.nextInt();
		System.out.println("------------------------------------");
		System.out.println("Please enter the elements of ("+a+" x "+b+") Matrix");
		System.out.println("------------------------------------");
		int matrix[][]=new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("Enter value at ("+i+","+j+")  :  ");
				matrix[i][j]=scan.nextInt();
			}
			System.out.println(".................................");
		}
		System.out.println("Entered ("+a+" x "+b+") Matrix is: ");
		System.out.println("------------------------------------");
		for (int o[]: matrix) {
			for (int k : o) {
				System.out.print(k+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
		//reversing elements in each rows
		int temp=0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b/2; j++) {
				temp=matrix[i][j];
				matrix[i][j]=matrix[i][b-1-j];
				matrix[i][b-1-j]=temp;
			}
		}
		System.out.println("Matrix after performing reverse of every row  : ");
		for (int ok[]: matrix) {
			for (int k : ok) {
				System.out.print(k+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
	}
}
