package LabActivity;
import java.util.Scanner;


public class oddoreven {
public static void main(String[] args) {
	System.out.println("Enter a number to check it is odd or even:");
	Scanner OE=new  Scanner(System.in);
	int O_E=OE.nextInt();
	System.out.println((O_E%2==0)?"ITS A EVEN NUMBER":"ITS AN ODD NUMBER");
}
}
