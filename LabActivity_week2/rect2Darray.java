package LabActivity_week2;

public class rect2Darray {
public static void main(String[] args) {
	int a=4,b=4,z=1;
	int matrix[][]=new int[a][b];
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b; j++) {
			matrix[i][j]=z;
			z++;
		}
	}
	System.out.println("Entered ("+a+" x "+b+") Matrix is: ");
	System.out.println("------------------------------------");
	for (int o[]: matrix) {
		for (int e : o) {
			System.out.print(e+"\t");
		}
		System.out.println(" ");
	}
	System.out.println("------------------------------------");
}
}
