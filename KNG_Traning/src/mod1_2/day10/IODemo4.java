package mod1_2.day10;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
public class IODemo4 {
	public static void main(String[] args)throws Exception {
		String str="jack &copy; and &cop jill went up the hill...";
		ByteArrayInputStream bas=new ByteArrayInputStream(str.getBytes());
		BufferedInputStream bis=new BufferedInputStream(bas);
		
		int i=0;boolean flag=false;boolean mark=false;
		while((i=bis.read())!=-1) {
			switch((char)i) {
			case '&':{
				flag=true;
				bis.mark(32);
				mark=true;
				break;
			}
			case ';':{
				if(flag) {
					System.out.print((char)169);
					flag=false;
					mark=false;
				}
				break;
			}
			case ' ':{
				if(mark) {
					bis.reset();
					System.out.print("&");
					mark=false;
					flag=false;
				}
				else {
					System.out.print(" ");
				}
				break;
			}
			default:{
				if(!flag) {
					System.out.print((char)i);
				}
			}
			}
			
		}
		
	}
}