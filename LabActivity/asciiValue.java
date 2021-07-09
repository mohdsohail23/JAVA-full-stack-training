package LabActivity;
import java.util.Scanner;


public class asciiValue {
public static void main(String[] args) {
	Scanner ask=new Scanner(System.in);
	System.out.println("enter any alphabet to know its ASCII value:");
	char ch01=ask.next().charAt(0);
	int s=(int)ch01;
	System.out.println("THE ASCII VALUE OF "+ch01+" IS  :  "+s);
}
}
