package lab_activity;

import java.util.Scanner;

public class Investment {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the years of investment  :  ");
	int year=scan.nextInt();
	int x=0;
	System.out.print("Enter the investment amount :  ");
	float inv=scan.nextFloat();
	operation OP=new operation();
	OP.setinvest(inv);
	do {
		x++;
		System.out.println("----------------------------------------");
		System.out.println("      YEAR "+x);
		year--;
		System.out.println("----------------------------------------");
	System.out.print("press 1 for profit    /   ");
	System.out.println("press 2 for loss ");
	int in=scan.nextInt();
	System.out.println("----------------------------------------");

	
	float z=0;
	if(in==1) {
		System.out.print("profit % =  ");
		float pro=scan.nextFloat();
		 z=OP.profit(pro);
		System.out.println(z);
		System.out.println("");
	}else if(in==2) {
		System.out.print("loss amount =  ");
		float los=scan.nextFloat();
		 z=OP.loss(los);
		System.out.println(z);
		System.out.println("");
	}else {
		System.out.println("invalid entry");
	}
	OP.setinvest(z);
	}while(year!=0);
	scan.close();
}
}
class operation{
	float i;
	public void setinvest(float i) {
		this.i=i;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Amount="+i);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	}
	public float profit(float n) {
		float fa=i+(n/100)*i;
		return fa;
	}
	public float loss(float n) {
		float fa=i-n;
		return fa;
	}
}
