package LabActivity;
import java.util.Scanner;


public class switchcase {
public static void main(String[] args) {
	System.out.println("ENTER A NUMBER BETWEEN 1-5 to know your lucky software:");
	Scanner scan=new Scanner(System.in);
	int  tech=scan.nextInt();
	switch (tech) {
	case 1:
		System.out.println("your lucky software is SLACK");
		break;
	case 2:
		System.out.println("your lucky software is GITHUB");
		break;
	case 3:
		System.out.println("your lucky software is ECLIPSE");
		break;
	case 4:
		System.out.println("your lucky software is FLUVID");
		break;
	case 5:
		System.out.println("your lucky software is ZOOM MEETING");
		break;
	default:
System.out.println("INVALID ENTRY....... ENTER NO BETWEEN 1-5");
		break;
	}
	
}
}
