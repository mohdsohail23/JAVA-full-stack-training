package LabActivity_week2;

import java.util.Scanner;

public class AverageN {
public static void main(String[] args) {
	System.out.println("enter the number of elements to calculate its  average :   ");
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	float ary[]=new float[N];
	for(int i=0;i<N;i++){
		System.out.print("Enter "+(i+1)+" value.......:  ");
		ary[i]=scan.nextFloat();
	}
	avg A=new avg();
	float average=A.AVG(ary);
	float sum=A.sum(ary);
	System.out.println("Sum of entered numbers is:  "+sum);
	System.out.println("Average of entered numbers is:  "+average);
}
}
class avg{
	public float sum(float[] array){
		   float sum=0;
		   for(float num:array)
			{
			sum=sum+num;
			}
		   return sum;
	}
	public float AVG(float[] array){
		   float sum=0;
		   for(float num:array)
			{
			sum=sum+num;
			}
		   float avg=sum/array.length;
		   return avg;
	}
}

