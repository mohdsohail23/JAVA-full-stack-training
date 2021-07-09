package LabActivity;
import java.util.Scanner;


public class typecasting {
public static void main(String[] args) {
	System.out.println("enter any byte value(-127 to 127) to be typecasted");
	Scanner b=new Scanner(System.in);
	byte b1=b.nextByte();
	int in=b1;
	System.out.println("the entererd byte is  stored in a int variable="+in);
	byte b2=(byte)in;
	System.out.println("the typecasted value from int to byte is:"+b2);
}
}
