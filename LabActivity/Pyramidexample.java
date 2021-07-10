package LabActivity;

import java.util.Scanner;

public class Pyramidexample {
public static void main(String[] args) {
	System.out.println("input the size of pyramid");
	Scanner scan=new Scanner(System.in);
	int s=scan.nextInt();
	for(int i=1;i<=s;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
		continue;
	}
	System.out.println("-------------------");
	for(int k=1;k<=s;k++){
		for(int l=s;l>=k;l--){
			System.out.print("*");
	}
	System.out.println();
	}
}
}

