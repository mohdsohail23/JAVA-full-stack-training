package hit.mod1.level2.day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
public class IOFileHandlingInternationalized {
	public static void main(String[] args) throws Exception{
		BufferedReader in=new BufferedReader
			(new InputStreamReader
					(new FileInputStream
							("dictionary_hi.properties"),Charset.forName("UTF-8")));
		
		
		BufferedWriter out=new BufferedWriter
			(new OutputStreamWriter
					(new FileOutputStream
							("dictcopy_hi.properties"),Charset.forName("UTF-8")));
		
		int n=0;
		char c[]=new char[8];
		while((n=in.read(c))!=-1) {
			String s=new String(c,0,n);
			System.out.println(s);
			out.write(c,0,n);
		}
		out.close();
		
	}
}