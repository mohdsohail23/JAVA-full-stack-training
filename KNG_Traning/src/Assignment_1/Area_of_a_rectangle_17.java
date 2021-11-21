package Assignment_1;

import java.util.Scanner;

public class Area_of_a_rectangle_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		 System.out.println("Enter the length of Rectangle:"); 
		 double length = scanner.nextDouble(); 
		 System.out.println("Enter the width of Rectangle:"); 
		 double width = scanner.nextDouble(); 
		 //Area = length*width;
		double area = length*width; 
		 System.out.println("Area of Rectangle is:"+area);
	}

}
