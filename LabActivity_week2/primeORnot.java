package LabActivity_week2;

import java.util.Scanner;

public class primeORnot {
public static void main(String[] args) {
	System.out.println("Enter number to check prime or not:");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	boolean prime=true;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			prime=false;
		    break;
	}
	if(prime==true)
	{
		System.out.println("ITS A PRIME NUMBER");
	}
    else
    {
			System.out.println("ITS A NON PRIME NUMBER");
	}
}
}
