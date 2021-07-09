package LabActivity;
import java.util.Scanner;


public class vowelornot {
public static void main(String[] args) {
	Scanner scanC=new Scanner(System.in);
	System.out.println("enter any alphabet to determine wether its vowel or consonant");
	char v_c=scanC.next().charAt(0);
	if (v_c=='a'||v_c=='e'||v_c=='i'||v_c=='o'||v_c=='u')
	    System.out.println(v_c+"   is a VOWEL");
	else
		System.out.println(v_c+"   is a CONSONANT");
}
}
