package LabActivity_week2;

public class rect2D_Q11 {
	public static void main(String[] args) {
		int a=4,z=1;
		int matrix[][]=new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				matrix[i][j]=z;
				z++;
			}
		}
		System.out.println("Entered ("+a+" x "+a+") Matrix is: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
	}
}
