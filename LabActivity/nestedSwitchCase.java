package LabActivity;

import java.util.Scanner;

public class nestedSwitchCase {
public static void main(String[] args) {
	System.out.println("ENTER COURSE CODE(1-3)");
	Scanner scan=new Scanner(System.in);
	int  course=scan.nextInt();
	System.out.println("ENTER TOPIC CODE(1-2)");
	int  topic=scan.nextInt();
	switch (course) {
	case 1:
		System.out.println("You selected MECHANICAL ENGINEERING");
		switch (topic) {
		case 1:
			System.out.println("topic is STRENGTH OF MATERIAL");
			break;
		case 2:
			System.out.println("topic is FLUID MECHANICS");
			break;
		default:
			System.out.println("invalid topic");
			break;
		}
		break;
	case 2:
		System.out.println("You selected AUTOMOBILE  ENGINEERING");
		switch (topic) {
		case 1:
			System.out.println("topic is GEARS DESIGN");
			break;
		case 2:
			System.out.println("topic is ENGINE DESIGN");
			break;
		default:
			System.out.println("invalid topic");
			break;
		}
		break;
	case 3:
		System.out.println("You selected COMPUTER ENGINEERING");
		switch (topic) {
		case 1:
			System.out.println("topic is DATABASE MANAGEMENT");
			break;
		case 2:
			System.out.println("topic is CYBER SECURITY");
			break;
		default:
			System.out.println("invalid topic");
			break;
		}
		break;
	default:
		System.out.println("invalid entry");
		break;
	}
	
}
}
