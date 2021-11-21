package mod1_2.day10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;




public class IODemo5 {
	public static void main(String[] args) throws Exception{
		BufferedInputStream bis=new BufferedInputStream(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a character...:");
		int i=bis.read();//this accepts an integer..
		System.out.println((char)i);
		
		System.out.println("Please enter your comment..:");
		String str=br.readLine();//this can accept a string
		System.out.println(str);
		
		PrintStream out=new PrintStream(System.out);
		out.println("hello world.....");
				
		PrintWriter outC=new PrintWriter(System.out,true);
		outC.println("hai and hello world...");
	}
}

