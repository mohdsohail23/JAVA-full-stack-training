package Datatype1;

public class Castingdemo {

	public static void main(String[] args) {
		 {
				byte x=10;
				
				byte y=5;
				
				//byte z=x*y;//the result of a arithmetic operation will be always int
				
				int z=x*y;//automatic type promotion of byte to int
				
				int a=z;//byte is a smaller data type compared to int, so byte can be stored in int but the other way is not possible
				
				//byte by=a;//smaller data type cannot store higher datatype
				
				//but if u want to achieve that , u can do type casting
				
				byte by=(byte)a;// typecasting
				
				System.out.println(by);
				
				int myint=257;
				
				byte mybyte=(byte)myint;//java will divide the number by 256 and reminder will be assigned to the left hand side variable
				
				System.out.println(mybyte);
				
				float myfloat=100.234f;
				
				myint=(int)myfloat;// this casting will also make the myfloat value loose its precision, by dropping the decimals...
				
				System.out.println(myint);
				
				char c='a';
				
				myint=(int)c;
				
				System.out.println(myint);
				
				myint=1688;
				
				System.out.println((char)myint);
			}
		}
}