package LabActivity_week2;

import java.util.Scanner;

public class PrimeNumbers {
//a) To generate a Prime number list between 1 to 100
	public static void main(String[] args) {
		System.out.println("Enter the number till which prime numbers is to be printed  : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
     String prime=" ";
     int c2=0;
     for(int i=1;i<=n;i++){
    	 int counter=0;
    	 for(int j=i;j>=1;j--){
    		 if(i%j==0){
    			 counter=counter+1;
    		 }
    	 }
                 if(counter==2){
                 prime=prime+i+" ";
                 c2++;
     }
     }
     System.out.println("prime no. are:");
     System.out.println(prime);
     System.out.println("no of prime no.are   :"+c2);
     }
}
