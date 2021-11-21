package mod1_2.day10;

import java.io.FileReader;
import java.io.FileWriter;

public class IODemo6 {
	public static void main(String[] args)throws Exception {
		FileReader in=new FileReader("abc.txt");
		FileWriter out=new FileWriter("copy.txt");
		int i=0;
		char c[]=new char[8];
		while((i=in.read(c))!=-1) {
			String s=new String(c,0,i);
			System.out.println(s);
			out.write(c,0,i);
		}
		out.close();
		
	}
}