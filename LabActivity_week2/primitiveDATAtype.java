package LabActivity_week2;

public class primitiveDATAtype {
	public static void main(String[] args) {
		//compatible types
		
		byte b=127;
		short s=b;
		int i=s;
		long l=i;
		
		l=257;//re initialize the long variable
		System.out.println("long value..:"+l);
		i=(int)l;//converting the 64 bit to 32
		System.out.println("int value..:"+i);
		s=(short)i;
		System.out.println("short value..:"+s);
		b=(byte)s;
		System.out.println("byte value..:"+b);	
		
		//auto promotion
		byte mybite1=120;
		byte mybite2=2;
		byte result=(byte)(mybite1*mybite2);//when two bytes are multiplied then the result will be int (auto promotion)
		System.out.println(result);
		int myint=mybite1*mybite2;
		System.out.println(myint);
		
		double d=23.45;//64 bit
		float myf=(float)d;//32 bit
		System.out.println(myf);
		
		char ch='a';//number type
		byte myfloat=(byte)ch;
		System.out.println(myfloat);
		
		short myshortch=64;
		char ccc=(char)myshortch;
		System.out.println(ccc);
	}
}

