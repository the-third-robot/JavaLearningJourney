package arrays;

import java.util.Scanner;

public class MatrixAdditionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Please enter the number of rows required : ");
		int rows = sc.nextInt();
		System.out.println();
		
		System.out.print("Please enter the number of columns required : ");
		int columns = sc.nextInt();
		System.out.println();
		
		System.out.println("Matrix a and matrix b both will have " + rows + " rows and " + columns + " columns.");
		
		int a[][] = new int [rows][columns];
		int b[][] = new int [rows][columns];
		
		System.out.println();
		System.out.println("Enter the values in Matrix a ");
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Enter the values in Matrix b ");
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				b[i][j] = sc.nextInt();
			}
		}
		
		int c [][] = new int [rows][columns];
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				c[i][j] = a [i][j] + b [i][j];
			}
		}
		
		System.out.println();
		System.out.println("Matrix a + Matrix b = ");
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				System.out.print(c[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
