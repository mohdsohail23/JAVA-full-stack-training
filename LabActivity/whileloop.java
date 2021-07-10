package LabActivity;
import java.util.Scanner;


public class whileloop {
public static void main(String[] args) {
	System.out.println("enter  any number to find its factorial");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int x=num;
	int fact=1;
	while(num>0){
		fact=num*fact;
	    num--;
	}
	System.out.println("factorial of "+x+"  is "+fact);
}
}
