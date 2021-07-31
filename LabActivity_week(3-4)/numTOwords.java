package LabActivity_week2;

import java.util.Scanner;

public class numTOwords {
	 public static void main(String [] args){
         Scanner scan=new Scanner(System.in);
     System.out.println("ENTER ANY NUMBER:");
    int input=scan.nextInt();
    int c=0,num1=input;
    while(input!=0){   
               input=input/10;
                c++;
     }
     int[] arr=new int[c];
   for(int i=0;i<=c-1;i++){
    int j=c-i-1;
	arr[j]=num1%10;
    num1=num1/10;
    }
    String num=" ";
    for(int i=0;i<arr.length;i++){
             switch(arr[i]){
                   case 1:
                  num=num+"one ";
                   break;
                    case 2:
                   num=num+"two ";
                    break;
                    case 3:
                   num=num+"three ";
                     break;
                    case 4:
                    num=num+"four ";
                     break;
                     case 5:
                     num=num+"five ";
                     break;
                     case 6:
                      num=num+"six ";
                       break; 
                     case 7:
                      num=num+"seven ";
                      break;
                      case 8:
                      num=num+"eight ";
                       break;
                      case 9:
                      num=num+"nine  ";
                       break;
             }
     }
  System.out.println("OUTPUT:"+num);
}
}
