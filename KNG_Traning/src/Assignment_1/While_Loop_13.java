package Assignment_1;

import java.util.Scanner;

public class While_Loop_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum = 0; 
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Please Enter any integer Value below 10: "); 
		 number = sc.nextInt(); 
		 
		 while (number <= 10) { 
		 sum = sum + number; 
		 number++; 
		 } 
		 System.out.format(" Sum of the Numbers From the While Loop is: %d ", 
		sum);
	}

}
