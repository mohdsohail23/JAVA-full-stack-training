package LabActivity_week2;

import java.util.Scanner;

public class LargestN_2Darray {
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
			//finding  largest element in each row
			int temp;
			for (int i = 0; i < a; i++) {
				temp=matrix[i][0];
				for (int j = 0; j < b; j++) {
					for(int k=j+1;k<b;k++){
					    if(matrix[i][k]>matrix[i][j]&&matrix[i][k]>=temp){
						    temp=matrix[i][k];
					    }
					}
				}
				System.out.println("largest number in row "+(i+1)+"  is :  "+temp);
			}
			System.out.println("------------------------------------");
}
}