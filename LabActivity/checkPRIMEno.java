package LabActivity;

import java.util.Scanner;

public class checkPRIMEno {
public static void main(String[] args) {
	System.out.println("Enter any number:");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
    boolean prime = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        prime= true;
        break;
      }
    }

    if (!prime)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
		
}
}
