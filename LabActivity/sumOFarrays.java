package LabActivity;

public class sumOFarrays {
public static void main(String[] args) {
	int[] array={10,20,30,40,50,10};
	int sum=0;
	int l=array.length;
	System.out.println("the length of  array is ="+l);
	for(int num:array)
	{
	sum=sum+num;
	}
System.out.println("sum of array is   :  "+sum);
}
}
