package LabActivity_week2;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		System.out.print("Enter the number of elements in the Array :   ");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		
		System.out.println("-------------------------------");
		//array input
		float ary[]=new float[N];
		for(int i=0;i<N;i++){
			System.out.print("Enter "+(i+1)+" value.......:  ");
			ary[i]=scan.nextFloat();
		}
		//object creation.....
		operation A=new operation();
		int c=2;
		//using do while to execute 2 times.....
		do{
			System.out.println("-------------------------------");
		System.out.println("SELECT \"1\" FOR ASCENDING ORDER");
		System.out.println("SELECT \"2\" FOR DECENDING ORDER");
		int inp=scan.nextInt();
		System.out.println("-------------------------------");
		if(inp==1){
		System.out.println("ASCENDING ORDER IS:");
		float[] z=A.ascend(ary);
		for (float i:z){ 
		   System.out.print(i+"\t");
	         }
		System.out.println(" ");
		}
		else if(inp==2){
		System.out.println("DECENDING ORDER IS:");
		float[] x=A.decend(ary);
		for (float i:x){
		   System.out.print(i+"\t");
	         }
		System.out.println(" ");
		}
		c--;
      }while(c!=0);
}
}
class operation{
		 public float[] ascend(float[] arr){
			 float temp=0;
			 int n=arr.length;
				for(int i=0;i<n;i++){
					for(int j=0;j<=n-1;j++){
						if(arr[i]<arr[j]){
							temp=arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}
					}
				}
			 return arr;
		 }
		 public float[] decend(float[] arr1){
			 float temp=0;
			 int n=arr1.length;
				for(int i=0;i<n;i++){
					for(int j=0;j<=n-1;j++){
						if(arr1[i]>arr1[j]){
							temp=arr1[j];
							arr1[j]=arr1[i];
							arr1[i]=temp;
						}
					}
				}
			 return arr1;
		 }
	}

