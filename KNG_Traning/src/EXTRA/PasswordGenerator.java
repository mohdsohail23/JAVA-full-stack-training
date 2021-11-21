package learnXML;

import java.util.Random;

public class random {
	public static void main(String[] args) {
	     int len=7;
	     String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
	       +"jklmnopqrstuvwxyz!@#$%&";
	     Random rnd = new Random();
	     StringBuilder sb = new StringBuilder(len);
	     for (int i = 0; i < len; i++) {
	    	 int x=rnd.nextInt(chars.length());
	    	 System.out.println("Rand int "+x+" "+chars.charAt(x));
	         sb.append(chars.charAt(x));
	     }
	     System.out.println("char length : "+chars.length());
	    
	     System.out.println("password : "+sb.toString());
	 }
}
