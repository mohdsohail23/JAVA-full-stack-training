package LabActivity_week2;

import java.util.Scanner;

public class PalindromeNumber {
//b) To check given number is  palindrome or not.
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		int  num=scan.nextInt();
		int numb=num;
		int c=0;
		while (num!=0) {
			num=num/10;
			c++;
		}
		int[] arr=new int[c];
		int[] arr1=new int[c];
		for(int i=0;i<=c-1;i++){
			arr[i]=numb%10;
			numb=numb/10;
		}
		int n=c-1;
		for(int i=0;i<=n;i++){
			int temp=arr[i];
			int k=n-i;
			arr1[k]=temp;
		}
		System.out.println("-----------------------------");
		boolean boo=true;
		for(int i=0;i<=n;i++){
			if(arr[i]==arr1[i]){
				boo=true;
				continue;
			}else{
				boo=false;
				break;
			}	
		}
		if(boo==true){
			System.out.println("The number is a Palindrome");
		}else{
			System.out.println("The number is not a Palindrome");
		}
		System.out.println("-----------------------------");
	}
}
