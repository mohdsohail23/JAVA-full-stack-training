package LabActivity;
import java.util.Scanner;


public class quotientandreminder {
public static void main(String[] args) {
	Scanner div=new Scanner(System.in);
	System.out.println("Enter divident: ");
	float divident=div.nextFloat();
	System.out.println("Enter divisor: ");
	float divisor=div.nextFloat();
	float quotient=divident/divisor;
	float reminder=divident%divisor;
	System.out.println("Quotient: "+quotient);
	System.out.println("Reminder: "+reminder);
	
}
}
