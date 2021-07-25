package LabActivity_week2;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number to check  its armstrong or not:");
		int  num=scan.nextInt();
		int num1=num;
		int num2=num;
		int c=0;
		while (num!=0) {
			num=num/10;
			c++;
		}
		int[] arr=new int[c];
		for(int i=0;i<=c-1;i++){
			arr[i]=num1%10;
			num1=num1/10;
		}
		int  x=0;
		for(int i=0;i<=c-1;i++){
			x+=arr[i]*arr[i]*arr[i];
		}
		System.out.println(x);
		if(x==num2){
			System.out.println("!!!!!!!....The given number is an Armstrong Number....!!!!!!!");
		}else{
			System.out.println("xxxxxx....The given number is NOT an Armstrong Number....xxxxxx");
		}
	 }
}
