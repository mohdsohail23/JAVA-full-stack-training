package Day_6;

public class Revision_of_Day4 {
	
	public static void main(String[] args) {
		//valid identifier concept
		int _age;
		int $age;
		int a2ge;
		int a_2_$_e;
		//invalid
		//int #age; // special character accepted is $ -
		//int 2age; //cannot start with a number
		//int static;//cannot use java keywords
		//int a g e;//cannot have space
		
		//DECLARATION AND INITIALIZATION
		
		byte b=100;//8 bit
		short s=b;//16 bit
		int i=s;//32 bit
		long l=i;//64 bit
		
		//REVERSE - number casting
		long ll=100;
		int ii=(int)ll;//it will convert ll from 64 bit to 32 bit
		short ss=(short)ii;//will convert ii from 32 bit to 16 bit
		byte bb=(byte)ss;//will convert ss from 16 bit to 8 bit
		
		//for a value higher than 127
		long lll=257;
		System.out.println(lll);
		int iii=(int)lll;//it will convert ll from 64 bit to 32 bit
		System.out.println(iii);
		short sss=(short)iii;//will convert ii from 32 bit to 16 bit
		System.out.println(sss);
		byte bbb=(byte)sss;//will convert ss from 16 bit to 8 bit range - -128 to 127
		//java will divide the value by 256 and the reminder is allocated
		System.out.println(bbb);//1 - you loose the precision
		
		//FLOAT
		double d=23.45;//64 bit
		System.out.println(d);
		float f=(float)d;//32 bit
		System.out.println(f);
		
		int n=(int)f;//int cannot hold decimal values..
		System.out.println(n);
		
		//CHARACTER
		int myascii=97;
		char ch=(char)myascii;
		System.out.println(ch);
		
		char mychar='a';
		int mycharascii=(int)mychar;
		System.out.println(mycharascii);
	}
	
}
