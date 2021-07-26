package LabActivity_week2;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.print("Enter the number of elements in the Array :   ");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		
		System.out.println("-------------------------------------------------------------");
		//array input
		int ary[]=new int[N];
		for(int i=0;i<N;i++){
			System.out.print("Enter "+(i+1)+" value.......:  ");
			ary[i]=scan.nextInt();
		}
		System.out.println("-------------------------------------------------------------");
		System.out.print("Entered  Array :");
		for (int x : ary) {
			System.out.print(x+"   ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
	int  temp;
	for(int i=0; i<ary.length;i++) {
		for(int j =i+1;j<ary.length;j++) {
			temp=ary[i];
			ary[i]=ary[j];
			ary[j]=temp;
		
		}
	}
	System.out.print("Reversed Array :");
	for (int x : ary) {
		System.out.print(x+"   ");
	}
	System.out.println();
	System.out.println("-------------------------------------------------------------");
}
}
