package LabActivity_week2;

public class PrimitiveDATAtype_Typecasting {
	public static void main(String[] args) {
			//valid identifiers
			int age=20;
			int _age=1;
			int $age=3;
			int _2a$e=9;
			int a2_$e=9;
			System.out.println(age+_age+$age+_2a$e+a2_$e);
			
			//initialization
			long l1=233323;//64 bit
			int i1=3434;//32 bit
			short s1=32767;//size is 16 bit and range is -32768 to 32767
			byte b1=127;//size is 8 bit and range is -128 to 127
			double d=234.56;//64 bit
			float myfloat=344.455f;//32 bit
			System.out.println(l1+i1+s1+b1+d+myfloat);
			char c='h';
			System.out.println(c);
			boolean boo=true;
			boolean boo2=false;
			System.out.println(boo);
			System.out.println(boo2);
		
		//TYPE CASTING
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
		
		double d1=23.45;//64 bit
		float myf=(float)d1;//32 bit
		System.out.println(myf);
		
		char ch='a';//number type
		byte myfloat1=(byte)ch;
		System.out.println(myfloat1);
		
		short myshortch=64;
		char ccc=(char)myshortch;
		System.out.println(ccc);
	}
}

